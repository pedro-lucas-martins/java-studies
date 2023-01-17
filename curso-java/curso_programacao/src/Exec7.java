package curso_programacao.src;

import java.util.Scanner;

public class Exec7 {
    static public int Max(int numbers[]) {
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (numbers[i] > max) max = numbers[i];
        }
        return max;
    }

    static public void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[3];
        System.out.println("Digite tres numeros:");
        for(int i = 0; i < 3; i++){
            numbers[i] = input.nextInt();
        }
        System.out.printf("O maior numero e %d%n", Max(numbers));
    }
}


