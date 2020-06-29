package dd;

import java.util.Scanner;

public class tble1 {

	public static void main(String[] args) {
		int n,count=1;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value in n");
	n=s.nextInt();
	while(count<=10)
	{
		System.out.println("table of given number is:"+(n*count));
		count++;
	}
	}

}
