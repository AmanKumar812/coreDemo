import java.util.Scanner;
public class Studet {

	public static void main(String[] args) {
		String name,roll,course;
        int sub1,sub2,sub3,sub4,sub5;
         
        Scanner s=new Scanner(System.in);
         
        System.out.println("Enter Name: ");
        name=s.nextLine();
        System.out.print("Enter Roll Number: ");
        roll=s.nextLine();
        System.out.println("Enter Course: ");
        course=s.nextLine();
        System.out.println("Enter marks in Sub1,Sub2,Sub3,Sub4,Sub5: ");
        sub1=s.nextInt();
        sub2=s.nextInt();
        sub3=s.nextInt();
        sub4=s.nextInt();
        sub5=s.nextInt();
 
        int total=sub1+sub2+sub3+sub4+sub5;
        float perc=(float)total/500*100;
       
         
        System.out.println("Roll Number:" + roll);
        System.out.println("Name:"+name);
        System.out.println("course:"+course);
        System.out.println("Total: "+total +"\tPercentage: "+perc);
       
        if(perc>75)
        {
        	System.out.println("Distinction");
        	
        	
          
    }
        else if(perc<75&&perc>50)
    	{
    		System.out.println("first class");
        
}
        else if(perc<50&&perc>35)
        {
        	System.out.println("second class");
        }
        else 
        {
        	System.out.println("Fail");
        }

	}

}
