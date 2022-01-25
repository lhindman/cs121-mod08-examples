![CS121 Banner](images/CS121-BANNER.svg)
# Module 8 - Graphical User Interface Guided Experimentation
The purpose of this guided experimentation is to provide students with an opportunity to experiment with the code examples presented in the lecture. It is important to keep detailed observation in your coding journal as you work through the experiments below. These observations will be useful to you as you complete the labs and you will be allowed to reference them on open book / open note quizzes.  

***You are not required to turn in your observations.***
## Getting Started
To get started on this activity, please clone this repository into your development environment  

Steps to Clone Examples
1. Copy the URL for this repo by clicking the green "Code" button above, select HTTPS then click the copy icon.
2. Open VSCode, click the Source Control icon then click Clone Repository.
3. Paste the repo URL into the "Provide repository URL" field and press Enter.
4. Browse to the location in your development environment where you want to store the repostory and click Select Repository Location.
5. When prompted, Open the repository then Open the workspace.

## GUI Basics Experimentation   
Open *PushCounterPanel.java* and *PushCounter.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
   - Add the following code to the constructor for the **PushCounterPanel** class. Then run the program and hover over the button without clicking.  What is the result? Record your observations.  
    
   ```
   pushButton.setToolTipText("Click Me!");
   ```
   
   - Add the following code to the ***actionPerformed()*** method in the **ButtonListener** class. Then run the program and click the button several times.  What is the result? Record your observations.  

    ```
    if (count % 2 == 0)
    {
       pushButton.setBackground(Color.GREEN);
    } 
    else 
    {
       pushButton.setBackground(Color.YELLOW);
    }
    ```  
    
   - It is always fun to show a little bit of school pride in our creative endevours. To that end, all the following Color constants near the top of the **PushCounterPanel** class, on the lines below the *LIGHT_GREEN* constant. Then pick one and change the background from *LIGHT_GREEN* to your selection. The consider this... Is it possible to toggle the background color of the **PushCounterPanel** similar to how we're changing the background color of the pushButton?  Why or why not? Record your thoughts in the coding journal.  
   
   ```
   private static final Color BOISE_STATE_ORANGE = new Color(214,67,9);
   private static final Color BOISE_STATE_BLUE  = new Color(0,51,160);
   ```  
	

## GUI Components Experimentation
As mentioned in the lecture videos, it would be convenient if we had a label on each slider in the **RGBSliderDemo** class to display the current value of the slider. Let's implement that functionality here. Open *RGBSliderDemo.java*, read the code and run it to ensure it functions properly. Then work through each of the experiments below and record your observations.  
   - Use the following code to add three **JLabel** instance variables to the **RGBSliderDemo** class. Don't forget to import *javax.swing.JLabel*.  
 
   ```
   private JLabel redLabel, greenLabel, blueLabel;
   ```   
   
   - Add the following code near the middle of the **RGBSliderDemo** constructor, immediately after the slider panels are setup,  to instantiate three **JLabel** objects, initialize them with the current slider value and add them to the appropriate slider panel. What happens to the labels when the slider is moved?  Run the program and record the results.   
   
   ```
   redLabel = new JLabel(Integer.toString(redSlider.getValue()));
   redSliderPanel.add(redLabel);
 
   greenLabel = new JLabel(Integer.toString(greenSlider.getValue()));
   greenSliderPanel.add(greenLabel);

   blueLabel = new JLabel(Integer.toString(blueSlider.getValue()));
   blueSliderPanel.add(blueLabel);  
   ```
   
   - Add the following private method to the **RGBSliderDemo** class and call it at the end of the ***stateChanged()*** method in the **ColorSelectorListener** class. Run the program and record your observations.  
   ```
    private void updateSliderLabels() {
        int red = this.redSlider.getValue();
        int green = this.greenSlider.getValue();
        int blue = this.blueSlider.getValue();

        this.redLabel.setText(Integer.toString(red));
        this.greenLabel.setText(Integer.toString(green));
        this.blueLabel.setText(Integer.toString(blue));
    }
   ```
   
## SnakeEyes Experimentation
It is often helpful to see a fully functional program that demonstates how to interact with a custom class to see how to use it. That is exactly why the SnakeEyes program was written.  It is a simple dice game that uses the **DieButton** class development in class. Please take some time and study the code in *SnakeEyes.java*, paying particular attention to how the DieButton class is used as well as how the game logic is implemented. Use the following prompts to guide your experimentation.  

   - Play two or three games of **SnakeEyes** and the study the scoring logic that is implemented in the ***actionPerformed()*** method of the **GameButtonListener** class. Under what conditions does the player score?  
   - Continuing the review of the ***actionPerformed()*** method, when is the game over?  
   - The bulk of the GUI is set up in the Constructor for the **SnakeEyes** class. This is normal because the purpose of a constructor is to set up a class and get it ready for use. However there are two additional private methods, ***resetGame()*** and ***updateScores()*** with ***resetGame()*** being called from the constructor as well as the ***actionPerformed()*** method. Study the structure of the code and see if you can identify why this method used this way?  
   - Similar to the ***resetGame()*** private method, the ***updateScores()*** method is called from multiple places. Where is it called and why does it make sense to call it at that position?  If you are having trouble figuring out the why, comment out one of the calls and play a few games to see how it behaves.  
