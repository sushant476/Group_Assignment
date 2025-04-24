import java.util.Scanner;
public class Invoice {
	private String partNumber;
	private String partDesc;
	private int qty;
	private double price;
	
	public Invoice () {}
	
	public Invoice (String partNumber, String partDesc, int qty, double price)
	{
		this.partNumber = partNumber;
		this.partDesc = partDesc;
		if (qty<0) {qty = 0;}
		this.qty = qty;
		if (price<0) {price = 0;}
		this.price = price;
	}
	
	public String getPartNumber() {
		return this.partNumber;
		}
	
	public String getPartDesc() {
		return this.partDesc;
		}
	
	public int getQty() {
		return this.qty;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public double calcBillAmt() {
		System.out.println("Bill Invoice!!");
		double billAmt = this.qty * this.price;
		return billAmt;
	}
}

class InvoiceTest {
	Invoice i1 = new Invoice();
	public void accept() {
		System.out.println("Enter part number:");
		Scanner input = new Scanner (System.in);
		i1.setPartNumber(input.nextLine());
		
		System.out.println("Enter part Name:");
		i1.setPartDesc(input.nextLine());
		
		System.out.println("Enter Quantity:");
		i1.setQty(input.nextInt());
		
		System.out.println("Enter Price:");
		i1.setPrice(input.nextInt());
	}
	
	public void display() {
		System.out.println("Part Number:"+i1.getPartNumber());
		System.out.println("Part Description:"+i1.getPartDesc());
		System.out.println("Part Quantity:"+i1.getQty());
		System.out.println("Part Price:"+i1.getPrice());
		System.out.println("Total Bill Amount:"+i1.calcBillAmt());
	}
	
} 