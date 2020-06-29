package dd;

public class sum_equals {
	int number=10;
	int arr[]= {6,4,20,-10,8,2};
	public void addition()
	{
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==number)
				{
					System.out.println(arr[i]+"+"+arr[j]+"="+number);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum_equals oo=new sum_equals();
oo.addition();
	}

}
