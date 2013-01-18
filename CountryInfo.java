import java.awt.*;

public class CountryInfo
{
    private int drawX, drawY, radius;

    public CountryInfo(){}

    public int getCountrySpeedRating(int country){
        if(country == 0)
            return 4;
        else if(country == 1)
            return 5;
        else if(country == 2)
            return 4;
        else if(country == 3)
            return 4;
        else if(country == 4)
            return 4;
        else if(country == 5)
            return 5;
        else if(country == 6)
            return 1;
        else if(country == 7)
            return 5;
        else if(country == 8)
            return 2;
        else if(country == 9)
            return 3;
        else if(country == 10)
            return 3;
        else if(country == 11)
            return 4;
        else if(country == 12)
            return 4;
        else if(country == 13)
            return 4;
        else if(country == 14)
            return 5;
        else if(country == 15)
            return 4;
        else if(country == 16)
            return 2;
        else if(country == 17)
            return 5;
        else if(country == 18)
            return 4;
        else if(country == 19)
            return 4;
        else if(country == 20)
            return 4;
        else if(country == 21)
            return 5;
        else if(country == 22)
            return 3;
        else if(country == 23)
            return 3;
        else if(country == 24)
            return 4;
        else if(country == 25)
            return 4;
        else if(country == 26)
            return 4;
        else if(country == 27)
            return 4;
        else if(country == 28)
            return 4;
        else if(country == 29)
            return 4;
        else if(country == 30)
            return 4;
        else if(country == 31)
            return 4;
        else if(country == 32)
            return 2;
        else if(country == 33)
            return 2;
        else if(country == 34)
            return 5;
        else if(country == 35)
            return 3;
        else if(country == 36)
            return 4;
        else if(country == 37)
            return 2;
        else if(country == 38)
            return 2;
        else if(country == 39)
            return 2;
        else if(country == 40)
            return 3;
        else if(country == 41)
            return 3;
        else if(country == 42)
            return 2;
        else if(country == 43)
            return 3;
        return 3;
    }

    public int getCountryControlRating(int country){
        if(country == 0)
            return 3;
        else if(country == 1)
            return 4;
        else if(country == 2)
            return 3;
        else if(country == 3)
            return 4;
        else if(country == 4)
            return 5;
        else if(country == 5)
            return 5;
        else if(country == 6)
            return 1;
        else if(country == 7)
            return 5;
        else if(country == 8)
            return 4;
        else if(country == 9)
            return 2;
        else if(country == 10)
            return 2;
        else if(country == 11)
            return 3;
        else if(country == 12)
            return 4;
        else if(country == 13)
            return 4;
        else if(country == 14)
            return 4;
        else if(country == 15)
            return 3;
        else if(country == 16)
            return 3;
        else if(country == 17)
            return 4;
        else if(country == 18)
            return 4;
        else if(country == 19)
            return 4;
        else if(country == 20)
            return 3;
        else if(country == 21)
            return 3;
        else if(country == 22)
            return 4;
        else if(country == 23)
            return 2;
        else if(country == 24)
            return 3;
        else if(country == 25)
            return 2;
        else if(country == 26)
            return 4;
        else if(country == 27)
            return 4;
        else if(country == 28)
            return 4;
        else if(country == 29)
            return 3;
        else if(country == 30)
            return 4;
        else if(country == 31)
            return 3;
        else if(country == 32)
            return 2;
        else if(country == 33)
            return 2;
        else if(country == 34)
            return 3;
        else if(country == 35)
            return 3;
        else if(country == 36)
            return 4;
        else if(country == 37)
            return 2;
        else if(country == 38)
            return 3;
        else if(country == 39)
            return 1;
        else if(country == 40)
            return 2;
        else if(country == 41)
            return 2;
        else if(country == 42)
            return 3;
        else if(country == 43)
            return 3;
        return 3;
    }

