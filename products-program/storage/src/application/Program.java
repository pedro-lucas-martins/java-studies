package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program 
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = input.next();
		System.out.printf("Price: ");
		product.price = input.nextDouble();
		System.out.printf("Quantity: ");
		product.quantity = input.nextInt();
		
		System.out.println("Product data: "+product);
		
		System.out.println("Enter de amount of products to add:");
		product.addProducts(input.nextInt());
		
		System.out.println("Updated product data: "+product);
		
		System.out.println("Enter the amount of products to remove:");
		product.removeProducts(input.nextInt());
		
		System.out.println("Updated product data: "+product);
		
		input.close();
		
	}
}
