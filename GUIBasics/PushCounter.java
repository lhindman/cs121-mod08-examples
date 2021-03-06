import javax.swing.JFrame;

/**
 * Demonstrates a graphical user interface and an event listener.
 * 
 * @author Java Foundations
 * @author CS121 Instructors
 */
public class PushCounter
{
   /**
    * Creates and displays the main program frame.
    * @param args
    */
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Push Counter");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      PushCounterPanel panel = new PushCounterPanel();
      frame.getContentPane().add(panel);

      frame.pack();
      frame.setVisible(true);

   }
}
