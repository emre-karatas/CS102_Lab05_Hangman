import cs102.Hangman;

import javax.swing.*;
import  java.awt.*;
import java.awt.event.*;

public class TextFieldControlPanel extends JPanel
{
    Hangman hangman;
    JTextField field;
    public TextFieldControlPanel(Hangman hangman)
    {
        this.hangman = hangman;
        field = new JTextField(40);
        add(field);
        field.addActionListener(new TextFieldListener());
    }

    public class TextFieldListener implements  ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            int fieldLength = field.getText().length();

            for ( int i = 0; i < fieldLength; i++)
            {
                hangman.tryThis(field.getText().charAt(i) );
            }
            field.setText("");

        }
    }
}
