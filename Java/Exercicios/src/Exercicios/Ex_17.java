package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_17 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int op;
		int a = 0;
		int g = 0;
		int d = 0;

		System.out.println("Digite a opção:");
		System.out.println("1.Álcool");
		System.out.println("2.Gasolina");
		System.out.println("3.Diesel");
		System.out.println("4.Sair");
		op = sc.nextInt();
		while (op != 4) {
			if (!(op != 1 && op != 2 && op != 3 && op != 4)) {
				while (op != 4) {
					switch (op) {
					case 1: {
						a++ ;
						break;
					}
					case 2: {
						g++ ;
						break;		
					}
					default:
						d++;
					}
					System.out.println("Digite outra opção:");
					System.out.println("1.Álcool");
					System.out.println("2.Gasolina");
					System.out.println("3.Diesel");
					System.out.println("4.Sair");
					op = sc.nextInt();
				}
			} else {
				System.out.println("Opção invalida!!");
				System.out.println("");
			}
			System.out.println("Digite a opção:");
			System.out.println("1.Álcool");
			System.out.println("2.Gasolina");
			System.out.println("3.Diesel");
			System.out.println("4.Sair");
			op = sc.nextInt();
		}	
		System.out.println("MUITO OBRIGADO");
		System.out.println("álcool: " + a);
		System.out.println("álcool: " + g);
		System.out.println("álcool: " + d);
		sc.close();
	}
}

//import java.util.Scanner;
//
//public class uri1134 {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		
//		int alcool = 0;
//		int gasolina = 0;
//		int diesel = 0;
//		
//		int tipo = sc.nextInt();
//		
//		while (tipo != 4) {
//			if (tipo == 1) {
//				alcool = alcool + 1;
//			}
//			else if (tipo == 2) {
//				gasolina = gasolina + 1;
//			}
//			else if (tipo == 3) {
//				diesel = diesel + 1;
//			}
//			
//			tipo = sc.nextInt();
//		}
//
//		System.out.println("MUITO OBRIGADO");
//		System.out.println("Alcool: " + alcool);
//		System.out.println("Gasolina: " + gasolina);
//		System.out.println("Diesel: " + diesel);
//		
//		sc.close();
//	}
//}
