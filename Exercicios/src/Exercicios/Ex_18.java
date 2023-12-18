package Exercicios;

import java.util.Scanner;

public class Ex_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o intervaslo de números: ");
		int x = sc.nextInt();

		for (int i = 0; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

			sc.close();
	}
}
