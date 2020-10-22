
/*12.	Refactor Special Numbers - III.	Variables
You are given a working code that is a solution to Problem 10. Special Numbers.
 However, the variables are improperly named, declared before they are needed and
  some of them are used for multiple things. Without using your previous solution,
   modify the code so that it is easy to read and understand.
Code
Sample Code
Scanner scanner = new Scanner(System.in);
int kolkko = Integer.parseInt(scanner.nextLine());
int obshto = 0;
int takova = 0;
boolean toe = false;
for (int ch = 1; ch <= kolkko; ch++) {
    takova = ch;
    while (ch > 0) {
        obshto += ch % 10;
        ch = ch / 10;
    }
    toe = (obshto == 5) || (obshto == 7) || (obshto == 11);
    System.out.printf("%d -> %b%n", takova, toe);
    obshto = 0;
    ch = takova;
}
Hints
•	Reduce the span of the variables by declaring them in the
 moment they receive a value, not before
•	Rename your variables to represent their real purpose 
(example: "toe" should become isSpecialNum, etc.)
•	Search for variables that have multiple purpose. If you find any, introduce a new variable
 * */
import java.util.Scanner;
public class RefactorSpecialNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		int numberSum = 0;
		int numberChange = 0;
		Boolean falseTrue = false;
		for (int i = 1; i <= number; i++) {
		   numberChange = i;
		    while (i > 0) {
		        numberSum += i % 10;
		     i = i / 10;
		    }
		    falseTrue = (numberSum == 5 || numberSum == 7 || numberSum == 11);
		    if (falseTrue.equals(false)) {
		    	 System.out.printf("%d -> False%n", numberChange);
			} else {
				 System.out.printf("%d -> True%n", numberChange);
			}
		   numberSum = 0;
		    i=numberChange;
		}
	}
}
