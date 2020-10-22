

/*8.	Lower or Upper
Write a program that prints whether a given character is upper-case or lower-case.
Examples
Input	Output
L	upper-case
f	lower-case
 * */
import java.util.Scanner;
public class LowerOrUpper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//	String simbol = scanner.nextLine();
	char simbol = scanner.nextLine().charAt(0);
	if (Character.isAlphabetic(simbol)) {
		if (simbol>='A' && simbol<='Z') {
			System.out.println("upper-case");
		} else if (simbol>='a' && simbol<='z') {
			System.out.println("lower-case");
		}
			} else {
		System.out.println("Please insert Alphabetic!");
		}  
	}
}
