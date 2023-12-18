package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y, w;

		System.out.println("Digite o primeiro valor:");
		x = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		y = sc.nextInt();
		w = x + y;

		System.out.println();

		System.out.printf("A soma dos número é: %d\n", w);
		System.out.println("A soma dos número é: " + (y + x));

		sc.close();
	}

}
