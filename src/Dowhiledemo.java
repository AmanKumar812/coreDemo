import java.util.Scanner;

// Sum of positive numbers
public class Dowhiledemo {

	public static void main(String[] args) {
		int sum = 0;
	    int number = 0;

	 Scanner input = new Scanner(System.in);
	//do... while continues
	//Untill enterd number is positive 
	 do {
		 sum+=number;
		 System.out.println("Enter a number");
		 number=input.nextInt();
	 }
	 while(number>=0);
		 System.out.println("sum="+ sum);
	 input.close();
	 }

	}


