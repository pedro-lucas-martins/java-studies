import java.util.*;

public class Exec2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		String nome;
		int idade;
		double altura;

		nome = input.next();
		idade = input.nextInt();
		altura = input.nextDouble();

		System.out.printf("Nome: %s   Idade: %d    Altura: %.2f%n", nome, idade, altura);
		input.close();
	}
}
