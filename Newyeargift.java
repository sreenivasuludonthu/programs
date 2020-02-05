import java.util.*;
public class Newyeargift
{
	public static void main(String[] args) 
	{
	    int[] weightarray = new int[20];
        int i,total,price,weight,high,low;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter total number of gifts");
        total=s.nextInt();
        for(i=1;i<=total;i++)
        {
            System.out.println("Enter the weight and price of sweet in "+i+" gift");
            weight=s.nextInt();
            price=s.nextInt();
            weightarray[i-1]=weight;
        }
        System.out.println("Enter higher and lower range to sort gifts");
        high=s.nextInt();
        low=s.nextInt();
        Newyeargift ng= new Newyeargift();
        ng.giftsort(high,low,weightarray,total);
	}
}
class Newyeargift
{
    void giftsort(int h,int l,int[] weight,int n)
    {
        int[] sweetsort=new int[20];
        int j=0,totalweight=0;
        for(int i=0;i<n;i++)
        {
            totalweight=totalweight+weight[i];
            if(weight[i]>=l&&weight[i]<=h)
            {
                sweetsort[j]=weight[i];
                j++;
            }
        }
        System.out.println("Total weight of sweet in all gifts :"+totalweight);
        j=0;
        Arrays.sort(sweetsort);
        System.out.println("Sorting order of gits is:");
        for (int num : sweetsort) {
            if(num!=0)
            {
                System.out.println(num);
                j++;
            }
        }
        System.out.println("Total number of gits in given range: "+j);
    }
}