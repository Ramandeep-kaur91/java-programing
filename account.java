package dd;

public class account {
	int a;
	int b;
	public void setdata(int a,int b)
	{
	this.a=a;
	this.b=b;
	}
	public void showdata()
	{
		System.out.println("value of a is:"+a);
		System.out.println("value of b i:"+b);
	}
	
public static void main(String[] args) {
		account obj1=new account();
		obj1.setdata(2,3);
		obj1.showdata();
		account obj2=new account();
		obj2.setdata(4,5);
		obj2.showdata();
		// TODO Auto-generated method stub

	}

}
