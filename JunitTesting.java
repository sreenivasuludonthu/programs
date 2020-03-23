package testing;
public class JunitTesting {
	String result="";
	public String remove(String word)
	{
		for(int i=0;i<word.length();i++)
		{
			if(i<2)
			{
				if(word.charAt(i)=='a')
				{
				
				}
				else
					result+=word.charAt(i);
			}
			if(i>=2)
			{
				result+=word.charAt(i);
			}
		}
		return result;	
	}

}