    public int getCountryExpandRating(int country){
        if(country == 0)
            return 2;
        else if(country == 1)
            return 3;
        else if(country == 2)
            return 2;
        else if(country == 3)
            return 4;
        else if(country == 4)
            return 4;
        else if(country == 5)
            return 4;
        else if(country == 6)
            return 1;
        else if(country == 7)
            return 5;
        else if(country == 8)
            return 3;
        else if(country == 9)
            return 3;
        else if(country == 10)
            return 3;
        else if(country == 11)
            return 2;
        else if(country == 12)
            return 4;
        else if(country == 13)
            return 3;
        else if(country == 14)
            return 4;
        else if(country == 15)
            return 3;
        else if(country == 16)
            return 2;
        else if(country == 17)
            return 3;
        else if(country == 18)
            return 2;
        else if(country == 19)
            return 4;
        else if(country == 20)
            return 3;
        else if(country == 21)
            return 4;
        else if(country == 22)
            return 4;
        else if(country == 23)
            return 2;
        else if(country == 24)
            return 2;
        else if(country == 25)
            return 2;
        else if(country == 26)
            return 4;
        else if(country == 27)
            return 5;
        else if(country == 28)
            return 3;
        else if(country == 29)
            return 4;
        else if(country == 30)
            return 3;
        else if(country == 31)
            return 4;
        else if(country == 32)
            return 3;
        else if(country == 33)
            return 2;
        else if(country == 34)
            return 4;
        else if(country == 35)
            return 2;
        else if(country == 36)
            return 3;
        else if(country == 37)
            return 1;
        else if(country == 38)
            return 3;
        else if(country == 39)
            return 2;
        else if(country == 40)
            return 2;
        else if(country == 41)
            return 2;
        else if(country == 42)
            return 3;
        else if(country == 43)
            return 3;
        return 3;
    }

