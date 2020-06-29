package dd;

import java.util.Scanner;

public class largest_number {
	int array[]= {4,89,46,34};
	int num1,num2;
	int firstlargest,Secondlargest;
	Scanner sc=new Scanner(System.in);
	

	public void second_largest()
	{
		System.out.println("Enter the value");
	num1 =sc.nextInt();
	
	num2= sc.nextInt();
	
	if(num1>num2)
	{
	firstlargest=num1;
	Secondlargest=num2;
	}
	else
	{
		firstlargest=num2;
		Secondlargest=num1;
	}
	
	for( int i=0;i<array.length;i++)
	{
		if(array[i]>firstlargest)
		{
			Secondlargest=firstlargest;
			firstlargest=array[i];
		}
		else
			if(array[i]<firstlargest||array[i]>Secondlargest)
			{
				Secondlargest=array[i];
			}
	}
	}
	
	public void print()
	{
		System.out.println("Second largest element is:"+Secondlargest);
	}
	public static void main(String[] args) {
		largest_number oo=new largest_number();
		oo.second_largest();
		// TODO Auto-generated method stub
	oo.print();
	}

}
