package Exercicios;

import java.util.Scanner;

public class Ex_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial: ");
		int horainicial = sc.nextInt();
		System.out.println("Digite a hora final: ");
		int horafinal = sc.nextInt();
		
		int jogo;
		
		if (horainicial < horafinal) {
			jogo = horainicial - horafinal; 
		} else {
			jogo = 24 - horainicial + horafinal;
		}
		System.out.printf("O jogo durou %d hora(s).", jogo);
		
		sc.close();
	}
}
