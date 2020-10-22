
/*6.	Chars to String
Write a program that reads 3 lines of input.
 On each line you get a single character. 
 Combine all the characters into one string and print it on the console.
Examples
Input	Output
a
b
c	abc
%
2
o	%2o
 * */
import java.util.Scanner;
public class CharsToString {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		char simbolOne= scanner.nextLine().charAt(0);
		char simbolTwo= scanner.nextLine().charAt(0);
		char simbolThree= scanner.nextLine().charAt(0);
		System.out.print(simbolOne+""+simbolTwo+""+simbolThree);
	}
}
