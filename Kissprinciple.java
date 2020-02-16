import java.util.Scanner;
public class Kissprinciple
{
	public static void main(String[] args) {
	    double c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the vaues");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
        int ch=s.nextInt();
        int[] arithmeticArray = new int[]{a+b,a-b,a*b,a/b}; 
        System.out.println(arithmeticArray[ch-1]);
        }
}
