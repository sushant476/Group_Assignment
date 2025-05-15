//2. Create array of employees and search employee by
//i.empid
//ii.name
class Employee{
	private String name;
	private int empid;
	public Employee(String name,int empid) {
		 
		this.name = name;
		this.empid=empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + "]";
	}
	
	
}
public class SearchEmployee {
   public static void main(String[]args) {
	   Employee []arr= {
			   new Employee("sushant",11),
			   new Employee("khalid",22),
			   new Employee("kunal",33),
			   new Employee("shailesh",44),
			   new Employee("ravi",56)
	   };
	   int indexFound=searchByEmpid(arr,44);
	   int indexFound1=searchByName(arr,"sushant");
	   System.out.println("Employee is found:"+arr[indexFound1]);
   }
   public static int searchByEmpid(Employee[]arr,int empid) {
	   int temp=-1;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i].getEmpid()==empid) {
			   temp=i;
		   }
	   }
	   return temp;
   }
   public static int searchByName(Employee[]arr,String name) {
	   int temp=-1;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i].getName()==name) {
			   temp=i;
		   }
	   }
	   return temp;
   }
}
