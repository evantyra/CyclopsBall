import java.applet.*;
import java.awt.*;
import java.util.ArrayList;

public class Player2
{
    private int drawX, drawY, country, radius, stamina, radiusMod, staminaMod;
    private double x, y, vx, vy, sinX, sinY, speed, speedMod;
    private boolean expand, sprint;
    private Color c;
    private CountryInfo countryInfo;

    public Player2(int c)
    { 
        // For different skins
        country = c;
        countryInfo = new CountryInfo();

        // Stats
        radiusMod = (countryInfo.getCountryExpandRating(country) - 3) * 2;
        speedMod = (countryInfo.getCountrySpeedRating(country) - 3) * .25;
        staminaMod = (countryInfo.getCountryControlRating(country) - 3);

        // Self Explanatory
        radius = 17;

        // Position
        x = 800;
        y = 300;

        // Drawing Variables
        drawX = 800;
        drawY = 300;

        // For sprinting
        stamina = 1000;
    }

    public void move(boolean left, boolean right, boolean up, boolean down, Player1 evan)
    {
        speed = 0;
        vx = 0;
        vy = 0;

        // Expands Character
        if(expand && radius < 25 + radiusMod)
            radius++;
        else if(!expand && radius > 17)   
            radius--;

        // Moves Character
        if(radius == 17)
            speed = 5 + speedMod;
        else
            speed = 4 + speedMod;

        // Will make a sprinting character move faster
        if(sprint && radius == 17 && speed > 0 && stamina >= 4 && (up || down || left || right)){
            speed = 7 + speedMod;
            if(staminaMod < 0)
                stamina -= (8 - staminaMod);
            else
                stamina -= (8 - staminaMod*2);
        }

        // Speed calculations
        int diffX = 0;
        int diffY = 0;
        if(left)
            diffX -= 5;
        if(right)
            diffX += 5;
        if(up)
            diffY -=5;
        if(down)
            diffY += 5;

        if(diffX != 0 || diffY != 0){
            // Calculations for the actually velocities
            sinX = diffX/Math.sqrt(diffX*diffX+diffY*diffY);
            sinY = diffY/Math.sqrt(diffX*diffX+diffY*diffY);

            vx = speed*sinX;
            vy = speed*sinY;
        }

        x += vx;
        y += vy;

        // Recovers Stamina
        if(stamina < 1000 && !sprint)
            stamina += 2;

        // Keeps Player inside Stadium and out of the Goals
        if(y < 30 + radius)
            y = 30 + radius;
        else if(y > 570 - radius)
            y = 570 - radius;

        if(x < 60 + radius)
            x = 60 + radius;
        else if(x > 940 - radius)
            x = 940 - radius;

        // Draw Variables
        drawX = (int)x;
        drawY = (int)y;
    }

    public void draw(Graphics g)
    {
        // Body
        countryInfo.drawSkin(g,country,drawX,drawY,radius);

        // Eye
        g.setColor(Color.white);
        g.fillOval((int)(drawX+8*sinX-7),(int)(drawY+8*sinY-7),14,14);
        g.setColor(Color.black);
        g.drawOval((int)(drawX+8*sinX-7),(int)(drawY+8*sinY-7),14,14);
        g.fillOval((int)(drawX+9*sinX-4),(int)(drawY+9*sinY-4),8,8);
    }
    
     public void collisionDetection(Player1 evan){
        // Collision detection
        int evanX = evan.getX();
        int evanY = evan.getY();
        int dist = (int)Math.sqrt(((int)x-evanX)*((int)x-evanX)+((int)y-evanY)*((int)y-evanY));
        if(dist < evan.getRadius() + radius){
            x = evanX+(radius+evan.getRadius())*((int)x-evanX)/Math.sqrt(((int)x-evanX)*((int)x-evanX)
                    +((int)y-evanY)*((int)y-evanY));
                y = evanY+(radius+evan.getRadius())*((int)y-evanY)/Math.sqrt(((int)x-evanX)*((int)x-evanX)
                    +((int)y-evanY)*((int)y-evanY));
        }
        
        // Draw variables
        drawX = (int)x;
        drawY = (int)y;
    }
    
    public double getSpeedMod(){return speedMod;}

    public int getCountry(){return country;}

    public double getSinX() {return sinX;}

    public double getSinY() {return sinY;}

    public void setCo(int cX, int cY){x = cX; y = cY;}

    public double getSpeed() {return speed;}

    public int getStamina() {return stamina;}

    public void spaceBarTrue() {expand = true;}

    public void spaceBarFalse() {expand = false;}

    public void shiftTrue() {sprint = true;}

    public void shiftFalse() {sprint = false;}

    public boolean shift() {return sprint;}

    public boolean spaceBar() {return expand;}

    public int getX() {return (int)x;}

    public int getY() {return (int)y;}

    public double getVX() {return vx;}

    public double getVY() {return vy;}

    public int getRadius() {return radius;}
}
