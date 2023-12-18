package aula_07;

import java.util.Locale;
import java.util.Scanner;

public class Aula_07 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;
		// While é recomendada quando não se sabe previamente a quantidade de repetições.
		while (x != 0) {
			/* Soma igual a soma mais x */
			soma += x;
			x = sc.nextInt();

		}

		System.out.println("Acabou!");
		System.out.println(soma);

		sc.close();
	}
}
