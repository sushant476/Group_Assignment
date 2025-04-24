import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter any number:");
	int number = input.nextInt();
//	Integer num1 = number;
	System.out.println("Entered number: "+number);
	System.out.println("Binary :"+Integer.toBinaryString(number));
	System.out.println("Octadecimal :"+Integer.toOctalString(number));
	System.out.println("Hexadecimal :"+Integer.toHexString(number));
	}

}
