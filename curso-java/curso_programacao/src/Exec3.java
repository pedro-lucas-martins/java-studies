import java.util.*;
public class Exec3
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int piece1, piece2;
		int amountP1, amountP2;
		Double priceP1, priceP2, fullPrice;
		
		System.out.println("Digite o codigo, a quantidade e o preco da peca 1: ");
		piece1 = input.nextInt();
		amountP1 = input.nextInt();
		priceP1 = input.nextDouble();
		
		System.out.println("Digite o codigo, a quantidade e o preco da peca 2: ");
		piece2 = input.nextInt();
		amountP2 = input.nextInt();
		priceP2 = input.nextDouble();
		
		fullPrice = (priceP1 * amountP1) + (priceP2 * amountP2);
		
		System.out.printf("VALOR TOTAL: R$%.2f", fullPrice);
		
		
		input.close();
	}
}
