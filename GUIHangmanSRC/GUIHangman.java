import cs102.*;

import javax.swing.*;

/**
 * GUIHangman - GUI based MVC test for cs102 Hangman & IHangmanSetup
 *
 * @author David
 * @version 1.00 2013/4/7
 */

public class GUIHangman
{
	public GUIHangman()
	{
    	System.out.println( "Start of GUIHangman\n");

		HangmanModel		hangman;
		IHangmanSetup		basicSetup;
		ConsoleHangmanView	consoleView;

		basicSetup = new BasicSetup();
		hangman = new HangmanModel( basicSetup);
		TextFieldControlPanel textFieldControlPanel = new TextFieldControlPanel(hangman);
		textFieldControlPanel.setAlignmentX(SwingConstants.CENTER);
		NewGameButtonControl buttonControl = new NewGameButtonControl(hangman);




		consoleView = new ConsoleHangmanView();
		LabelsHangmanView labelsView = new LabelsHangmanView();
		GallowsHangmanView gallowsView = new GallowsHangmanView(hangman);
		HangmanLetterButtonControls letterButtonControls = new HangmanLetterButtonControls(hangman.getAllLetters(),13,2);
		letterButtonControls.addActionListener(new LetterButtonController(hangman));
		hangman.addView( consoleView);
		hangman.addView(labelsView);
		hangman.addView(gallowsView);
		hangman.addView(buttonControl);
		hangman.addView(letterButtonControls);

		new SimpleJFrame( "GUIHangman", 	// title
							gallowsView,			// center
							textFieldControlPanel, buttonControl,		// north, south
							letterButtonControls, labelsView );	// east, west

		// this is an infinite loop reading from the console... not clever!
		ConsoleControl.controlFor( hangman);
	}

	public static void main( String[] args)
	{
		new GUIHangman();


//		// This is the approved way to initialise GUIs
//		// but won't work with the ConsoleControl as is!
//		// --------------------------------------------
//		SwingUtilities.invokeLater(
//			new Runnable() {
//			    public void run() {
//	        		new GUIHangman();
//	        		new GUIHangman();
//	    		}
//			});
	}

} // end of class GUIHangman
