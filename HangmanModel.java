
import cs102.*;
import java.util.*;

/**
 * Model class
 * @author EMRE KARATAS-22001641
 * @version v1.0- 14.07.2021
 */
public class HangmanModel extends Hangman
{

   private ArrayList<IHangmanView> views;

    public HangmanModel(IHangmanSetup setup)
    {
        super(setup);
        views = new ArrayList<IHangmanView>();
    }

    public void addView( IHangmanView view)
    {
          views.add(view);
          view.updateView(this);
    }

    public void update()
    {
        for (IHangmanView view: views)
        {
           view.updateView(this);
        }
    }


    @Override
    public int tryThis(char letter )
    {
        int tryThis = super.tryThis(letter);
        update();
        return tryThis;
    }
}
