
/*7.	Reversed Chars
Write a program that takes 3 lines of characters and prints
 them in reversed order with a space between them.
Examples
Input	Output
A
B
C	C B A
1
L
&	& L 1
 * */
import java.util.Scanner;
public class ReversedChars {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char simbolOne = scanner.nextLine().charAt(0);
		char simbolTwo = scanner.nextLine().charAt(0);
		char simbolThree = scanner.nextLine().charAt(0);
		System.out.print(simbolThree+" "+simbolTwo+" "+simbolOne);
	}
}
