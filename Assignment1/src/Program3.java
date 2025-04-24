import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// Resturant menu
		System.out.printf("1.Chai-5\n2.Samosa-10\n3.VadaPav-10\n4.MissalPav-30\n5.DahiKacori-20\n6.Poha-20\n7.Upma-20\n8.BreadPakoda-10\n9.Coffee-10\n10.Idli-25\n0.Exit\n");
		Scanner input = new Scanner(System.in);
		int qty = 0;
		int billAmt = 0;
		int choice = 0;
		
		do {
			System.out.println("Enter your choice");
			choice = input.nextInt(); 
			
		switch (choice) {
		case 1:{
			System.out.println("Enter Quantity for Chai:");
			qty = input.nextInt();
			int price = 5;
			billAmt += price * qty;
			break;}
		case 2:{
			System.out.println("Enter Quantity for Samosa:");
			qty = input.nextInt();
			int price = 10;
			billAmt += price * qty;
			break;}
		case 3:{
			System.out.println("Enter Quantity for VadaPav:");
			qty = input.nextInt();
			int price = 10;
			billAmt += price * qty;
			break;}
		case 4:{
			System.out.println("Enter Quantity for MissalPav:");
			qty = input.nextInt();
			int price = 30;
			billAmt += price * qty;
			break;}
		case 5:{
			System.out.println("Enter Quantity for DahiKachori:");
			qty = input.nextInt();
			int price = 20;
			billAmt += price * qty;
			break;}
		case 6:{
			System.out.println("Enter Quantity for Poha:");
			qty = input.nextInt();
			int price = 20;
			billAmt += price * qty;
			break;}
		case 7:{
			System.out.println("Enter Quantity for Upma:");
			qty = input.nextInt();
			int price = 20;
			billAmt += price * qty;
			break;}
		case 8:{
			System.out.println("Enter Quantity for BreadPakoda:");
			qty = input.nextInt();
			int price = 10;
			billAmt += price * qty;
			break;}
		case 9:{
			System.out.println("Enter Quantity for Coffee:");
			qty = input.nextInt();
			int price = 10;
			billAmt += price * qty;
			break;}
		case 10:{
			System.out.println("Enter Quantity for Idli:");
			qty = input.nextInt();
			int price = 25;
			billAmt += price * qty;
			break;}
		}
		}while(!(choice==0));
	System.out.println("Total Bill Amount:"+billAmt+" Rupees Only");
	}

}
