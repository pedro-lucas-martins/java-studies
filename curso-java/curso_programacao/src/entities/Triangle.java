package entities;

public class Triangle 
{
	public double a;
	public double b;
	public double c;
	 
	public void area() 
	{
		
		double p = (a + b + c) / 2;
		System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c))); 
	}
}
