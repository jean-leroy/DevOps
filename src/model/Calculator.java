package model;

public class Calculator {

	private double res;
	
	public void add(double... nb)
	{
		for ( double x : nb)
		res += x;
	}
	
	public void minus(double... nb)
	{
		for ( double x : nb)
		res -= x;
	}
	
	public void multiply(double... nb)
	{
		for ( double x : nb)
		res *= x;
	}
	
	public void divide(double nb)
	{
		res = res/nb;
	}
	
	public double getResultat()
	{
		return res;
	}
}
