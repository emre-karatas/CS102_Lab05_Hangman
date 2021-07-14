import cs102.IHangmanSetup;

/**
 * My initial setup
 * @author Emre Karatas-22001641
 * @version v1.0- 14.07.2021
 */
public class MySetUp  implements IHangmanSetup
{
    private static String[] words = {"jaguar", "bird", "crocodile", "panda" ,"horse" ,"penguin" };

    @Override
    public int getMaxAllowedIncorrectTries() {
        return 6;
    }

    @Override
    public char getBlankChar() {
        return '*';
    }

    @Override
    public String getCharsToPreserve() {
        return "  ";
    }

    @Override
    public String getAllLetters() {
        return "abcdefghijklmnopqrstuvwxyz";
    }

    @Override
    public String chooseSecretWord() {
        return words[( (int) (Math.random() * words.length))];
    }
}
