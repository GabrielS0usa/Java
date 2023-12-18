package aula_04;

import java.util.Scanner;

public class condicionais_composto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h;

		System.out.println("Digite as horas: ");
		h = sc.nextInt();

		if (h < 12) {
			System.out.println("Bom dia!");
		} else if (h < 18) {
			System.out.println("Boa Tarde!");
		} else {
			System.out.println("Boa Noite!");
		}
		sc.close();
	}
}
