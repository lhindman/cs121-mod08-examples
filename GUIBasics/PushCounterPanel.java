import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
// import javax.swing.JFrame;

/**
 * Demonstrates a graphical user interface and an event listener.
 * 
 * @author Java Foundations
 * @author CS121 Instructors
 */
@SuppressWarnings("serial")
public class PushCounterPanel extends JPanel
{
   private static final Color LIGHT_GREEN = new Color(206, 255, 199);
   private static final Color BOISE_STATE_ORANGE = new Color(214,67,9);
   private static final Color BOISE_STATE_BLUE  = new Color(0,51,160);
	 
   private int count;
   private JButton pushButton;
   private JLabel pushCountLabel;

   /**
    * Constructor: Sets up the GUI panel
    */
   public PushCounterPanel()
   {
	  // initialize the components
      count = 0;
      pushButton = new JButton("Push Me!");
      pushCountLabel = new JLabel("Pushes: " + count);
      
      // add the action listener (aka. event handler) to the button.
      pushButton.addActionListener(new ButtonListener());

      pushButton.setToolTipText("Click Me!");

      // add the button and label to this panel
      add(pushButton);
      add(pushCountLabel);

      // set the background color and preferred size of this panel.
      setBackground(BOISE_STATE_ORANGE);
      setPreferredSize(new Dimension(300, 40));
   }

   /**
    * Represents a listener for button push (action) events.
    */
   private class ButtonListener implements ActionListener
   {
      /**
       * Updates the counter and label when the button is pushed.
       */
      public void actionPerformed(ActionEvent event)
      {
         count++;
         
         // replace the text of the existing label with the new text.
         pushCountLabel.setText("Pushes: " + count);

         if (count % 2 == 0)
         {
            pushButton.setBackground(Color.GREEN);
         } 
         else 
         {
            pushButton.setBackground(Color.YELLOW);
         }
      }
   }

}
