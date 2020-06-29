package dd;

public class contains {

	public static void main(String[] args) {
		String str="hello how are you?";
		int count=0;
		char ch;
		for(int i=0;i<str.length();i++) {
		ch=str.charAt(i);
		if(ch=='h')
		{
count++;
	}
		}
System.out.println("number of h occures:"+count);

	}
}
