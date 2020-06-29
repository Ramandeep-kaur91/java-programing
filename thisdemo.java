package dd;

public class thisdemo {
	int area;
	public thisdemo(int area)
	{
	
		System.out.println("area is:"+this.area);
	}
public thisdemo()
{
	this(2022);
	System.out.println("this is construct");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
thisdemo oo=new thisdemo();
	}

}
