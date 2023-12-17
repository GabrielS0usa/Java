package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_16 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira cordenada: ");
		int ch = sc.nextInt();

		System.out.println("Digite a primeira cordenada: ");
		int cv = sc.nextInt();

		while (ch != 0 && cv != 0) {
			if (ch > 0 && cv > 0) {
				System.out.println("Primario");
			} else if (ch < 0 && cv > 0) {
				System.out.println("Secundario");
			} else if (ch < 0 && cv < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quadrante");
			}

			System.out.println("Digite a primeira cordenada: ");
			ch = sc.nextInt();

			System.out.println("Digite a primeira cordenada: ");
			cv = sc.nextInt();

		}
		System.out.println("Sai");

		sc.close();
	}
}
