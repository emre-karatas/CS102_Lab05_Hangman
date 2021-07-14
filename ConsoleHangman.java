import java.util.Scanner;
import cs102.*;

/**
 * ConsoleHangman
 *
 * @author Emre Karatas-22001641
 * @version 1.00 2013/4/7
 */

public class ConsoleHangman
{
    public static void main( String[] args)
	{
    	Scanner scan = new Scanner( System.in);
		HangmanModel hangmanModel;

		// PROGRAM CODE
		hangmanModel = new HangmanModel( new MySetUp() );
		hangmanModel.addView(new ConsoleHangmanView());

		System.out.println( hangmanModel.getKnownSoFar() );

		// ToDo - allow user to repeatedly enter a letter and tryThis letter
		//		  then show game status, until gameover. Finally report win/lose.

		do {
			System.out.print("Please enter a letter: ");
			char letter = scan.next().charAt(0);
			hangmanModel.tryThis(letter);
		} while(!hangmanModel.isGameOver());
		System.out.println( "\nEnd of ConsoleHangman\n" );
	}

} // end of class ConsoleHangman
