import java.util.*;
class Values
{
    public int a;
    public int b;
    public double c;
}
class Addition extends Values
{
    public void calculate(int a,int b,Values v)
    {
        v.c=a+b;
        System.out.println("Addition of two numbers is:"+v.c);
    }
}
class Subtraction extends Values
{
    public void calculate(int a,int b,Values v)
    {
        v.c=a-b;
        System.out.println("Subtraction of two numbers is:"+v.c);
    }
}
class Multiplicaton extends Values
{
    public void calculate(int a,int b,Values v)
    {
        v.c=a*b;
        System.out.println("Multiplicaton of two numbers is:"+v.c);
    }
}
class Division extends Values
{
    public void calculate(int a,int b,Values v)
    {
        v.c=a/b;
        System.out.println("Division of two numbers is:"+v.c);
    }
}
public class SolidPrinciple
{
	public static void main(String[] args) {
	    Values v=new Values();
	    System.out.println("Enter the values");
	    Scanner s=new Scanner(System.in);
	    v.a=s.nextInt();
	    v.b=s.nextInt();
	    Addition ad=new Addition();
	    Subtraction sb=new Subtraction();
	    Multiplicaton mp=new Multiplicaton();
	    Division dv=new Division();
	    System.out.println("1.Addition 2.Subtraction 3.Multiplicaton 4.Division");
	    int ch=s.nextInt();
	    switch(ch)
	    {
	        case 1:
	            ad.calculate(v.a,v.b,new Values());
	            break;
	       case 2:
	            sb.calculate(v.a,v.b,new Values());
	            break;
	       case 3:
	            mp.calculate(v.a,v.b,new Values());
	            break;
	       case 4:
	            dv.calculate(v.a,v.b,new Values());
	            break;
	       default:
	        System.out.println("Enter the proper option");
	    }
	}
}
