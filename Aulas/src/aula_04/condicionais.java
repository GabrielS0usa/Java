package aula_04;

import java.util.Scanner;

public class condicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;

		x = sc.nextInt();

		if (x > 5 && x < 12) {
			System.out.println("Bom Dia!");
		} else {
			System.out.println("Boa tarde");
		}
		sc.close();

	}

}