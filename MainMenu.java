import java.awt.*;

public class MainMenu
{
    private Button[] buttons;
    private int x, y, width, height, rowIndex, gameState, ty, tx, chadCountry, evanCountry, radius;
    private CountryInfo countryInfo;
    private String enemyString, playerString;
    private boolean leftClick;
    private Color c;

    public MainMenu(int xx, int yy, int w, int h, int cC, int eC){
        x = xx;
        y = yy;
        tx = 350;
        ty = 90;
        radius = 20;
        width = w;
        height = h;
        rowIndex = 1;
        buttons = new Button[4];
        buttonAdder();
        countryInfo = new CountryInfo();
        chadCountry = cC;
        evanCountry = eC;
    }

    public void buttonAdder(){
        Button button = new Button(275,400,75,75,0);
        buttons[0] = button;

        button = new Button(400,400,75,75,1);
        buttons[1] = button;

        button = new Button(525,400,75,75,2);
        buttons[2] = button;

        button = new Button(650,400,75,75,0);
        buttons[3] = button;
    }

    public void mover(boolean up, boolean down, boolean left, boolean right, boolean enter, int mouseX, int mouseY){
        if(rowIndex == 0){
            if(down)
                minusEvan();
            if(up)
                plusEvan();
        }
        else if(rowIndex == 3){
            if(down)
                minusChad();
            if(up)
                plusChad();
        }
        if(right){
            rowIndex++;
            rowIndex %= buttons.length;
        }
        if(left){
            if(rowIndex != 0)
                rowIndex--;
            else
                rowIndex = 3;
        }

        if(enter){
            gameState = buttons[rowIndex].getGameState();
        }

        for(int i = 0; i < buttons.length; i++){
            if(buttons[i].getBox().contains(mouseX,mouseY)){
                rowIndex = i;
                if(leftClick)
                    gameState = buttons[rowIndex].getGameState();
            }
        }

        leftClick = false;
    }

    public void draw(Graphics g, int eCountry, int cCountry){
        c = new Color(78,169,7);
        evanCountry = eCountry;
        chadCountry = cCountry;

        // Backgrounds for text
        g.setColor(Color.yellow);
        g.fillRect(80,75,220,100);
        g.fillRect(720,75,190,100);
        drawBorder(g,85,80,210,90);
        drawBorder(g,725,80,180,90);
        g.setColor(new Color(56,47,20));
        g.fillRect(85,330,210,65);
        g.fillRect(720,330,202,65);
        g.fillRect(280,330,450,30);
        
        // Text
        g.setColor(Color.white);

        // Evan's Instructions
        g.setColor(Color.white);
        g.drawString("Evan's Instructions",100,100);
//         g.setColor(Color.blue);
        g.drawString("Your Player moves to your Mouse",100,120);
        g.drawString("Left Click to expand",100,140);
        g.drawString("Right Click to sprint",100, 160);

        // Chad's Instructions
//         g.setColor(Color.blue);
        g.drawString("Chad's Instructions",740,100);
//         g.setColor(Color.red);
        g.drawString("Arrow Keys or WASD to Move",740,120);
        g.drawString("Space Bar to expand",740,140);
        g.drawString("Shift to sprint",740, 160);

        // Hints
        g.setColor(Color.orange);
        g.drawString("If you want to be teams other than Ireland and USA at Start press 'New Game'",300,350);
        g.drawString("Sprinting takes stamina",100,350);
        g.drawString("If you hit the ball while sprinting",100,370);
        g.drawString("The ball will move a little farther",100,390);
        g.drawString("Expanding slows you down",740,350);
        g.drawString("If you hit the ball while expanded",740,370);
        g.drawString("The ball will move much farther",740,390);

        // Draws the buttons
        g.setColor(new Color(163,130,59));
        g.fillRect(275,400,75,75);
        g.fillRect(650,400,75,75);
        g.setColor(Color.black);
        g.drawRect(275,400,75,75);
        g.drawRect(650,400,75,75);
        buttons[rowIndex].draw(g);

        // Play Button
        drawArrow(g);

        // Restart Button
        drawRestartArrow(g);

        // Draws countries
        countryInfo.drawCountry(g,evanCountry,282,407);
        countryInfo.drawCountry(g,chadCountry,657,407);

        // Text for countries
        playerString = countryInfo.chooseCountry(evanCountry);
        enemyString = countryInfo.chooseCountry(chadCountry);

        // Stats for Evans's Country
        g.setColor(Color.blue);
        g.drawString("Expand :",115,420);
        g.drawString("Speed :",120, 445);
        g.drawString("Endurance :",96,470);
        countryInfo.drawStats(g,countryInfo.getCountryExpandRating(evanCountry),170,410);
        countryInfo.drawStats(g,countryInfo.getCountrySpeedRating(evanCountry),170,435);
        countryInfo.drawStats(g,countryInfo.getCountryControlRating(evanCountry),170,460);

        // Stats for Chad's Country
        g.setColor(Color.blue);
        g.drawString("Expand :",750,420);
        g.drawString("Speed :",755, 445);
        g.drawString("Endurance :",731,470);
        countryInfo.drawStats(g,countryInfo.getCountryExpandRating(chadCountry),805,410);
        countryInfo.drawStats(g,countryInfo.getCountrySpeedRating(chadCountry),805,435);
        countryInfo.drawStats(g,countryInfo.getCountryControlRating(chadCountry),805,460);

        // Text
        g.setColor(Color.white);
        g.drawString("Play",425,500);
        g.drawString("New Game",535,500);
        g.drawString("Evan's Country",271,530);
        g.drawString("Chad's Country",646,530);
        g.drawString(playerString,300,472);
        g.drawString(enemyString,675,472);

        drawTitle(g);
    }

