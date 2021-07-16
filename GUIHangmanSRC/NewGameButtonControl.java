import cs102.Hangman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameButtonControl extends JButton implements ActionListener, IHangmanView
{
    private Hangman hangman;
    public NewGameButtonControl(Hangman hangman)
    {
        setText("NEW GAME");
        this.hangman = hangman;
        addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        hangman.initNewGame();
        setEnabled(false);

    }

    @Override
    public void updateView(Hangman hangmanModel)
    {
        if ( hangmanModel.isGameOver())
        {
            setEnabled(true);
        }

    }
}
