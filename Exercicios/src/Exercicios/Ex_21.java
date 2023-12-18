package Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Ex_21 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
//		segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

		int n, n1, n2;

		System.out.println("Digite a quantidade de pares: ");
		n = sc.nextInt();

		for (int j = 0; j < n; j++) {
			System.out.println("Digite o primeiro número: ");
			n1 = sc.nextInt();
			System.out.println("Digite o segundo número: ");
			n2 = sc.nextInt();

			if (n2 == 0) {
				System.out.println("Divisão Impossivel");
			} else {
				// Casting = É necessário quando o compilador não é capaz de “adivinhar” que o
				// resultado de uma expressão deve ser de outro tipo.

				double div = (double) n1 / n2;
				System.out.printf("%.1f%n", div);
			}
		}

		sc.close();
	}
}