    public void drawSkin(Graphics g, int country, int drawx, int drawy, int rad){
        drawX = drawx;
        drawY = drawy;
        radius = rad;

        if(country == 0){
            g.setColor(Color.white);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,0,180);
            g.setColor(Color.red);
            if(radius == 17)
                g.fillArc(drawX-radius/2-5,drawY-radius,radius*5/4+6,radius,0,180);
            else
                g.fillArc(drawX-radius/2-8,drawY-radius,radius*5/4+10,radius,0,180);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,180,180);
            g.setColor(Color.white);
            if(radius == 17)
                g.fillArc(drawX-radius/2-5,drawY,radius*5/4+6,radius,180,180);
            else
                g.fillArc(drawX-radius/2-8,drawY,radius*5/4+10,radius,180,180);
            g.setColor(Color.blue);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,90,90);
        }
        else if(country == 1)
            drawHorizontal3(g,Color.red,Color.white,Color.blue);
        else if(country == 2)
            drawHorizontal2(g,Color.white,Color.red);
        else if(country == 3)
            drawVertical3(g,Color.blue,Color.white,Color.red);
        else if(country == 4)
            drawHorizontal3(g,Color.black,Color.red,Color.yellow);
        else if(country == 5){
            g.setColor(Color.yellow);
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            g.setColor(Color.red);
            if(radius == 17)
                g.fillArc(drawX-radius/2-5,drawY-radius,radius*5/4+6,radius,0,180);
            else
                g.fillArc(drawX-radius/2-8,drawY-radius,radius*5/4+10,radius,0,180);
            if(radius == 17)
                g.fillArc(drawX-radius/2-5,drawY,radius*5/4+6,radius,180,180);
            else
                g.fillArc(drawX-radius/2-8,drawY,radius*5/4+10,radius,180,180);
            g.fillOval(drawX-radius/8*5,drawY-radius/8*3,radius/4*3,radius/4*3);
        }
        else if(country == 6)
            drawVertical3(g,new Color(0,0,195),Color.yellow,new Color(163,0,0));
        else if(country == 7){
            drawHorizontal2(g,new Color(254,221,0),Color.red);
            g.setColor(Color.black);
            g.fillArc(drawX-radius+2,drawY-radius,radius*2,radius*2,315,90);
        }
        else if(country == 8)
            drawVertical3(g,Color.black,Color.yellow,Color.red);
        else if(country == 9)
            drawHorizontal3(g,Color.red,Color.white,Color.red);
        else if(country == 10){
            g.setColor(Color.blue);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,0,180);
            g.setColor(Color.white);
            if(radius == 17)
                g.fillArc(drawX-radius/2-5,drawY-radius,radius*5/4+6,radius,0,180);
            else
                g.fillArc(drawX-radius/2-8,drawY-radius,radius*5/4+10,radius,0,180);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,180,180);
            g.setColor(Color.blue);
            if(radius == 17)
                g.fillArc(drawX-radius/2-5,drawY,radius*5/4+6,radius,180,180);
            else
                g.fillArc(drawX-radius/2-8,drawY,radius*5/4+10,radius,180,180);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,90,90);
        }
        else if(country == 11)
            drawVertical3(g,new Color(0,160,0),Color.white,new Color(228,156,0));
        else if(country == 12)
            drawHorizontal3(g,Color.white,Color.blue,Color.red);
        else if(country == 13){
            g.setColor(Color.yellow);
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            g.setColor(new Color(0,0,195));
            g.fillArc(drawX-radius,drawY-radius,radius*5/3,radius*5/3,90,90);
            g.fillArc(drawX-radius,drawY-radius*2/3,radius*5/3,radius*5/3,180,90);
            g.fillArc(drawX-radius*2/3,drawY-radius,radius*5/3,radius*5/3,0,90);
            g.fillArc(drawX-radius*2/3,drawY-radius*2/3,radius*5/3,radius*5/3,270,90);
        }
        else if(country == 14){
            g.setColor(new Color(0,120,0));
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            int[] brazilX = {drawX-radius*5/6,drawX,drawX+radius*5/6,drawX};
            int[] brazilY = {drawY,drawY+radius*2/3,drawY,drawY-radius*2/3};
            g.setColor(Color.yellow);
            g.fillPolygon(brazilX,brazilY,4);
            g.setColor(new Color(0,0,195));
            g.fillOval(drawX-radius/3,drawY-radius/3,radius*2/3,radius*2/3);
        }
        else if(country == 15){
            g.setColor(Color.white);
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            g.setColor(Color.red);
            g.fillArc(drawX-radius,drawY-radius,radius*5/3,radius*5/3,90,90);
            g.fillArc(drawX-radius,drawY-radius*2/3,radius*5/3,radius*5/3,180,90);
            g.fillArc(drawX-radius*2/3,drawY-radius,radius*5/3,radius*5/3,0,90);
            g.fillArc(drawX-radius*2/3,drawY-radius*2/3,radius*5/3,radius*5/3,270,90);
        }
        else if(country == 16){
            g.setColor(new Color(0,0,195));
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            g.setColor(Color.white);
            g.fillArc(drawX-radius,drawY-radius,radius*5/3,radius*5/3,90,90);
            g.fillArc(drawX-radius,drawY-radius*2/3,radius*5/3,radius*5/3,180,90);
            g.fillArc(drawX-radius*2/3,drawY-radius,radius*5/3,radius*5/3,0,90);
            g.fillArc(drawX-radius*2/3,drawY-radius*2/3,radius*5/3,radius*5/3,270,90);
        }
        else if(country == 17){
            drawHorizontal3(g,new Color(0,215,254),Color.white,new Color(0,215,254));
            g.setColor(Color.yellow);
            g.fillOval(drawX-radius/4,drawY-radius/8,radius/4,radius/4);
            g.setColor(Color.black);
            g.drawOval(drawX-radius/4,drawY-radius/8,radius/4,radius/4);
        }
        else if(country == 18)
            drawVertical3(g,new Color(228,156,0),Color.white,new Color(0,160,0));
        else if(country == 19){
            g.setColor(new Color(0,0,195));
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            g.setColor(Color.white);
            g.fillRect(drawX-4,drawY-radius,8,radius*2);
            g.fillRect(drawX-radius,drawY-4,radius*2,8);
            int[] briX = {drawX-radius/4*3,drawX-radius/4*3+2,drawX+radius/4*3+2,
                    drawX+radius/4*3,drawX+radius/4*3-2,drawX-radius/4*3-2};
            int[] briY = {drawY-radius/4*3,drawY-radius/4*3-2,drawY+radius/4*3-2,
                    drawY+radius/4*3,drawY+radius/4*3+2,drawY-radius/4*3+2};
            g.fillPolygon(briX,briY,6);
            int[] briX2 = {drawX-radius/4*3,drawX-radius/4*3+2,drawX+radius/4*3+2,
                    drawX+radius/4*3,drawX+radius/4*3-2,drawX-radius/4*3-2};
            int[] briY2 = {drawY+radius/4*3,drawY+radius/4*3+2,drawY-radius/4*3+2,
                    drawY-radius/4*3,drawY-radius/4*3-2,drawY+radius/4*3-2};
            g.fillPolygon(briX2,briY2,6);
            g.setColor(Color.red);
            g.fillRect(drawX-2,drawY-radius,4,radius*2);
            g.fillRect(drawX-radius,drawY-2,radius*2,4);
        }
        else if(country == 20){
            drawVertical3(g,new Color(0,160,0),Color.white,Color.red);
            g.setColor(new Color(137,104,20));
            g.fillOval(drawX-radius/3,drawY-radius/3,radius*2/3,radius*2/3);
        }
        else if(country == 21){
            drawVertical3(g,new Color(0,160,0),Color.red,Color.yellow);
            g.setColor(Color.yellow);
            g.fillOval(drawX-radius/8,drawY-radius/8,radius/4,radius/4);
        }
        else if(country == 22){
            g.setColor(Color.red);
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            g.setColor(Color.white);
            g.fillRect(drawX-4,drawY-12,8,24);
            g.fillRect(drawX-12,drawY-4,24,8);
        }
        else if(country == 23)
            drawVertical3(g,new Color(0,160,0),Color.white,new Color(0,160,0));
        else if(country == 24){
            drawHorizontal3(g,Color.red,Color.yellow,new Color(0,160,0));
            g.setColor(Color.black);
            g.fillOval(drawX-radius/8,drawY-radius/8,radius/4,radius/4);
        }
        else if(country == 25){
            g.setColor(new Color(228,156,0));
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            g.setColor(new Color(0,160,0));
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,180,180);
            g.setColor(Color.white);
            g.fillArc(drawX-radius,drawY-radius+2,radius*4/3,radius*2-4,90,180);
        }
        else if(country == 26)
            drawVertical3(g,new Color(0,160,0),Color.white,Color.red);
        else if(country == 27){
            g.setColor(Color.red);
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            g.setColor(Color.white);
            g.fillArc(drawX-radius,drawY-radius,radius*5/3,radius*5/3,90,90);
            g.fillArc(drawX-radius,drawY-radius*2/3,radius*5/3,radius*5/3,180,90);
            g.fillArc(drawX-radius*2/3,drawY-radius,radius*5/3,radius*5/3,0,90);
            g.fillArc(drawX-radius*2/3,drawY-radius*2/3,radius*5/3,radius*5/3,270,90);
        }
        else if(country == 28){
            g.setColor(new Color(0,120,0));
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            g.setColor(Color.red);
            g.fillArc(drawX-radius,drawY-radius+2,radius*4/3,radius*2-4,90,180);
            g.setColor(Color.white);
            g.fillArc(drawX-radius/2,drawY-radius/4,radius/4,radius/2,180,180);
            g.setColor(Color.yellow);
            g.drawOval(drawX-radius/2-2,drawY-radius/4-2,radius/4+4,radius/2+4);
        }
        else if(country == 29){
            g.setColor(Color.white);
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            g.setColor(Color.red);
            g.fillOval(drawX-radius*5/8,drawY-radius*5/8,radius*5/4,radius*5/4);
        }
        else if(country == 30){
            g.setColor(Color.white);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,0,180);
            g.setColor(Color.red);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,180,180);
            g.setColor(Color.blue);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,90,90);
            g.setColor(Color.white);
            g.fillOval(drawX-radius/2-2,drawY-radius/2-2,radius/4,radius/4);
        }
        else if(country == 31){
            g.setColor(Color.yellow);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,0,180);
            g.setColor(new Color(0,0,195));
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,180,180);
            g.setColor(Color.red);
            if(radius == 17)
                g.fillArc(drawX-radius/2-5,drawY,radius*5/4+6,radius,180,180);
            else
                g.fillArc(drawX-radius/2-8,drawY,radius*5/4+10,radius,180,180);
        }
        else if(country == 32){
            drawHorizontal3(g,Color.black,Color.white,new Color(0,120,0));
            g.setColor(Color.red);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,135,90);
            g.setColor(Color.white);
            g.fillOval(drawX-radius/4*3,drawY-radius/8,radius/4,radius/4);
        }
        else if(country == 33){
            drawHorizontal2(g,Color.red,Color.white);
        }
        else if(country == 34){
            g.setColor(Color.white);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,0,180);
            g.setColor(Color.blue);
            if(radius == 17)
                g.fillArc(drawX-radius/2-5,drawY-radius,radius*5/4+6,radius,0,180);
            else
                g.fillArc(drawX-radius/2-8,drawY-radius,radius*5/4+10,radius,0,180);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,180,180);
            g.setColor(Color.white);
            if(radius == 17)
                g.fillArc(drawX-radius/2-5,drawY,radius*5/4+6,radius,180,180);
            else
                g.fillArc(drawX-radius/2-8,drawY,radius*5/4+10,radius,180,180);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,90,90);
            g.setColor(Color.yellow);
            g.fillOval(drawX-radius/4*3,drawY-radius/4*3,radius/2,radius/2);
            g.setColor(Color.black);
            g.drawOval(drawX-radius/4*3,drawY-radius/4*3,radius/2,radius/2);
        }
        else if(country == 35)
            drawHorizontal3(g,Color.red,Color.white,new Color(0,160,0));
        else if(country == 36){
            drawHorizontal2(g,Color.white,Color.red);
            g.setColor(Color.blue);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,135,90);
        }
        else if(country == 37){
            drawHorizontal3(g,new Color(0,215,254),Color.yellow,new Color(0,215,254));
            g.setColor(Color.black);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,135,90);
        }
        else if(country == 38){
            g.setColor(Color.white);
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            g.setColor(Color.blue);
            if(radius == 17)
                g.fillArc(drawX-radius/2-5,drawY-radius,radius*5/4+6,radius,0,180);
            else
                g.fillArc(drawX-radius/2-8,drawY-radius,radius*5/4+10,radius,0,180);
            if(radius == 17)
                g.fillArc(drawX-radius/2-5,drawY,radius*5/4+6,radius,180,180);
            else
                g.fillArc(drawX-radius/2-8,drawY,radius*5/4+10,radius,180,180);
            g.fillOval(drawX-radius/2,drawY-radius/2,radius-1,radius-1);
            g.setColor(Color.white);
            g.fillOval(drawX-radius/2+2,drawY-radius/2+2,radius-5,radius-5);
        }
        else if(country == 39){
            drawHorizontal2(g,new Color(0,215,254),new Color(0,120,0));
            g.setColor(Color.white);
            g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,135,90);
            g.setColor(new Color(228,156,0));
            g.fillOval(drawX-radius/4*3,drawY-radius/8,radius/4,radius/4);
        }
        else if(country == 40){
            drawHorizontal3(g,new Color(254,221,0),new Color(0,120,0),Color.red);
        }
        else if(country == 41){
            g.setColor(Color.red);
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            g.setColor(Color.white);
            if(radius == 17)
                g.fillArc(drawX-radius/2-5,drawY-radius,radius*5/4+6,radius,0,180);
            else
                g.fillArc(drawX-radius/2-8,drawY-radius,radius*5/4+10,radius,0,180);
            if(radius == 17)
                g.fillArc(drawX-radius/2-5,drawY,radius*5/4+6,radius,180,180);
            else
                g.fillArc(drawX-radius/2-8,drawY,radius*5/4+10,radius,180,180);
            g.fillOval(drawX-radius/4*3,drawY-radius/2,radius-1,radius-1);
            g.setColor(Color.blue);
            if(radius == 17)
                g.fillArc(drawX-radius/2-4,drawY-radius,radius*5/4+4,radius-4,0,180);
            else
                g.fillArc(drawX-radius/2-7,drawY-radius,radius*5/4+8,radius-4,0,180);
            if(radius == 17)
                g.fillArc(drawX-radius/2-4,drawY+4,radius*5/4+4,radius-4,180,180);
            else
                g.fillArc(drawX-radius/2-7,drawY+4,radius*5/4+8,radius-4,180,180);
            g.setColor(Color.red);
            g.fillOval(drawX-radius/4*3+2,drawY-radius/2+2,radius-5,radius-5);
        }
        else if(country == 42){
            g.setColor(Color.red);
            g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
            g.setColor(new Color(254,221,0));
            g.fillOval(drawX-radius*5/8,drawY-radius*5/8,radius/2,radius/2);
        }
        else if(country == 43)
            drawVertical3(g, new Color(0,0,195),new Color(254,221,0),Color.red);
    }

    public void drawHorizontal3(Graphics g, Color color1, Color color2, Color color3){
        g.setColor(color2);
        g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
        g.setColor(color1);
        g.fillArc(drawX-radius+2,drawY-radius,radius*2-4,radius*4/3,0,180);
        g.setColor(color3);
        g.fillArc(drawX-radius+2,drawY-radius/3,radius*2-4,radius*4/3,180,180);
    }

    public void drawHorizontal2(Graphics g, Color color1, Color color2){
        g.setColor(color1);
        g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,0,180);
        g.setColor(color2);
        g.fillArc(drawX-radius,drawY-radius,radius*2,radius*2,180,180);
    }

    public void drawVertical3(Graphics g, Color color1, Color color2, Color color3){
        g.setColor(color2);
        g.fillOval(drawX-radius,drawY-radius,radius*2,radius*2);
        g.setColor(color1);
        g.fillArc(drawX-radius,drawY-radius+2,radius*4/3,radius*2-4,90,180);
        g.setColor(color3);
        g.fillArc(drawX-radius/3,drawY-radius+2,radius*4/3,radius*2-4,270,180);
    }

    public String chooseCountry(int country){
        if(country == 0)
            return "USA";
        else if(country == 1)
            return "NED";
        else if(country == 2)
            return "POL";
        else if(country == 3)
            return "FRA";
        else if(country == 4)
            return "GER";
        else if(country == 5)
            return "ESP";
        else if(country == 6)
            return "CHA";
        else if(country == 7)
            return "EVN";
        else if(country == 8)
            return "BEL";
        else if(country == 9)
            return "AUT";
        else if(country == 10)
            return "GRE";
        else if(country == 11)
            return "IRE";
        else if(country == 12)
            return "RUS";
        else if(country == 13)
            return "SWE";
        else if(country == 14)
            return "BRA";
        else if(country == 15)
            return "DEN";
        else if(country == 16)
            return "FIN";
        else if(country == 17)
            return "ARG";
        else if(country == 18)
            return "CIV";
        else if(country == 19)
            return "GBR";
        else if(country == 20)
            return "MEX";
        else if(country == 21)
            return "CMR";
        else if(country == 22)
            return "SUI";
        else if(country == 23)
            return "NIG";
        else if(country == 24)
            return "GHA";
        else if(country == 25)
            return "MAD";
        else if(country == 26)
            return "ITA";
        else if(country == 27)
            return "ENG";
        else if(country == 28)
            return "POR";
        else if(country == 29)
            return "JAP";
        else if(country == 30)
            return "CHI";
        else if(country == 31)
            return "COL";
        else if(country == 32)
            return "JOR";
        else if(country == 33)
            return "SIN";
        else if(country == 34)
            return "URU";
        else if(country == 35)
            return "HUN";
        else if(country == 36)
            return "CZE";
        else if(country == 37)
            return "BAH";
        else if(country == 38)
            return "ISR";
        else if(country == 39)
            return "DJI";
        else if(country == 40)
            return "LTU";
        else if(country == 41)
            return "PRK";
        else if(country == 42)
            return "CHN";
        else if(country == 43)
            return "ROU";
        return "DUM";
    }

    public void drawCountry(Graphics g, int country, int x, int y){
        if(country == 0){
            g.setColor(Color.white);
            g.fillRect(x,y,60,6);
            g.fillRect(x,y+12,60,6);
            g.fillRect(x,y+24,60,6);
            g.fillRect(x,y+36,60,6);
            g.setColor(Color.red);
            g.fillRect(x,y+6,60,6);
            g.fillRect(x,y+18,60,6);
            g.fillRect(x,y+30,60,6);
            g.fillRect(x,y+42,60,6);
            g.setColor(Color.blue);
            g.fillRect(x,y,30,24);
        }
        else if(country == 1)
            drawHorizontal3(g,Color.red,Color.white,Color.blue,x,y);
        else if(country == 2)
            drawHorizontal2(g,Color.white,Color.red,x,y);
        else if(country == 3)
            drawVertical3(g,Color.blue,Color.white,Color.red,x,y);
        else if(country == 4)
            drawHorizontal3(g,Color.black,Color.red,Color.yellow,x,y);
        else if(country == 5){
            g.setColor(Color.yellow);
            g.fillRect(x,y,60,48);
            g.setColor(Color.red);
            g.fillRect(x,y,60,12);
            g.fillRect(x,y+36,60,12);
            g.fillOval(x+16,y+16,16,16);
        }
        else if(country == 6)
            drawVertical3(g,new Color(0,0,195),Color.yellow,new Color(163,0,0),x,y);
        else if(country == 7){
            drawHorizontal2(g,new Color(254,221,0),Color.red,x,y);
            g.setColor(Color.black);
            int[] jorX2 = {x+60,x+35,x+60};
            int[] jorY2 = {y,y+24,y+48};
            g.fillPolygon(jorX2,jorY2,3);
        }
        else if(country == 8)
            drawVertical3(g,Color.black,Color.yellow,Color.red,x,y);
        else if(country == 9)
            drawHorizontal3(g,Color.red,Color.white,Color.red,x,y);
        else if(country == 10){
            g.setColor(Color.white);
            g.fillRect(x,y,60,6);
            g.fillRect(x,y+12,60,6);
            g.fillRect(x,y+24,60,6);
            g.fillRect(x,y+36,60,6);
            g.setColor(Color.blue);
            g.fillRect(x,y+6,60,6);
            g.fillRect(x,y+18,60,6);
            g.fillRect(x,y+30,60,6);
            g.fillRect(x,y+42,60,6);
            g.fillRect(x,y,30,24);
            g.setColor(Color.white);
            g.fillRect(x+9,y,6,24);
            g.fillRect(x,y+9,30,6);
        }
        else if(country == 11)
            drawVertical3(g,new Color(0,160,0),Color.white,new Color(228,156,0),x,y);
        else if(country == 12)
            drawHorizontal3(g,Color.white,Color.blue,Color.red,x,y);
        else if(country == 13){
            g.setColor(new Color(0,0,195));
            g.fillRect(x,y,60,48);
            g.setColor(Color.yellow);
            g.fillRect(x,y+19,60,10);
            g.fillRect(x+15,y,10,48);
        }
        else if(country == 14){
            g.setColor(new Color(0,120,0));
            g.fillRect(x,y,60,48);
            int[] brazilX = {x+2,x+30,x+58,x+30};
            int[] brazilY = {y+24,y+5,y+24,y+43};
            g.setColor(Color.yellow);
            g.fillPolygon(brazilX,brazilY,4);
            g.setColor(new Color(0,0,195));
            g.fillOval(x+19,y+14,22,20);
        }
        else if(country == 15){
            g.setColor(Color.red);
            g.fillRect(x,y,60,48);
            g.setColor(Color.white);
            g.fillRect(x,y+19,60,10);
            g.fillRect(x+15,y,10,48);
        }
        else if(country == 16){
            g.setColor(Color.white);
            g.fillRect(x,y,60,48);
            g.setColor(new Color(0,0,195));
            g.fillRect(x,y+19,60,10);
            g.fillRect(x+15,y,10,48);
        }
        else if(country == 17){
            drawHorizontal3(g,new Color(0,215,254),Color.white,new Color(0,215,254),x,y);
            g.setColor(Color.yellow);
            g.fillOval(x+27,y+21,6,6);
            g.setColor(Color.black);
            g.drawOval(x+27,y+21,6,6);
        }
        else if(country == 18)
            drawVertical3(g,new Color(228,156,0),Color.white,new Color(0,160,0),x,y);
        else if(country == 19){
            g.setColor(new Color(0,0,195));
            g.fillRect(x,y,60,48);
            g.setColor(Color.white);
            g.fillRect(x+24,y,12,48);
            g.fillRect(x,y+18,60,12);
            int[] briX = {x,x+4,x+60,x+60,x+56,x};
            int[] briY = {y,y,y+44,y+48,y+48,y+4};
            g.fillPolygon(briX,briY,6);
            int[] briX2 = {x+60,x+56,x,x,x+4,x+60};
            int[] briY2 = {y,y,y+44,y+48,y+48,y+4};
            g.fillPolygon(briX2,briY2,6);
            g.setColor(Color.red);
            g.fillRect(x+26,y,8,48);
            g.fillRect(x,y+20,60,8);
        }
        else if(country == 20){
            drawVertical3(g,new Color(0,160,0),Color.white,Color.red,x,y);
            g.setColor(new Color(137,104,20));
            g.fillOval(x+22,y+17,14,14);
        }
        else if(country == 21){
            drawVertical3(g,new Color(0,160,0),Color.red,Color.yellow,x,y);
            g.setColor(Color.yellow);
            g.fillOval(x+25,y+19,10,10);
        }
        else if(country == 22){
            g.setColor(Color.red);
            g.fillRect(x,y,60,48);
            g.setColor(Color.white);
            g.fillRect(x+26,y+12,8,24);
            g.fillRect(x+18,y+20,24,8);
        }
        else if(country == 23)
            drawVertical3(g,new Color(0,160,0),Color.white,new Color(0,160,0),x,y);
        else if(country == 24){
            drawHorizontal3(g,Color.red,Color.yellow,new Color(0,160,0),x,y);
            g.setColor(Color.black);
            g.fillOval(x+25,y+19,10,10);
        }
        else if(country == 25){
            g.setColor(Color.white);
            g.fillRect(x,y,60,48);
            g.setColor(new Color(228,156,0));
            g.fillRect(x+20,y,40,24);
            g.setColor(new Color(0,160,0));
            g.fillRect(x+20,y+24,40,24);
        }
        else if(country == 26)
            drawVertical3(g,new Color(0,160,0),Color.white,Color.red,x,y);
        else if(country == 27){
            g.setColor(Color.white);
            g.fillRect(x,y,60,48);
            g.setColor(Color.red);
            g.fillRect(x,y+19,60,10);
            g.fillRect(x+25,y,10,48);
        }
        else if(country == 28){
            g.setColor(new Color(0,120,0));
            g.fillRect(x,y,20,48);
            g.setColor(Color.red);
            g.fillRect(x+20,y,40,48);
            g.setColor(Color.red);
            g.fillArc(x+12,y+8,18,24,180,180);
            g.setColor(Color.white);
            g.fillArc(x+13,y+13,14,18,180,180);
            g.setColor(Color.yellow);
            g.drawOval(x+10,y+12,20,24);
        }
        else if(country == 29){
            g.setColor(Color.white);
            g.fillRect(x,y,60,48);
            g.setColor(Color.red);
            g.fillOval(x+15,y+9,30,30);
        }
        else if(country == 30){
            g.setColor(Color.white);
            g.fillRect(x,y,60,24);
            g.setColor(Color.red);
            g.fillRect(x,y+24,60,24);
            g.setColor(Color.blue);
            g.fillRect(x,y,30,24);
            g.setColor(Color.white);
            g.fillOval(x+12,y+9,6,6);
        }
        else if(country == 31){
            g.setColor(Color.yellow);
            g.fillRect(x,y,60,24);
            g.setColor(new Color(0,0,195));
            g.fillRect(x,y+24,60,12);
            g.setColor(Color.red);
            g.fillRect(x,y+36,60,12);
        }
        else if(country == 32){
            drawHorizontal3(g,Color.black,Color.white,new Color(0,120,0),x,y);
            g.setColor(Color.red);
            int[] jorX = {x,x+25,x};
            int[] jorY = {y,y+24,y+48};
            g.fillPolygon(jorX,jorY,3);
            g.setColor(Color.white);
            g.fillOval(x+4,y+21,6,6);
        }
        else if(country == 33)
            drawHorizontal2(g,Color.red,Color.white,x,y);
        else if(country == 34){
            g.setColor(Color.blue);
            g.fillRect(x,y,60,6);
            g.fillRect(x,y+12,60,6);
            g.fillRect(x,y+24,60,6);
            g.fillRect(x,y+36,60,6);
            g.setColor(Color.white);
            g.fillRect(x,y+6,60,6);
            g.fillRect(x,y+18,60,6);
            g.fillRect(x,y+30,60,6);
            g.fillRect(x,y+42,60,6);
            g.fillRect(x,y,30,24);
            g.fillRect(x,y,30,24);
            g.setColor(Color.yellow);
            g.fillOval(x+3,y+3,20,18);
            g.setColor(Color.black);
            g.drawOval(x+3,y+3,20,18);
        }
        else if(country == 35)
            drawHorizontal3(g,Color.red,Color.white,new Color(0,160,0),x,y);
        else if(country == 36){
            drawHorizontal2(g,Color.white,Color.red,x,y);
            g.setColor(Color.blue);
            int[] jorX = {x,x+25,x};
            int[] jorY = {y,y+24,y+48};
            g.fillPolygon(jorX,jorY,3);
        }
        else if(country == 37){
            drawHorizontal3(g,new Color(0,215,254),Color.yellow,new Color(0,215,254),x,y);
            g.setColor(Color.black);
            int[] jorX = {x,x+25,x};
            int[] jorY = {y,y+24,y+48};
            g.fillPolygon(jorX,jorY,3);
        }
        else if(country == 38){
            g.setColor(Color.white);
            g.fillRect(x,y,60,48);
            g.setColor(Color.blue);
            g.fillRect(x,y,60,12);
            g.fillRect(x,y+36,60,12);
            g.fillOval(x+20,y+14,20,20);
            g.setColor(Color.white);
            g.fillOval(x+23,y+17,14,14);
        }
        else if(country == 39){
            drawHorizontal2(g,new Color(0,215,254),new Color(0,120,0),x,y);
            g.setColor(Color.white);
            int[] jorX = {x,x+25,x};
            int[] jorY = {y,y+24,y+48};
            g.fillPolygon(jorX,jorY,3);
            g.setColor(new Color(228,156,0));
            g.fillOval(x+4,y+21,6,6);
        }
        else if(country == 40){
            drawHorizontal3(g,new Color(254,221,0),new Color(0,120,0),Color.red,x,y);
        }
        else if(country == 41){
            g.setColor(Color.red);
            g.fillRect(x,y,60,48);
            g.setColor(Color.white);
            g.fillRect(x,y,60,12);
            g.fillRect(x,y+36,60,12);
            g.fillOval(x+15,y+14,20,20);
            g.setColor(Color.blue);
            g.fillRect(x,y,60,10);
            g.fillRect(x,y+38,60,10);
            g.setColor(Color.red);
            g.fillOval(x+18,y+17,14,14);
        }
        else if(country == 42){
            g.setColor(Color.red);
            g.fillRect(x,y,60,48);
            g.setColor(new Color(254,221,0));
            g.fillOval(x+5,y+5,6,6);
        }
        else if(country == 43)
            drawVertical3(g, new Color(0,0,195),new Color(254,221,0),Color.red,x,y);
    }

    public void drawHorizontal3(Graphics g, Color color1, Color color2, Color color3, int x, int y){
        g.setColor(color1);
        g.fillRect(x,y,60,16);
        g.setColor(color2);
        g.fillRect(x,y+16,60,16);
        g.setColor(color3);
        g.fillRect(x,y+32,60,16);
    }

    public void drawHorizontal2(Graphics g, Color color1, Color color2, int x, int y){
        g.setColor(color1);
        g.fillRect(x,y,60,24);
        g.setColor(color2);
        g.fillRect(x,y+24,60,24);
    }

    public void drawVertical3(Graphics g, Color color1, Color color2, Color color3, int x, int y){
        g.setColor(color1);
        g.fillRect(x,y,20,48);
        g.setColor(color2);
        g.fillRect(x+20,y,20,48);
        g.setColor(color3);
        g.fillRect(x+40,y,20,48);
    }

    public void drawStats(Graphics g,int stat, int x, int y){
        for(int i = 0;i<5;i++){
            if(i+1 <= stat)
                g.setColor(Color.orange);
            else
                g.setColor(Color.gray);
            g.fillOval(x+15*i,y,10,10);
            g.setColor(Color.black);
            g.drawOval(x+15*i,y,10,10);
        }
    }
}