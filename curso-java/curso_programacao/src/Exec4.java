import java.util.Scanner;
public class Exec4 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		double num = input.nextInt();
		
		num = (num < 10) ? num * 1.2 : num * 0;
		
		System.out.println(num);
	
		input.close();
	}
}
