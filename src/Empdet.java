import java.util.Scanner;
public class Empdet {

	public static void main(String[] args) {
		 int Basic, Hra, Ga, Pf, Id, Net;
	        String Name, Address;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Employee Details name id address");
	        Name = sc.nextLine();
	        Id = sc.nextInt();
	        Address = sc.next();
	        System.out.println("Employee Salary Details");
	        Basic = sc.nextInt();
	        Hra = sc.nextInt();
	        Ga = sc.nextInt();
	        Pf = sc.nextInt();
	        Net = (Basic + Hra + Ga) - Pf;
	        System.out.println("Employee Details");
	        System.out.println(
	                "Employee Name :" + Name + "\n" + "Employee Id :" + Id + "\n" + "Employee Address :" + Address);
	        System.out.println("Net Salary Per month :" + Net);
	    }

	 

}


	


