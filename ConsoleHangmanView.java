import cs102.*;

/**
 * HANGMANVIEW CLASS(VIEW CLASS)
 * @author Emre Karatas-22001641
 * @version v1.0 - 14.07.2021
 */
public class ConsoleHangmanView implements IHangmanView
{

    @Override
    public void updateView(Hangman hangmanModel)
    {
        if ( !hangmanModel.isGameOver())
        {
            System.out.println("The word known so far : " + hangmanModel.getKnownSoFar());
            System.out.println("you have " + (hangmanModel.getMaxAllowedIncorrectTries() - hangmanModel.getNumOfIncorrectTries()) + "tries left.");
        }
        if ( hangmanModel.hasLost())
        {
            System.out.println("You have lost! I will never tell you the secret word...");

        }
        else if ( hangmanModel.isGameOver() && !hangmanModel.hasLost())
        {
            System.out.println("You have won!! The secret word : " + hangmanModel.getKnownSoFar());

        }

    }
}
