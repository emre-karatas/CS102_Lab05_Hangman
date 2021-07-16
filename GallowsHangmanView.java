import cs102.Hangman;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class GallowsHangmanView extends JPanel implements IHangmanView
{

    Hangman hangman;
    Rectangle2D rectangle1;
    Rectangle2D rectangle2;
    Rectangle2D rectangle3;
    public GallowsHangmanView(HangmanModel hangman)
    {
        this.hangman = hangman;
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(400,400));



    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("Incorrect tries count: " +hangman.getNumOfIncorrectTries(),250,100 );
        g.drawString("Used letters : " + hangman.getUsedLetters(), 250,120);
        g.drawString("Known So far : "+ hangman.getKnownSoFar(), 250 , 140);
        Graphics2D g2 = (Graphics2D) g;
        if ( hangman.getNumOfIncorrectTries() == 0)
        {

            g2.fillRect(80,40,120,20);
            g2.fillRect(80,40,20,300);
            g2.fillRect(50,340,240,35);
            g2.fillRect(180,40,10,50);
        }
        else if ( hangman.getNumOfIncorrectTries() == 1)
        {

            g2.fillRect(80,40,120,20);
            g2.fillRect(80,40,20,300);
            g2.fillRect(50,340,240,35);
            g2.fillRect(180,40,10,50);
            g2.drawOval(155,90,60,60);
        }
        else if ( hangman.getNumOfIncorrectTries() == 2)
        {
            g2.fillRect(80,40,120,20);
            g2.fillRect(80,40,20,300);
            g2.fillRect(50,340,240,35);
            g2.fillRect(180,40,10,50);
            g2.drawOval(155,90,60,60);
            g2.drawLine(185,150,185,250);
        }
        else if ( hangman.getNumOfIncorrectTries() == 3)
        {
            g2.fillRect(80,40,120,20);
            g2.fillRect(80,40,20,300);
            g2.fillRect(50,340,240,35);
            g2.fillRect(180,40,10,50);
            g2.drawOval(155,90,60,60);
            g2.drawLine(185,150,185,250);
            g2.drawLine(185,170,230,200);
        }
        else if ( hangman.getNumOfIncorrectTries() == 4)
        {
            g2.fillRect(80,40,120,20);
            g2.fillRect(80,40,20,300);
            g2.fillRect(50,340,240,35);
            g2.fillRect(180,40,10,50);
            g2.drawOval(155,90,60,60);
            g2.drawLine(185,150,185,250);
            g2.drawLine(185,170,230,200);
            g2.drawLine(185,170,140,200);

        }
        else if ( hangman.getNumOfIncorrectTries() == 5)
        {
            g2.fillRect(80,40,120,20);
            g2.fillRect(80,40,20,300);
            g2.fillRect(50,340,240,35);
            g2.fillRect(180,40,10,50);
            g2.drawOval(155,90,60,60);
            g2.drawLine(185,150,185,250);
            g2.drawLine(185,170,230,200);
            g2.drawLine(185,170,140,200);
            g2.drawLine(185,250,230,300);
        }
        else if ( hangman.getNumOfIncorrectTries() == hangman.getMaxAllowedIncorrectTries())
        {
            g2.fillRect(80,40,120,20);
            g2.fillRect(80,40,20,300);
            g2.fillRect(50,340,240,35);
            g2.fillRect(180,40,10,50);
            g2.drawOval(155,90,60,60);
            g2.drawLine(185,150,185,250);
            g2.drawLine(185,170,230,200);
            g2.drawLine(185,170,140,200);
            g2.drawLine(185,250,230,300);
            g2.drawLine(185,250,140,300);

        }

        if ( hangman.hasLost())
        {
            g.drawString("YOU LOST!",250,80);
        }
        else if ( !hangman.hasLost() && hangman.isGameOver())
        {
            g.drawString("YOU WON!",250,80);
        }

    }

    @Override
    public void updateView(Hangman hangmanModel)
    {
        repaint();

    }
}
