package dd;

import java.util.Scanner;

public class students {
	String rollno;
	String name;
	Scanner sc=new Scanner(System.in);
	public void data()
	{
		System.out.println("Enter the roll number");
		rollno=sc.next();
		System.out.println("Enetr the name of students");
		name=sc.next();
	}
	public void display()
	{
		System.out.println("rollno:"+rollno);
		System.out.println("name:"+name);
	}

	public static void main(String[] args) {
		students detail=new students();
		detail.data();
		detail.display();
	}

}
