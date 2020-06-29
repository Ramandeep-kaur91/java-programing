package dd;

public class staticblockdemo {
	static int num;
	static String mystr;
	static
	{
		num=89;
		mystr="it is used like";
		
	}
	public static void main(String[]args)
	{
		System.out.println("value of num is:"+num);
		System.out.println("value of mystr is:"+mystr);
	}

}
