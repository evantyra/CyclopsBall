import java.applet.*;
import java.awt.*;
import java.util.ArrayList;

public class Player1
{
    private int drawX, drawY, country, radius, stamina, radiusMod, staminaMod;
    private double x, y, vx, vy, sinX, sinY, speed, speedMod;
    private boolean expand, sprint;
    private CountryInfo countryInfo;
    private Color c;

    public Player1(int c)
    { 
        // Used for different Coloring
        country = c;
        countryInfo = new CountryInfo();

        // Stats
        radiusMod = (countryInfo.getCountryExpandRating(country) - 3) * 2;
        speedMod = (countryInfo.getCountrySpeedRating(country) - 3) * .25;
        staminaMod = (countryInfo.getCountryControlRating(country) - 3);

        // Size of Player
        radius = 17;

        // Position
        x = 200;
        y = 300;
        drawX = 200;
        drawY = 300;

        // Used for sprinting
        stamina = 1000;
    }

    public void move(int mouseX, int mouseY, Player2 chad)
    {
        // Makes speed variable
        speed = 0;
        vx = 0;
        vy = 0;

        // Calculates sin variables
        int diffX = mouseX - (int)x;
        int diffY = mouseY - (int)y;

        if(diffX != 0 || diffY != 0){
            int distance = (int)Math.sqrt((diffX)*(diffX)+(diffY)*(diffY));

            // Expands Character
            if(expand && radius < 25 + radiusMod)
                radius++;
            else if(!expand && radius > 17)   
                radius--;

            // Moves Character
            if(radius == 17){
                if(distance < 10)
                    speed = 0;
                else if(distance < 25)
                    speed = 2 + speedMod;
                else if(distance < 50)
                    speed = 3 + speedMod;
                else if(distance < 100)
                    speed = 4 + speedMod;
                else
                    speed = 5 + speedMod;
            }
            else{
                if(distance < 10)
                    speed = 0;
                else if(distance < 25)
                    speed = 1 + speedMod;
                else if(distance < 50)
                    speed = 2 + speedMod;
                else if(distance < 100)
                    speed = 3 + speedMod;
                else
                    speed = 4 + speedMod;
            }

            // Will make a sprinting character move faster
            if(sprint && radius == 17 && distance >= 10 && stamina >= 4){
                speed = 7 + speedMod;
                if(staminaMod < 0)
                    stamina -= (8 - staminaMod);
                else
                    stamina -= (8 - staminaMod*2);
            }

            // Calculations for the actually velocities
            sinX = diffX/Math.sqrt(diffX*diffX+diffY*diffY);
            sinY = diffY/Math.sqrt(diffX*diffX+diffY*diffY);

            vx = speed*sinX;
            vy = speed*sinY;

            x += vx;
            y += vy;
        }

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

        // Draw variables
        drawX = (int)x;
        drawY = (int)y;
    }

    public void draw(Graphics g)
    {
        // Body
        countryInfo.drawSkin(g, country, drawX, drawY, radius);

        // Eye
        g.setColor(Color.white);
        g.fillOval((int)(drawX+8*sinX-7),(int)(drawY+8*sinY-7),14,14);
        g.setColor(Color.black);
        g.drawOval((int)(drawX+8*sinX-7),(int)(drawY+8*sinY-7),14,14);
        g.fillOval((int)(drawX+9*sinX-4),(int)(drawY+9*sinY-4),8,8);
    }

    public void collisionDetection(Player2 chad){
        // Collision detection
        int evanX = chad.getX();
        int evanY = chad.getY();
        int dist = (int)Math.sqrt(((int)x-evanX)*((int)x-evanX)+((int)y-evanY)*((int)y-evanY));
        if(dist < chad.getRadius() + radius){
            x = evanX+(radius+chad.getRadius())*((int)x-evanX)/Math.sqrt(((int)x-evanX)*((int)x-evanX)
                +((int)y-evanY)*((int)y-evanY));
            y = evanY+(radius+chad.getRadius())*((int)y-evanY)/Math.sqrt(((int)x-evanX)*((int)x-evanX)
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

    public void leftClickTrue() {expand = true;}

    public void leftClickFalse() {expand = false;}

    public void rightClickTrue() {sprint = true;}

    public void rightClickFalse() {sprint = false;}

    public boolean rightClick() {return sprint;}

    public boolean leftClick() {return expand;}

    public int getX() {return (int)x;}

    public int getY() {return (int)y;}

    public double getVX() {return vx;}

    public double getVY() {return vy;}

    public int getRadius() {return radius;}
}
