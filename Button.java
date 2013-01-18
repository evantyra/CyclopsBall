import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Button
{
    private int x, y, width, height, gameState;
    private boolean pressed;
    private Rectangle box;

    public Button(int xx, int yy, int w, int h, int gS){
        x = xx;
        y = yy;
        width = w;
        height = h;
        gameState = gS;
        box = new Rectangle(x,y,w,h);
    }

    public void draw(Graphics g){
        // Base of Button
        g.setColor(Color.white);
        g.drawRect(x,y,width,height);
    }

    public int getGameState(){return gameState;}
    public int getX(){return x;}
    public int getY(){return y;}
    public int getWidth(){return width;}
    public int getHeight(){return height;}
    public Rectangle getBox() {return box;}
}
