package dd;

import java.util.Scanner;

public class mathematics {
	String num1,num2;
	String res;
	Scanner b=new Scanner(System.in);
	public void data()
	{
	System.out.println("enter the ist number");
	num1=b.next();
	System.out.println("enetr the 2nd number");
	num2=b.next();
	res=(num1+num2);
	}
		public void display() {
		System.out.println(num1+num2+"result is:");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
mathematics r=new mathematics();
r.data();
r.display();
	}

}