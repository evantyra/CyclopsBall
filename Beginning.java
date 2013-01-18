import java.awt.*;

public class Beginning
{
    private int x, y;

    public Beginning(){
        x = 500;
        y = 300;
    }

    public void drawBeginning(Graphics g, int counter){
        if(counter < 10){
            g.setColor(Color.red);
            draw3(g,10);
        }
        else if(counter < 20){
            g.setColor(Color.red);
            draw3(g,20-counter);
        }
        else if(counter < 30){
            g.setColor(Color.red);
            draw2(g,10);
        }
        else if(counter < 40){
            g.setColor(Color.red);
            draw2(g,40-counter);
        }
        else if(counter < 50){
            g.setColor(Color.red);
            draw1(g,10);
        }
        else if(counter < 60){
            g.setColor(Color.red);
            draw1(g,60-counter);
        }
        else if(counter < 70){
            g.setColor(Color.blue);
            drawGO(g,10);
        }
        else if(counter < 80){
            g.setColor(Color.blue);
            drawGO(g,80-counter);
        }
    }

    public void draw3(Graphics g, int s){
        int[] sX = {x-3*s,x+3*s,x+3*s,x-3*s,x-3*s,x+1*s,x+1*s,x-1*s,x-1*s,x+1*s,x+1*s,x-3*s};
        int[] sY = {y-4*s,y-4*s,y+4*s,y+4*s,y+2*s,y+2*s,y+1*s,y+1*s,y-1*s,y-1*s,y-2*s,y-2*s};
        g.fillPolygon(sX,sY,12);
    }

    public void draw2(Graphics g, int s){
        int[] sX = {x-3*s,x+3*s,x+3*s,x-1*s,x-1*s,x+3*s,x+3*s,x-3*s,x-3*s,x+1*s,x+1*s,x-3*s};
        int[] sY = {y-4*s,y-4*s,y+1*s,y+1*s,y+2*s,y+2*s,y+4*s,y+4*s,y-1*s,y-1*s,y-2*s,y-2*s};
        g.fillPolygon(sX,sY,12);
    }

    public void draw1(Graphics g, int s){
        int[] sX = {x-3*s,x+1*s,x+1*s,x+3*s,x+3*s,x-3*s,x-3*s,x-1*s,x-1*s,x-3*s};
        int[] sY = {y-4*s,y-4*s,y+2*s,y+2*s,y+4*s,y+4*s,y+2*s,y+2*s,y-2*s,y-2*s};
        g.fillPolygon(sX,sY,10);
    }

    public void drawGO(Graphics g, int s){
        int[] gX = {x-5*s,x-1*s,x-1*s,x-4*s,x-4*s,x-2*s,x-2*s,x-3*s,x-3*s,x-1*s,x-1*s,x-5*s};
        int[] gY = {y-3*s,y-3*s,y-2*s,y-2*s,y+2*s,y+2*s,y+1*s,y+1*s,y,y,y+3*s,y+3*s};
        g.fillPolygon(gX,gY,12);
        
        int[] oX = {x+1*s,x+5*s,x+4*s,x+2*s,x+2*s,x+4*s,x+4*s,x+5*s,x+5*s,x+1*s};
        int[] oY = {y-3*s,y-3*s,y-2*s,y-2*s,y+2*s,y+2*s,y-2*s,y-3*s,y+3*s,y+3*s};
        g.fillPolygon(oX,oY,10);
    }
}
