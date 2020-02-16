import java.util.*;
public class Yagniprinciple
{
	public static void main(String[] args) {
	    double c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the vaues");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1: c=a+b;
                    System.out.println("The Addition of two numbers is :"+c);
                    break;
            case 2:c=a-b;
                    System.out.println("The Subtraction of two numbers is :"+c);
                    break;
            case 3:c=a*b;
                    System.out.println("The Multiplication of two numbers is :"+c);
                    break;
            case 4:c=a/b;
                    System.out.println("The Division of two numbers is :"+c);
                    break;
            default:
                    System.out.println("Enter proper option");
        }
	}
}
