package application;

import java.util.*;
import entities.Triangle;

public class Exec8 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		System.out.println("Insira as medidas do triangulo:");
		x.a = input.nextDouble();
		x.b = input.nextDouble();
		x.c = input.nextDouble();
		System.out.println("Insira as medidas do triangulo 2:");
		y.a = input.nextDouble();
		y.b = input.nextDouble();
		y.c = input.nextDouble();
		
		x.area();
		y.area();
	}
}
