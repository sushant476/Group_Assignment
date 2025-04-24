import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		double n1=0;
		double n2=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two values:");
		if (!input.hasNextInt()) {		
			if(!input.hasNextDouble()) {
				System.out.println("Entered number is not double");	
			} else {
				n1=input.nextDouble();
//			System.out.println("Number 1:"+n1);
			}
			
			if(!input.hasNextDouble()) {
				System.out.println("Entered number is not double");	
			} else {
				n2=input.nextDouble();
			}
//			System.out.println("Number 2:"+n2);	
			
			double Avg = (n1+n2)/2;
			System.out.println("Average:"+Avg);
			
		}else {System.out.println("You have entered integer value");}
		input.close();				
		}
}
