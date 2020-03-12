public class Factorypattern
{
	public static void main(String[] args)
	{
		Shapefactory sh=new Shapefactory();
		Shape s1=sh.getshape("circle");
		s1.draw();
		Shape s2=sh.getshape("rectangle");
		s2.draw();
		Shape s3=sh.getshape("square");
		s3.draw();
	}
}