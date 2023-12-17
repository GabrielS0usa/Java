package Exercicios;

import java.util.Scanner;

public class Ex_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("Digite sua opção: ");
//		int op = sc.nextInt();
//		System.out.println("Digite a Quantidade: ");
//		int qt = sc.nextInt();
//
//		double op2 = 0.0;
//		String opl = "";
//		
//		switch (op) {
//		case 1:
//			opl = "Cachorro Quente";
//			op2 = 4.00;
//			break;
//		case 2:
//			opl = "X-Salada";
//			op2 = 4.50;
//			break;
//		case 3:
//			opl = "X-Bacon";
//			op2 = 5.00;
//			break;
//		case 4:
//			opl = "Torrada Simples";
//			op2 = 2.00;
//			break;
//		case 5:
//			opl = "Refrigerante";
//			op2 = 1.50;
//			break;
//		}
//		
//		op2 = op2 * qt;
//
//		if (op2 != 0.0)
//			System.out.printf("%dX %s(s) fica  R$%.2f%n", qt, opl, op2);
//		else
//			System.out.println("Opção invalida");

		System.out.println("Digite sua opção: ");
		int op = sc.nextInt();
		System.out.println("Digite a Quantidade: ");
		int qt = sc.nextInt();
		double pre = 0.0;
		if (op == 1) {
			pre = qt * 4.0;
		} else if (op == 2) {
			pre = qt * 4.5;
		} else if (op == 3) {
			pre = qt * 5.0;
		} else if (op == 4) {
			pre = qt * 2.0;
		} else if (op == 5) {
			pre = qt * 1.5;
		} else {
			System.out.println("Opção invalida!");
		}
		
		if (pre > 0.0) {
			System.out.printf("Total: %.2f %n", pre);
		}

		sc.close();
	}
}
