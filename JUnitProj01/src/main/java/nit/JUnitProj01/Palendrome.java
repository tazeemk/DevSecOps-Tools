package nit.JUnitProj01;

public class Palendrome 
{

	public boolean isPalendrome(String str) 
	{
	
		if(str==null|| str.length()==0||str.equalsIgnoreCase("")) 
		throw new IllegalArgumentException("Invalid ");
			
		String str1 = new StringBuffer(str).reverse().toString();
		if(str.equalsIgnoreCase(str1))
		return true;
		else
			return false;
			
	}
	
	public int sum(int a,int b){
		
	return a+b;
	}
	
	
}
