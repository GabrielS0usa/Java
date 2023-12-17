package Exercicios;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		if (n < 0) {
		System.out.println("Esse número é negativo!");
		
		}
		else {
			System.out.println("Esse número é positivo!");
		}
		
		sc.close();
	}

}
