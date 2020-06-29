package dd;

public class empdemo {
	public void disp()
	{
		encapsulate oo=new encapsulate();
		oo.setdesignation("tester");
		System.out.println(oo.getdesignation());
		oo.setname("ram");
		System.out.println(oo.getname());
		oo.setsal("10000");
		System.out.println(oo.getsal());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
empdemo oo=new empdemo();
oo.disp();
	}

}
