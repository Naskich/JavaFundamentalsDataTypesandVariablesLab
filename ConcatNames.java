
/*5.	Concat Names
Read two names and a delimiter. Print the names joined by the delimiter.
Examples
Input	Output
John
Smith
->	John->Smith
Jan
White
<->	Jan<->White
Linda
Terry
=>	Linda=>Terry

 * */
import java.util.Scanner;
public class ConcatNames {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();
		String failyName = scanner.nextLine();
		String simbol = scanner.nextLine();
		System.out.printf("%s%s%s",firstName,simbol,failyName);
	}
}
