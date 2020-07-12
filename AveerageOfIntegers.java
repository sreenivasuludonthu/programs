//import java.until.*;
import java.util.stream.Stream;
import java.util.*;
class  AveerageOfIntegers
{
	public static void main(String args[])
	{
		List<Integer> array=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=s.nextInt();
			array.add(a);
		}
		float sum = array.stream().reduce(0, (a,b) -> a+b); 
		float avg=sum/n;
        System.out.printf("%.2f:",avg); 
	}
}
		