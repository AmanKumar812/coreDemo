import java.util.Scanner;

public class Singledigit {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=s.nextInt();
		if(a<10 && a>-10)
		{
			System.out.println("a is single digit");
		}
		else
		{
			System.out.println("a is not single digit");
		}

	}

}
