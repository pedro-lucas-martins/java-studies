package curso_programacao.src;

import java.util.Scanner;

public class Exec6
{
    static public void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int alcoolAmount = 0;
        int gasolineAmount = 0;
        int diselAmount = 0;
        int option = 1;

        while(option > 0 && option <= 4) {
            System.out.println("Bem vindo ao programa do Posto Bem Feliz!, qual operacao deseja realizar?");
            System.out.printf("[1]-Alcool%n[2]-Gasolina%n[3]-Disel%n[4]-Fim%n");
            option = input.nextInt();
            if (option == 1) alcoolAmount++;
            else if (option == 2) gasolineAmount++;
            else if (option == 3) diselAmount++;
            else if (option == 4) {System.out.println("MUITO OBRIGADO"); break;}
        }

        System.out.printf("Alcool: %d%nGasolina: %d%nDisel: %d%n", alcoolAmount, gasolineAmount, diselAmount);
    }
}
