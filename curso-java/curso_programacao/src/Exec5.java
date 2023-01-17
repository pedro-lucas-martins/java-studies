import java.util.Scanner;

public class Exec5 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x = 0;
		int answer = -1;
		while (answer != 0){
			answer = input.nextInt();
			x+= answer;
		}
		System.out.println(x);

		System.out.println("ESTOUROU!!!");
		input.close();
	}
}
