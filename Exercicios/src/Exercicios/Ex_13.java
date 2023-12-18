package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_13 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double x, y;
		System.out.println("Digite a cordenada x: ");
		x = sc.nextDouble();
		System.out.println("Digite a cordenada y: ");
		y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}else if (y == 0.0 && (x > 0.0 || x < 0.0)) {
			System.out.println("Eixo X");
		}else if (x == 0.0 && (y > 0.0 || y < 0.0)) {
			System.out.println("Eixo Y");
		}else if (y > 0.0 && x > 0.0) {
			System.out.println("Q1");
		}else if (y < 0.0 && x < 0.0) {
			System.out.println("Q3");
		}else if (y > 0.0 && x < 0.0) {
			System.out.println("Q2");
		}else {
			System.out.println("Q4");
		}
		
		sc.close();
	}
}