    public void drawTitle(Graphics g){
        g.setColor(Color.red);
        int[] cX = {tx,tx+40,tx+40,tx+20,tx+20,tx+40,tx+40,tx};
        int[] cY = {ty,ty,ty+20,ty+20,ty+40,ty+40,ty+60,ty+60};
        g.fillPolygon(cX,cY,8);

        int[] yX = {tx+50,tx+60,tx+60,tx+80,tx+80,tx+90,tx+90,tx+50,tx+50,tx+80,tx+80,tx+50};
        int[] yY = {ty+20,ty+20,ty+50,ty+50,ty+20,ty+20,ty+100,ty+100,ty+90,ty+90,ty+60,ty+60};
        g.fillPolygon(yX,yY,12);

        int[] ccX = {tx+100,tx+130,tx+130,tx+110,tx+110,tx+130,tx+130,tx+100};
        int[] ccY = {ty+20,ty+20,ty+30,ty+30,ty+50,ty+50,ty+60,ty+60};
        g.fillPolygon(ccX,ccY,8);

        g.fillRect(tx+140,ty,10,60);

        // Character
        countryInfo.drawSkin(g, evanCountry, tx+180, ty+40, radius);

        g.setColor(Color.white);
        g.fillOval(tx+170,ty+30,20,20);
        g.setColor(Color.black);
        g.drawOval(tx+170,ty+30,20,20);
        g.fillOval(tx+175,ty+35,10,10);

        g.setColor(Color.red);
        int[] pX = {tx+210,tx+240,tx+230,tx+220,tx+220,tx+230,tx+230,tx+240,tx+240,tx+220,tx+220,tx+210};
        int[] pY = {ty+20,ty+20,ty+30,ty+30,ty+50,ty+50,ty+30,ty+20,ty+60,ty+60,ty+100,ty+100};
        g.fillPolygon(pX,pY,12);

        int[] sX = {tx+250,tx+280,tx+280,tx+260,tx+260,tx+280,tx+280,tx+250,tx+250,tx+270,tx+270,tx+250};
        int[] sY = {ty+20,ty+20,ty+30,ty+30,ty+35,ty+35,ty+60,ty+60,ty+50,ty+50,ty+45,ty+45};
        g.fillPolygon(sX,sY,12);

        g.fillRect(tx+170,ty+120,40,60);
        g.setColor(new Color(78,169,7));
        g.fillRect(tx+185,ty+130,15,10);
        g.fillRect(tx+185,ty+160,15,10);

        // Character 2
        countryInfo.drawSkin(g, chadCountry, tx+240, ty+160, radius);

        g.setColor(Color.white);
        g.fillOval(tx+230,ty+150,20,20);
        g.setColor(Color.black);
        g.drawOval(tx+230,ty+150,20,20);
        g.fillOval(tx+235,ty+155,10,10);

        g.setColor(Color.red);
        g.fillRect(tx+270,ty+120,10,60);

        g.fillRect(tx+290,ty+120,10,60);

        // Outlines
        g.setColor(Color.black);
        g.drawPolygon(cX,cY,8);
        g.drawPolygon(yX,yY,12);
        g.drawPolygon(ccX,ccY,8);
        g.drawRect(tx+140,ty,10,60);
        g.drawPolygon(pX,pY,12);
        g.drawPolygon(sX,sY,12);
        g.drawRect(tx+170,ty+120,40,60);
        g.drawRect(tx+185,ty+130,15,10);
        g.drawRect(tx+185,ty+160,15,10);
        g.drawRect(tx+270,ty+120,10,60);
        g.drawRect(tx+290,ty+120,10,60);
    }

