package session_02_java_assignment_04;
import java.util.Scanner;

public class TestDemoMarks {

	public TestDemoMarks(int marks,int age) {
		// TODO Auto-generated constructor stub
		if(marks>70 && age>=15)
		{
			System.out.println("Grade A");
		}
		if(marks>60 && age<15)
		{
			System.out.println("Grade A");
		}
		if((marks>60)&&(marks<=70) && age>=15)
		{
			System.out.println("Grade B");
		}
		
		if((marks>45)&&(marks<=60) && age<15)
		{
			System.out.println("Grade B");
		}
		
		if(marks<61 && age>=15) 
		{
			System.out.println("Grade C");
		}
		if(marks<45 && age<15)
		{
			System.out.println("Grade C");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the marks of student:");
		
		int marks = num.nextInt();
		
		
		System.out.println("Enter the age of student:");
		
		int age= a.nextInt();
		
		TestDemoMarks t = new TestDemoMarks(marks,age);
		
	}

}
