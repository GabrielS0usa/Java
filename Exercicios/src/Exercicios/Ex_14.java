package Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Ex_14 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor, imposto;
		
		System.out.println("Digite o Salário: ");
		valor = sc.nextDouble();
		
		if (valor <= 2000.00) {
			imposto = 0.0;
		}else if (valor <= 3000.00) {
			imposto = (valor - 2000) * 0.08;
		}else if (valor <=4500.00) {
			imposto = (valor - 3000) * 0.18 + 1000 * 0.08;
		}else {
			imposto = (valor - 4500.0) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
		}
		
		if (imposto == 0.0) {
		System.out.println("Insento");
		} else {
			System.out.printf("Imposto: R$%.2f %n", imposto);
		}
		sc.close();
	}
}
