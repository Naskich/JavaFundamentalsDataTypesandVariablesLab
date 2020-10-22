
/*3.	Exact Sum of Real Numbers
Write program to enter n numbers and calculate and print their exact sum (without rounding).
Examples
Input	Output
3
1000000000000000000
5
10	1000000000000000015

2
0.00000000003
333333333333.3	333333333333.30000000003
Hints
Use BigDecimal to not lose precision.

 * */
import java.math.BigDecimal;
import java.util.Scanner;
public class ExactSumRealNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int number = Integer.parseInt(scanner.nextLine());		 	
	 BigDecimal numberLong = new BigDecimal(0);
		 for (int i = 0; i < number; i++) {
			BigDecimal lastNumber = new BigDecimal(scanner.nextLine());		
		numberLong = numberLong.add(lastNumber);	
		}
		 System.out.println(numberLong);
	}
}
