package application;

import java.util.*;
import entities.Rectangle;

public class Program 
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.width = input.nextDouble();
		rectangle.height = input.nextDouble();
		
		System.out.printf("AREA: %.2f%nPERIMETER: %.2f%nDIAGONAL: %.2f%n", rectangle.area(), rectangle.perimeter(), rectangle.diagonal());
	}
}
