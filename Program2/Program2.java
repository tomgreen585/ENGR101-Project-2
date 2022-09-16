// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2022T2, Online test
 * Name:
 * Username:
 * ID:
 */



/**
 * Question 7. Writing methods with for loop. Reading files.
 *
 * This program should read numbers from the "numbers.txt" file and store the numbers in a List<Double> variable. 
 * After that the numbers are plot in a diagram.
 * 
 * The plotNumbers() method is done for you. It calls two methods that you must complete.
 * 
 * (a) [5 marks] Complete the readNumbers() method. It must,
 *                   - read the numbers from the "numbers.txt" file.
 *                   - add each number to List<Double> result.
 * 
 * (b) [10 marks] Complete the plotNumbers(...) method to draw a line plot of the numbers
 *                   - Draw the x-axis and the y-axis. The origin should be at (50, 50)
 *                   - Draw the points every 50 units (down the y-axis), plotting the data along the x-axis
 *                     (note the orientation of the plot on Blackboard)
 *                   - You should start the line plot from the origin
 *                   - You may assume the file contains at least one line and at most nine lines. 
 *                   - The graph should only plot numbers in the range of [0, 300]
 *                   - A negative number should be plot as 0, with a circle (diameter 10) around it.
 *                   - A number higher than 300 should be plot as 300, with a circle (diameter 10) around it.
 */
import ecs100.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.awt.Color;
public class Program2
{
    /**
     * Constants
     */
    private static final double X_AXIS = 50;
    private static final double Y_AXIS = 50;
    private static final double STEP = 50;
    private static final double DIAMETER = 10;
    
    public void plotNumbers() {
       
    
        List<Double> numbers = this.readNumbers();
        Scanner numbersTxt = new Scanner(new File("numbers.txt"));

        

        while(numbersTxt.hasNextDouble())
        {
            numbersTxt.add(numbersTxt.nextDouble());
        }
        numbersTxt.close();

        

    }

        
        //
        //UI.drawLine(Y_AXIS-2,X_AXIS, DIAMETER+2, DIAMETER);
        //UI.drawLine(Y_AXIS,X_AXIS,Y_AXIS,(Y_AXIS-(DIAMETER)+2));
        //double total = 0;
        //try {
            //Scanner numbersTxt = new Scanner(new File("Numbers.txt));
            //
            //for(numbersTxt.hasNextDouble()){
            //line==line;
            //total=total+1;   
            //}
            //double step = (GRAPH_RIGHT - GRAPH_LEFT) / (total - 1);
            //double x = GRAPH_LEFT;
            //for(String line : allLines) {
                //Scanner scan = new Scanner(line);
                //double y = scan.nextDouble();
                //double numOfPoints = Double.parseDouble(line);   
                //x = x + step; 
                //y = GRAPH_BASE - numOfPoints;
                //UI.drawLine(x-2, y, x+2, y);
                //UI.drawLine(x, y-2, x, y+2);
                //}
        //} catch(IOException e){UI.println("File reading failed");}
    
    
    

    
    
    public List<Double> readNumbers() {
        List<Double> result = new ArrayList<Double>();
        
        /*# YOUR CODE HERE */
        
        /*# END OF YOUR CODE */
        
        return result;
    }
    
    public void plotNumbers(List<Double> numbers) {
        UI.clearGraphics();
        /*# YOUR CODE HERE */
        
        /*# END OF YOUR CODE */
    }
    
    /*********************************************
     * YOU CAN IGNORE EVERYTHING BELOW THIS LINE *
     *********************************************/
    public void setupGUI() {
        UI.initialise();
        UI.addButton("Run", this::plotNumbers);
        UI.setWindowSize(800,500);
        UI.setDivider(0.3);
    }
    
    public static void main(String[] args) {
        new Program2().setupGUI();
    }
}
