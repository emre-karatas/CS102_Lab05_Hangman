import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Emre Karatas-16.07.2021
 * @version v1.0
 */
public class LetterButtonController implements ActionListener
{

    HangmanModel hangmanModel;

    public LetterButtonController(HangmanModel hangmanModel)
    {
        this.hangmanModel = hangmanModel;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        char letter = ((JButton)e.getSource()).getText().charAt(0);
        hangmanModel.tryThis(letter);
        ((JButton) e.getSource()).setEnabled(false);



    }
}
