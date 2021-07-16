import cs102.Hangman;

public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView
{


    public HangmanLetterButtonControls(String letters,int rows,int columns)
    {
        super(letters,rows,columns);
    }

    @Override
    public void updateView(Hangman hangmanModel)
    {
        if ( !hangmanModel.getUsedLetters().equals(""))
        {
            setDisabled(hangmanModel.getUsedLetters());
        }
        if (hangmanModel.isGameOver())
        {
            setEnabledAll(true);
        }

    }
}
