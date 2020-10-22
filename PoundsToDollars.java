

/*Write a program that converts British pounds
to US dollars formatted to 3th decimal point.
1 British Pound = 1.31 Dollars
Examples
Input	Output
80	104.800
39	51.090
 * */
import java.util.Scanner;
public class PoundsToDollars {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		String britishPaund = scanner.nextLine();
		Double dolarPound = Double.valueOf(britishPaund);
		double dolarUs = dolarPound*1.31;
		System.out.printf("%.3f",dolarUs);
	}
}
