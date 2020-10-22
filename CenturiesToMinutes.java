
/*9.	Centuries to Minutes
Write program to enter an integer number of centuries and convert it to years,
 days, hours and minutes.
Examples
Input	Output
1	1 centuries = 100 years = 36524 days = 876576 hours = 52594560 minutes
5	5 centuries = 500 years = 182621 days = 4382904 hours = 262974240 minutes
Hints
•	Use appropriate data type to fit the result after each data conversion.
•	Assume that a year has 365.2422 days at average (the Tropical year).
 * */
import java.util.Scanner;
public class CenturiesToMinutes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int  centuries = Integer.parseInt(scanner.nextLine()); 
        int years = 100;
        years = centuries*years; 
        int days = (int) (years*365.2422); 
        int hours = days * 24;
        int minutes = hours*60;
        System.out.printf(" %d centuries = %d years = %d days = %d hours = %d minutes",centuries,years,days,hours,minutes);
	}
}