    public void drawBorder(Graphics g, int drawX, int drawY, int w, int h){
        int columns = w/30;
        int rows = h/15;
        int width = 30;
        int height = 15;
        Color c = new Color(56,47,20);
        for(int i = 0; i <= columns;i++){
            for(int k = 0; k < rows; k++){
                if(k%2 == 0){
                    if(i != columns){
                        g.setColor(c);
                        g.fillRect(drawX+i*width,drawY+k*height,width,height);
                        g.setColor(Color.black);
                        g.drawRect(drawX+i*width,drawY+k*height,width,height);
                    }
                }
                else{
                    if(i == columns){
                        g.setColor(c);
                        g.fillRect(drawX+i*width-width/2,drawY+k*height,width-width/2,height);
                        g.setColor(Color.black);
                        g.drawRect(drawX+i*width-width/2,drawY+k*height,width-width/2,height);
                    }
                    else if(i == 0){
                        g.setColor(c);
                        g.fillRect(drawX+i*width,drawY+k*height,width-width/2,height);
                        g.setColor(Color.black);
                        g.drawRect(drawX+i*width,drawY+k*height,width-width/2,height);
                    }
                    else{
                        g.setColor(c);
                        g.fillRect(drawX+i*width-width/2,drawY+k*height,width,height);
                        g.setColor(Color.black);
                        g.drawRect(drawX+i*width-width/2,drawY+k*height,width,height);
                    }
                }
            }
        }
    }

    public void plusEvan(){
        if(evanCountry != 43)
            evanCountry++;
        else
            evanCountry = 0;
    }

    public void minusEvan(){
        if(evanCountry != 0)
            evanCountry--;
        else
            evanCountry = 43;
    }

    public void plusChad(){
        if(chadCountry != 43)
            chadCountry++;
        else
            chadCountry = 0;
    }

    public void minusChad(){
        if(chadCountry != 0)
            chadCountry--;
        else
            chadCountry = 43;
    }

    public void drawArrow(Graphics g){
        int xArray[] = new int[7];
        int yArray[] = new int[7];

        int xI = 400;
        int yI = 400;
        int heightI = buttons[rowIndex].getHeight()/2;

        xArray[0] = xI+10;
        xArray[1] = xI+65;
        xArray[2] = xI+10;

        yArray[0] = yI+10;
        yArray[1] = yI+37;
        yArray[2] = yI+65;

        Polygon p = new Polygon(xArray,yArray,3);
        g.setColor(Color.red);
        g.fillPolygon(p);
        g.setColor(Color.black);
        g.drawPolygon(p);
    }

    public void drawRestartArrow(Graphics g){
        int xArray[] = new int[7];
        int yArray[] = new int[7];

        int xI = 530;
        int yI = 400;
        int heightI = buttons[rowIndex].getHeight()/2;

        xArray[0] = xI+20;
        xArray[1] = xI+65;
        xArray[2] = xI+20;

        yArray[0] = yI+10;
        yArray[1] = yI+37;
        yArray[2] = yI+65;

        Polygon p = new Polygon(xArray,yArray,3);
        g.setColor(Color.red);
        g.fillPolygon(p);
        g.setColor(Color.black);
        g.drawPolygon(p);

        g.setColor(Color.red);
        g.fillRect(xI+5,yI+10,10,55);
        g.setColor(Color.black);
        g.drawRect(xI+5,yI+10,10,55);
    }

    public void drawChangeArrows(Graphics g){
        int xArray[] = new int[7];
        int yArray[] = new int[7];

        int xI = buttons[rowIndex].getX();
        int yI = buttons[rowIndex].getY();
        int heightI = buttons[rowIndex].getHeight()/2;

        xArray[0] = xI-20;
        xArray[1] = xI-10;
        xArray[2] = xI-10;
        xArray[3] = xI;
        xArray[4] = xI-10;
        xArray[5] = xI-10;
        xArray[6] = xI-20;

        yArray[0] = yI+5+heightI;
        yArray[1] = yI+5+heightI;
        yArray[2] = yI+10+heightI;
        yArray[3] = yI+heightI;
        yArray[4] = yI-10+heightI;
        yArray[5] = yI-5+heightI;
        yArray[6] = yI-5+heightI;

        Polygon p = new Polygon(xArray,yArray,7);
        g.setColor(Color.red);
        g.fillPolygon(p);
        g.setColor(Color.black);
        g.drawPolygon(p);
    }

    public int chadCountryIndex() {return chadCountry;}

    public int evanCountryIndex() {return evanCountry;}

    public void leftClicked(){leftClick = true;}

    public int getGameState(){return gameState;}
}
