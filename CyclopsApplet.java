import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.MemoryImageSource;
import java.util.ArrayList;

public class CyclopsApplet extends Applet implements ActionListener, KeyListener, MouseListener, MouseMotionListener
{
    // Cyclops Global Variables
    private int mouseX,mouseY,gameState,evanCountry,chadCountry,evanGoals,chadGoals,winCounter,beginningCounter;
    private boolean leftClick, rightClick, left, right, up, down, win;
    private String chadAb, evanAb;
    private Timer t;
    private Player1 evan;
    private Player2 chad;
    private Ball ball;
    private CountryInfo countryInfo;
    private Polygon evanCountryPlus, evanCountryMinus, chadCountryPlus, chadCountryMinus;

    // Menu Global Variables
    private boolean menuUp, menuDown, menuLeft, menuRight, menuEnter;
    private ArrayList<MainMenu> menu;
    private AudioClip ac;

    public void init(){
        resize(1000,600);
        int[] pixels = new int[16 * 16];
        Image image = Toolkit.getDefaultToolkit().createImage(
                new MemoryImageSource(16, 16, pixels, 0, 16));
        Cursor transparentCursor = Toolkit.getDefaultToolkit().createCustomCursor(
                image, new Point(mouseX,mouseY), "invisibleCursor");
        setCursor(transparentCursor);

        // Menu Initiation
        menu = new ArrayList<MainMenu>();
        gameState = 0;
        polygonInit();
        countryInfo = new CountryInfo();

        chadCountry = 11;
        chadAb = "";
        evanAb = "";

        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this); 
        t = new Timer(23, this);

