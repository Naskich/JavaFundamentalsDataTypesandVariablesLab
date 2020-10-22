
/*11.	Refactor Volume of Pyramid - III.	Variables
You are given a working code that finds the volume of a pyramid. However, 
you should consider that the variables exceed their optimum span and have improper naming.
 Also, search for variables that have multiple purpose.
Code
Sample Code
Scanner scanner = new Scanner(System.in);
double dul, sh, V = 0;
System.out.print("Length: ");
dul = Double.parseDouble(scanner.nextLine());
System.out.print("Width: ");
sh = Double.parseDouble(scanner.nextLine());
System.out.print("Height: ");
V = Double.parseDouble(scanner.nextLine());
V = (dul + sh + V) / 3;
System.out.printf("Pyramid Volume: %.2f", V);
Hints
•	Reduce the span of the variables by declaring them in the moment 
they receive a value, not before
•	Rename your variables to represent their real purpose (example: 
"dul" should become length, etc.)
•	Search for variables that have multiple purpose. If you find any, introduce a new variable.
 * */
import java.util.Scanner;
public class RefactorVolumeOfPyramid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double volume = 0;
		System.out.print("Length: ");
	double lenght = Double.parseDouble(scanner.nextLine());
		System.out.print("Width: ");
	double	whidth = Double.parseDouble(scanner.nextLine());
		System.out.print("Height: ");
	double	height = Double.parseDouble(scanner.nextLine());
		volume = (lenght * whidth * height) / 3;
		System.out.printf("Pyramid Volume: %.2f", volume);
	}
}
