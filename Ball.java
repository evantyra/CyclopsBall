import java.applet.*;
import java.awt.*;

public class Ball{
    private int drawX, drawY, screenX, screenY, radius, directionX, directionY;
    private boolean evanGoal, chadGoal, sprintHit, expandHit;
    private double x, y, vx, vy, speed, sinX, sinY, totalSpeed;

    public Ball(){
        // Da ball radius
        radius = 8;

        // Position variables
        x = 500;
        y = 300;

        // Draw variables
        drawX = 500;
        drawY = 300;
    }

    public void move(Player1 evan, Player2 chad){
        // Reset
        chadGoal = false;
        evanGoal = false;

        speed = totalSpeed;
        int steps = 1;

        if(speed > 5){
            steps = 2;
            speed = totalSpeed/2.0;
        }

        for(int i = 0; i < steps; i++){
            // Evan Collison detection
            int evanX = evan.getX();
            int evanY = evan.getY();
            int dist = (int)Math.sqrt((drawX-evanX)*(drawX-evanX)+(drawY-evanY)*(drawY-evanY));
            if(dist < evan.getRadius() + radius){
                if(evan.rightClick()){
                    totalSpeed += evan.getSpeed() + 2;
                    sprintHit = true;
                }
                else if(evan.getRadius() == 17){
                    totalSpeed += evan.getSpeed();
                    sprintHit = false;
                    expandHit = false;
                }
                else{
                    totalSpeed += evan.getSpeed() + 2;
                    expandHit = true;
                }
                directionX = drawX - evanX;
                directionY = drawY - evanY;
                if(directionX != 0 || directionY != 0){
                    sinX = (directionX/Math.sqrt((directionX)*(directionX)+(directionY)*(directionY))
                        + evan.getSinX())/2.0;
                    sinY = (directionY/Math.sqrt((directionX)*(directionX)+(directionY)*(directionY))
                        + evan.getSinY())/2.0;
                }
            }

            // Chad Collision Detection
            int chadX = chad.getX();
            int chadY = chad.getY();
            int distC = (int)Math.sqrt((drawX-chadX)*(drawX-chadX)+(drawY-chadY)*(drawY-chadY));
            if(distC < chad.getRadius() + radius){
                if(chad.shift()){
                    totalSpeed += chad.getSpeed() + 2;
                    sprintHit = true;
                }
                else if(chad.getRadius() == 17){
                    totalSpeed += chad.getSpeed();
                    sprintHit = false;
                    expandHit = false;
                }
                else{
                    totalSpeed += chad.getSpeed() + 2;
                    expandHit = true;
                }
                directionX = drawX - chadX;
                directionY = drawY - chadY;
                if(directionX != 0 || directionY != 0){
                    sinX = (directionX/Math.sqrt((directionX)*(directionX)+(directionY)*(directionY))
                        + chad.getSinX())/2.0;
                    sinY = (directionY/Math.sqrt((directionX)*(directionX)+(directionY)*(directionY))
                        + chad.getSinY())/2.0;
                }
            }

            if(!expandHit && !sprintHit){
                if(totalSpeed > 8)
                    totalSpeed = 8;
            }
            else if(expandHit){
                if(totalSpeed > 9)
                    totalSpeed = 9;
            }
            else if(sprintHit){
                if(totalSpeed > 10)
                    totalSpeed = 10;
            }

            speed = totalSpeed / steps;
            
            // Speed Calculations
            vx = speed*sinX;
            vy = speed*sinY;

            x += vx;
            y += vy;

            // Keeps ball in stadium
            if(y < 30 + radius){
                y = 30 + radius;
                sinY = -sinY;
            }
            else if(y > 570 - radius){
                y = 570 - radius;
                sinY = -sinY;
            }

            if(x < 60 + radius && (y < 240 + radius || y > 360 - radius)){
                x = 60 + radius;
                sinX = -sinX;
            }
            else if(x > 940 - radius && (y < 240 + radius || y > 360 - radius)){
                x = 940 - radius;
                sinX = -sinX;
            }

            // Helps keep ball in the middle of the stadium
            if(y < 100 || y > 500){
                int cornerDist = (int)Math.sqrt((drawX-60)*(drawX-60)+(drawY-30)*(drawY-30));
                if(cornerDist < 45){
                    totalSpeed += .5;
                    directionX = drawX-60;
                    directionY = drawY-30;
                    if(directionX != 0 || directionY != 0){
                        sinX = directionX/Math.sqrt((directionX)*(directionX)+(directionY)*(directionY));
                        sinY = directionY/Math.sqrt((directionX)*(directionX)+(directionY)*(directionY));
                    }
                }
                cornerDist = (int)Math.sqrt((drawX-60)*(drawX-60)+(drawY-570)*(drawY-570));
                if(cornerDist < 45){
                    totalSpeed += .5;
                    directionX = drawX-60;
                    directionY = drawY-570;
                    if(directionX != 0 || directionY != 0){
                        sinX = directionX/Math.sqrt((directionX)*(directionX)+(directionY)*(directionY));
                        sinY = directionY/Math.sqrt((directionX)*(directionX)+(directionY)*(directionY));
                    }
                }
                cornerDist = (int)Math.sqrt((drawX-940)*(drawX-940)+(drawY-30)*(drawY-30));
                if(cornerDist < 45){
                    totalSpeed += .5;
                    directionX = drawX-940;
                    directionY = drawY-30;
                    if(directionX != 0 || directionY != 0){
                        sinX = directionX/Math.sqrt((directionX)*(directionX)+(directionY)*(directionY));
                        sinY = directionY/Math.sqrt((directionX)*(directionX)+(directionY)*(directionY));
                    }
                }
                cornerDist = (int)Math.sqrt((drawX-940)*(drawX-940)+(drawY-570)*(drawY-570));
                if(cornerDist < 45){
                    totalSpeed += .5;
                    directionX = drawX-940;
                    directionY = drawY-570;
                    if(directionX != 0 || directionY != 0){
                        sinX = directionX/Math.sqrt((directionX)*(directionX)+(directionY)*(directionY));
                        sinY = directionY/Math.sqrt((directionX)*(directionX)+(directionY)*(directionY));
                    }
                }
            }
        }

        totalSpeed = speed * steps;

        // Keeps speed in check
        if(!expandHit && !sprintHit){
            if(totalSpeed > 8)
                totalSpeed = 8;
            else if(totalSpeed > 0.01){
                totalSpeed -= .5;
            }
        }
        else if(expandHit){
            if(totalSpeed > 9)
                totalSpeed = 9;
            else if(totalSpeed > 0.01){
                totalSpeed -= .1;
            }
        }
        else if(sprintHit){
            if(totalSpeed > 10)
                totalSpeed = 10;
            else if(totalSpeed > 0.01){
                totalSpeed -= .25;
            }
        }
        
        if(totalSpeed < 0)
            totalSpeed = 0;

        // Updates Draw Variable
        drawX = (int)x;
        drawY = (int)y;

        // For goals
        if(x < 60 - radius && (y >= 240 + radius && y <= 360 - radius)){
            chadGoal = true;
            x = 500;
            y = 300;
        }
        else if(x > 940 + radius && (y >= 240 + radius && y <= 360 - radius)){
            evanGoal = true;
            x = 500;
            y = 300;
        }
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
        g.setColor(Color.black);
        g.drawOval(drawX-radius,drawY-radius,radius*2,radius*2);
    }

    public void resetSpeed(){totalSpeed = 0;}

    public boolean evanGOAL(){return evanGoal;}

    public boolean chadGOAL(){return chadGoal;}
}