        t.start();       
        start();
    }

    public void start(){
        // Pirate Initiation
        if(gameState == 0 || gameState == 1 || gameState == 2){
            // Player init
            evan = new Player1(evanCountry);
            chad = new Player2(chadCountry);

            // Ball init
            ball = new Ball();

            // Resets Goals
            evanGoals = 0;
            chadGoals = 0;

            // Good Stuff
            win = false;
            beginningCounter = 0;
        }

        if(gameState == 2)
            gameState = 1;
    }

    public void actionPerformed(ActionEvent e){
        if(gameState == 1){
            if(!win){
                if(beginningCounter > 80){
                    // String init
                    chadAb = countryInfo.chooseCountry(chad.getCountry());
                    evanAb = countryInfo.chooseCountry(evan.getCountry());

                    // Moves Characters
                    evan.move(mouseX,mouseY,chad);
                    chad.move(left, right, up, down,evan);

                    // Collison moving
                    int evanX = evan.getX();
                    int evanY = evan.getY();
                    int chadX = chad.getX();
                    int chadY = chad.getY();
                    int dist = (int)Math.sqrt((chadX-evanX)*(chadX-evanX)+(chadY-evanY)*(chadY-evanY));
                    if(dist < chad.getRadius() + evan.getRadius()){
                        if(evan.getSpeed() > 0 && (up || down || left || right)){
                            if(evan.getSpeed() > chad.getSpeed())
                                chad.collisionDetection(evan);
                            else if(chad.getSpeed() > evan.getSpeed())
                                evan.collisionDetection(chad);
                            else if(evan.getSpeedMod() > chad.getSpeedMod())
                                chad.collisionDetection(evan);
                            else if(chad.getSpeedMod() > evan.getSpeedMod())
                                evan.collisionDetection(chad);
                            else
                                chad.collisionDetection(evan);
                        }
                        else if(evan.getSpeed() > 0)
                            evan.collisionDetection(chad);
                        else
                            chad.collisionDetection(evan);
                    }

                    // Moves Ball
                    ball.move(evan,chad);

                    // Checks for goals
                    if(ball.chadGOAL()){
                        // Adds a goal
                        chadGoals++;

                        // Sets players back to position
                        chad.setCo(800,300);
                        evan.setCo(200,300);

                        // Starts game countdown
                        if(chadGoals < 5)
                            beginningCounter = 0;

                        // Positions things to look nice
                        evan.move(mouseX,mouseY,chad);
                        chad.move(left, right, up, down,evan);
                        ball.resetSpeed();
                        ball.move(evan,chad);
                    }
                    else if(ball.evanGOAL()){
                        // Adds a goal
                        evanGoals++;

                        // Sets players back to position
                        chad.setCo(800,300);
                        evan.setCo(200,300);

                        // Starts game countdown
                        if(evanGoals < 5)
                            beginningCounter = 0;

                        // Positions things to look nice
                        evan.move(mouseX,mouseY,chad);
                        chad.move(left, right, up, down,evan);
                        ball.resetSpeed();
                        ball.move(evan,chad);
                    }

                    if(chadGoals > 4 || evanGoals > 4)
                        win = true;
                }
                else
                    beginningCounter++;
            }
            else{
                winCounter++;
                if(winCounter > 50)
                    gameState = 0;
            }
        }

        if(gameState == 0){
            // Creates menus
            if(menu.size() == 0){
                MainMenu leMenu = new MainMenu(0, 0, getWidth(), getHeight(), chadCountry, evanCountry);
                menu.add(leMenu);
            }

            // Moves between different buttons
            if(menu.size()>0)
                menu.get(menu.size()-1).mover(menuUp, menuDown, menuLeft, menuRight, menuEnter, mouseX, mouseY);

            // Checks for different menu gamestates
            if(menu.size()>0 && menu.get(menu.size()-1).getGameState() != 0){
                gameState = menu.get(menu.size()-1).getGameState();
                beginningCounter = 0;
            }

            if(leftClick){
                if(evanCountryPlus.contains(mouseX,mouseY))
                    menu.get(0).plusEvan();
                else if(evanCountryMinus.contains(mouseX,mouseY))
                    menu.get(0).minusEvan();
                else if(chadCountryMinus.contains(mouseX,mouseY))
                    menu.get(0).minusChad();
                else if(chadCountryPlus.contains(mouseX,mouseY))
                    menu.get(0).plusChad();
            }

            // Resets the key presses
            menuUp = false;
            menuDown = false;
            menuLeft = false;
            menuRight = false;
            menuEnter = false;
            leftClick = false;

            // Allows for good stuff
            chadCountry = menu.get(0).chadCountryIndex();
            evanCountry = menu.get(0).evanCountryIndex();

            // Bug Fix
            winCounter = 0;
        }
        else
        // Removes menus
        if(menu.size() > 0)
            menu.remove(0);

        if(gameState == 2)
            start();

        //Repaints
        repaint();
    }

    public void paint(Graphics g){
        // Cyclops Game Drawing
        drawBackground(g);

        // Draws Ball
        ball.draw(g);

        // Draws menu
        if(gameState == 0){
            for(int i = 0; i < menu.size(); i++){
                menu.get(i).draw(g,evanCountry,chadCountry);
            }

            g.setColor(Color.red);
            g.fillPolygon(evanCountryPlus);
            g.fillPolygon(chadCountryPlus);
            g.setColor(Color.blue);
            g.fillPolygon(evanCountryMinus);
            g.fillPolygon(chadCountryMinus);

            g.setColor(Color.yellow);
            if(evanCountryPlus.contains(mouseX,mouseY))
                g.drawPolygon(evanCountryPlus);
            else if(evanCountryMinus.contains(mouseX,mouseY))
                g.drawPolygon(evanCountryMinus);
            else if(chadCountryMinus.contains(mouseX,mouseY))
                g.drawPolygon(chadCountryMinus);
            else if(chadCountryPlus.contains(mouseX,mouseY))
                g.drawPolygon(chadCountryPlus);
        }

        // Cursor Crosshairs
        if(evan.rightClick()){
            g.setColor(Color.red);
            g.fillArc(mouseX-5,mouseY-5,10,10,270,180);
        }
        if(evan.leftClick()){
            g.setColor(Color.blue);
            g.fillArc(mouseX-5,mouseY-5,11,10,90,180);
        }
        g.setColor(Color.white);
        g.drawOval(mouseX-5,mouseY-5,10,10);

        // UI
        g.setColor(Color.blue);
        g.fillRect(300,0,400,30);

        g.setColor(Color.gray);
        g.fillRect(300,0,100,30);
        g.fillRect(600,0,100,30);

        g.setColor(Color.black);
        g.drawRect(300,0,100,30);
        g.drawRect(400,0,100,30);
        g.drawRect(500,0,100,30);
        g.drawRect(600,0,100,30);

        // Country Abbreviations
        g.setColor(Color.white);
        g.drawString(evanAb,340,20);
        g.drawString(chadAb,640,20);

        // Goals
        String cG = ""+chadGoals;
        String eG = ""+evanGoals;
        g.setColor(Color.yellow);
        g.drawString(eG,447,20);
        g.drawString(cG,547,20);

        // Stamina UI
        g.setColor(Color.blue);
        g.fillRect(100,570,250,30);
        g.fillRect(650,570,250,30);
        g.setColor(Color.yellow);
        g.drawRect(100,570,250,30);
        g.drawRect(650,570,250,30);
        g.drawString("Stamina :",105,590);
        g.drawString("Stamina :",655,590);

        // Stamina Bar
        g.setColor(Color.gray);
        g.fillRect(160,578,180,15);
        g.fillRect(710,578,180,15);
        g.setColor(Color.orange);
        g.fillRect(160,578,(int)(180.0*evan.getStamina()/1000.0),15);
        g.fillRect(710,578,(int)(180.0*chad.getStamina()/1000.0),15);

        // Fancy Bars
        g.setColor(Color.black);
        g.drawRect(160,578,45,15);
        g.drawRect(205,578,45,15);
        g.drawRect(250,578,45,15);
        g.drawRect(295,578,45,15);
        g.drawRect(710,578,45,15);
        g.drawRect(755,578,45,15);
        g.drawRect(800,578,45,15);
        g.drawRect(845,578,45,15);

        // Win Text
        g.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
        if(win){
            if(chadGoals > 4)
                g.drawString("Congratulations "+chadAb+" you are so AWESOME!!!!",375,300);
            else if(evanGoals > 4)
                g.drawString("Congratulations "+evanAb+" you are so AWESOME!!!!",375,300);
        }

        if(gameState == 1){
            // Draws Players
            evan.draw(g);
            chad.draw(g);

            g.setColor(Color.red);

            if(beginningCounter < 80){
                Beginning b = new Beginning();
                b.drawBeginning(g,beginningCounter);
            }
        }

        // Reset
        leftClick = false;
    }

    public void drawBackground(Graphics g){
        // Background
        g.setColor(new Color(78,169,7));
        g.fillRect(0,0,1000,600);

        // Middle Lines
        g.setColor(new Color(163,0,202));
        g.setColor(Color.black);
        g.fillRect(495,30,10,540);
        g.fillOval(470,0,60,60);
        g.fillOval(470,540,60,60);
        g.setColor(new Color(78,169,7));
        g.fillOval(480,10,40,40);
        g.fillOval(480,550,40,40);

        // Goal Outlines
        g.setColor(Color.white);
        g.fillRect(0,240,10,120);
        g.fillRect(0,240,60,10);
        g.fillRect(0,350,60,10);
        g.fillRect(990,240,10,120);
        g.fillRect(940,240,60,10);
        g.fillRect(940,350,60,10);

        // White Borders
        g.setColor(new Color(163,0,202));
        g.setColor(Color.black);
        g.fillRect(60,30,10,540);
        g.fillRect(930,30,10,540);
        g.fillRect(60,30,880,10);
        g.fillRect(60,560,880,10);

        // Corner drawings
        g.setColor(new Color(163,0,202));
        g.setColor(Color.black);
        g.fillOval(15,-15,90,90);
        g.fillOval(895,-15,90,90);
        g.fillOval(15,525,90,90);
        g.fillOval(895,525,90,90);

        // Border
        drawBorder(g,0,0,1000,30);
        drawBorder(g,0,0,60,240);
        drawBorder(g,940,0,60,240);
        drawBorder(g,0,570,1000,30);
        drawBorder(g,0,360,60,240);
        drawBorder(g,940,360,60,240);
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

    public void polygonInit(){
        int[] polyX = {301,313,325,319,319,307,307};
        int[] polyY = {377,365,377,377,392,392,377};
        int[] polyY2 = {498,510,498,498,483,483,498};
        evanCountryPlus = new Polygon(polyX, polyY, 7);
        evanCountryMinus = new Polygon(polyX, polyY2, 7);
        int[] polyX2 = {676,688,700,694,694,682,682};
        chadCountryPlus = new Polygon(polyX2, polyY, 7);
        chadCountryMinus = new Polygon(polyX2, polyY2, 7);
    }

    public void keyTyped(KeyEvent e) {
        int keyCode = e.getKeyCode();

        // Cyclops Keys
        if(gameState == 1){
            if(keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_W)
                up = true;
            if(keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_D)
                right = true;
            if(keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_A)
                left = true;
            if(keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_S)
                down = true;
            if(keyCode == KeyEvent.VK_SHIFT)
                chad.shiftTrue();
            if(keyCode == KeyEvent.VK_SPACE)
                chad.spaceBarTrue();
        }
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        // Cyclops Keys
        if(gameState == 1){
            if(keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_W)
                up = true;
            if(keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_D)
                right = true;
            if(keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_A)
                left = true;
            if(keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_S)
                down = true;
            if(keyCode == KeyEvent.VK_SHIFT)
                chad.shiftTrue();
            if(keyCode == KeyEvent.VK_SPACE)
                chad.spaceBarTrue();
        }
    }

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();

        // Cyclops Game Presses
        if(gameState == 1){
            if(keyCode == e.VK_UP || keyCode == e.VK_W)
                up = false;
            if(keyCode == e.VK_RIGHT || keyCode == e.VK_D)
                right = false;
            if(keyCode == e.VK_LEFT || keyCode == e.VK_A)
                left = false;
            if(keyCode == e.VK_DOWN || keyCode == e.VK_S)
                down = false;
            if(keyCode == e.VK_SHIFT)
                chad.shiftFalse();
            if(keyCode == e.VK_SPACE)
                chad.spaceBarFalse();
        }

        // Menu Button Presses
        else if(gameState == 0){
            if(keyCode == 87 || keyCode == KeyEvent.VK_UP)
                menuUp = true;
            if(keyCode == KeyEvent.VK_DOWN || keyCode == 83){
                menuDown = true;
            }
            if(keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT)
                menuLeft = true;
            if(keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT)
                menuRight = true;
            if(keyCode == KeyEvent.VK_ENTER)
                menuEnter = true;
            if(keyCode == KeyEvent.VK_ESCAPE)
                gameState = 0;
        }
        if(keyCode == KeyEvent.VK_ESCAPE)
            gameState = 0;
    }

    public void mouseDragged(MouseEvent e){
        mouseX = e.getX();
        mouseY = e.getY();
    }

    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
    }

    public void mouseClicked(MouseEvent e) {
        if(gameState == 0){
            if(e.getButton() == e.BUTTON1)
                leftClick = true;
        }
    }

    public void mouseReleased(MouseEvent e) {
        if(gameState == 1){
            if(e.getButton() == e.BUTTON1)
                evan.leftClickFalse();
            if(e.getButton() == e.BUTTON3)
                evan.rightClickFalse();
        }
    }

    public void mousePressed(MouseEvent e) {
        if(gameState == 1){
            if(e.getButton() == e.BUTTON1)
                evan.leftClickTrue();
            if(e.getButton() == e.BUTTON3)
                evan.rightClickTrue();
        }
        else if(gameState == 0)
            if(e.getButton() == e.BUTTON1)
                menu.get(0).leftClicked();
    }

    public void mouseEntered(MouseEvent e) {
        t.start();
    }

    public void mouseExited(MouseEvent e) {
        t.stop();
    }

    // For Windows Double buffering
    public void run()
    { 
        if(isWindows()){
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            while (true)
            {
                repaint();
                try
                {   // Stop thread for 20 milliseconds
                    Thread.sleep (20);  //throws an InterruptedException, so has be be in a try...
                }
                catch (InterruptedException ex){}
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            } 
        }
    }

    public void update (Graphics g)
    {
        if(isWindows()){
            if (dbImage == null)
            {
                dbImage = createImage (this.getSize().width, this.getSize().height);
                dbg = dbImage.getGraphics ();

            }
            // clear screen in background
            dbg.setColor (getBackground ());
            dbg.fillRect (0, 0, this.getSize().width, this.getSize().height);

            // draw elements in background
            dbg.setColor (getForeground());
            paint (dbg);

            // draw image on the screen
            g.drawImage (dbImage, 0, 0, this);
        }
    }

    private Image dbImage;
    private Graphics dbg;

    private String OS = null;

    public String getOsName(){
        if(OS == null)
            OS = System.getProperty("os.name");
        return OS;
    }

    public boolean isWindows(){
        return getOsName().startsWith("Windows");
    }
}