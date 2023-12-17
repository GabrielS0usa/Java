package Aula_09;

import java.util.Locale;
import java.util.Scanner;

public class Aula_09A {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char op = 's';

		while (op == 's') {
			System.out.println("Digite a temperatura em celsius: ");
			int c = sc.nextInt();
			
			int f = (int) (c * 1.8 + 32);
			System.out.println(f);
			
			System.out.println("Deseja repitir (s/n): ");
			op = sc.next().charAt(0);
		}

		sc.close();
	}
}
