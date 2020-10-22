
/*10.	Special Numbers
A number is special when its sum of digits is 5, 7 or 11.
Write a program to read an integer n and for all numbers in the range 1…n 
to print the number and if it is special or not (True / False).
Examples
Input	Output
15	1 -> False
2 -> False
3 -> False
4 -> False
5 -> True
6 -> False
7 -> True
8 -> False
9 -> False
10 -> False
11 -> False
12 -> False
13 -> False
14 -> True
15 -> False
Hints
To calculate the sum of digits of given number num,
 you might repeat the following: sum the last digit (num % 10) 
 and remove it (sum = sum / 10) until num reaches 0.
60т. point-answer from 100! 
 * */
import java.util.Scanner;
public class SpecialNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		int sumNumber =0 ;
		for (int i = 1; i <= number; i++) {
			if (number>0 && number<10) {
				if (i%5==0 || i%7==0) {
					System.out.println(i+" -> True");
				} 
				if (i%5!=0 && i%7!=0) {
					System.out.println(i+" -> False");
				}
			} else {
				int zeroNumber = (i/1000)%10;
				int firstNumber =(i/100)%10;
				int secondNumber =(i/10)%10;
				int thirdNumber = i%10;
				sumNumber=firstNumber+secondNumber+thirdNumber+zeroNumber;
				if (sumNumber%5==0 || sumNumber%7==0 || sumNumber%11==0) {
					System.out.println(i+" -> True");
				}
				if (sumNumber%5!=0 || sumNumber%7!=0 || sumNumber%11!=0) {
					System.out.println(i+" -> False");
				}
			}
		}
	}
}
