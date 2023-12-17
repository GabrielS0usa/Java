package Aula_05;

import java.util.Scanner;
import java.util.Locale;

public class Aula_05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int min;
		double conta = 50.0;
		
		System.out.println("Digite os minutos consumidos: ");
		min = sc.nextInt();
		
		if (min >= 100) {
			conta += (min - 100) * 2;
			System.out.printf("R$ %.2f", conta);
		}else {
			System.out.println("R$ 50.00");
		}
	}
}
