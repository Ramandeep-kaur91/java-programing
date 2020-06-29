package dd;

import java.util.Scanner;

public class staticdemo {
	static int counter;
	static int rollno;
	static Scanner sc=new Scanner(System.in);
	public static void disp() {
		counter++;
		System.out.println("Counter is:"+counter);
	System.out.println("Enter the roll number:"+rollno);
		rollno=sc.nextInt();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   disp();
	}

}
