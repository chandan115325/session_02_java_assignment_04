package session_02_java_assignment_04;
import java.util.Scanner;
public class TestDemo {

	public TestDemo(int num) {
		// TODO Auto-generated constructor stub
		if(num>0)
		{
			System.out.print("You have entered a positive value.");
		}
		
		if(num==0)
		{
			System.out.print("You have entered a zero.");
		}
		
		if(num<0)
		{
			System.out.print("You have entered a negative value.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
	     
		   System.out.println("Enter your no:");  
		   int no=sc.nextInt();
		   TestDemo t = new TestDemo(no);
		   //System.out.println("Enter your name");  
		   //String name=sc.next();  
		   //System.out.println("Enter your fee");  
		   //double fee=sc.nextDouble();  
		   //System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);  
		   sc.close();  
	}

}
