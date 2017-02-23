/*
 * @author Tracy L. Quintos
 * @assignment #2 page 116 #11 version 2
 * @date 2/22/17
 *
 */
import javax.swing.JOptionPane;


public class MinutesConversion2 {

/*
* Write a program that accepts a number of minutes and converts it both to hours
*and days. For example, 6000 minutes equals 100 hours and equals 4.167 days. Save
*the class as MinutesConversion.java.
*/
	public static void main(String[] args) {
		
		String inputMinutes;
		int hours;
		float days;
									
		inputMinutes = JOptionPane.showInputDialog(null, "Please enter minutes for conversion", "Minutes Conversion", JOptionPane.INFORMATION_MESSAGE);
														
		//60 minutes = 1 hour
		//6000 minutes = 4.167 days
		
	     hours = Integer.parseInt(inputMinutes) / 60; //equation to convert minutes by 60 to get hours
	     days = hours / 24.0f;						  //equation to convert hours by 24 as a float to get the days
	
	     
	     JOptionPane.showMessageDialog(null, "There are " + hours + " hour(s)" + " in " + inputMinutes + " minutes.", "Minutes to Hours", JOptionPane.INFORMATION_MESSAGE);
		 JOptionPane.showMessageDialog(null, "There are " + days + " day(s)" + " in " + inputMinutes + " minutes.", "Minutes to Days ", JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}
