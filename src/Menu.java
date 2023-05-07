package src;

import java.awt.*;

public class Menu {

    public Rectangle startButton = new Rectangle(280, 150, 100, 50);
    public Rectangle exitButton = new Rectangle(280, 250, 100, 50);

    public void render(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Font ft = new Font("Monospaced", Font.BOLD, 50);
        Font ft2 = new Font("Monospaced", Font.BOLD, 30);
        g.setFont(ft);
        g.setColor(Color.BLACK);
        g.drawString("Ant vs some Bee", 160, 100);
        g.setFont(ft2);
        g.drawString("Start", startButton.x + 19, startButton.y + 30);
        g2.draw(startButton);
        g.drawString("Exit", exitButton.x + 19, exitButton.y + 30);
        g2.draw(exitButton);
    }
}
