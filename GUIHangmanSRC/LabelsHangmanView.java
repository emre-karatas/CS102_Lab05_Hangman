import cs102.Hangman;

import javax.swing.*;
import java.awt.*;

public class LabelsHangmanView extends JPanel implements IHangmanView
{
    JLabel numOfIncorrectTries;
    JLabel knownSoFar;
    JLabel usedLetters;
    JLabel lost;
    public LabelsHangmanView()
    {
        setBackground(Color.ORANGE);
        setPreferredSize(new Dimension(400,400));
        setLayout( new GridLayout(4,1));
        numOfIncorrectTries = new JLabel("Num Of Incorrect Tries: ");
        numOfIncorrectTries.setFont(new Font("Comic Sans", Font.BOLD,20));
        knownSoFar = new JLabel("Known so Far :");
        knownSoFar.setFont(new Font("Comic Sans", Font.BOLD,20));
        usedLetters = new JLabel("used Letters:");
        usedLetters.setFont(new Font("Comic Sans", Font.BOLD,20));
        lost = new JLabel("Game Status: ");
        lost.setFont(new Font("Comic Sans", Font.BOLD,20));
        add(knownSoFar);
        add(lost);
        add(numOfIncorrectTries);
        add(usedLetters);

    }
    @Override
    public void updateView(Hangman hangmanModel)
    {
        numOfIncorrectTries.setText("Num Of Incorrect Tries: "+ hangmanModel.getNumOfIncorrectTries());
        knownSoFar.setText("Known so far: " + hangmanModel.getKnownSoFar());
        usedLetters.setText("used letters: " + hangmanModel.getUsedLetters());
        if ( hangmanModel.hasLost())
        {
            lost.setText("YOU LOST");
            lost.setAlignmentX(SwingConstants.CENTER);
            lost.setFont(new Font("Comic Sans",Font.BOLD,50));
            lost.setForeground(Color.RED);
        }
        else if ( !hangmanModel.hasLost() && hangmanModel.isGameOver())
        {
            lost.setText("YOU WON!");
            lost.setAlignmentX(SwingConstants.CENTER);
            lost.setFont(new Font("Comic Sans",Font.BOLD,50));
            lost.setForeground(Color.GREEN);
        }
        else
        {
            lost.setText("");
        }
    }
}
