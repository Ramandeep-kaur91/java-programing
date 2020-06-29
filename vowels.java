package dd;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int vcount=0;
		String str="This is a sentence";
		char ch;
for(int i=0;i<str.length();i++)
{
	ch=str.charAt(i);
	if(ch=='a'||ch=='o'||ch=='e'||ch=='i')
	{
		vcount++;
	}
}
System.out.println("number of vowels :"+vcount);
	
}
}