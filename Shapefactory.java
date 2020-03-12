public class Shapefactory
{
	public Shape getshape(String shapetype)
	{
		if(shapetype==null)
			return null;
		if(shapetype=="circle")
			return new Circle();
		else if(shapetype=="rectangle")
			return new Rectangle();
		else if(shapetype=="square")
			return new Square();
		return null;
	}
}