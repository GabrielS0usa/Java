package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_24 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de linhas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			System.out.print((int) Math.pow(i, 2) + " ");
			System.out.println((int) Math.pow(i, 3));

		}

		sc.close();
	}
}

//import java.util.Scanner;
//
////nao esqueca de mudar o nome da classe para Main
//public class uri1143 {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//		
//		for (int i=1; i<=n; i++) {
//
//			int primeiro = i;
//			int segundo = i * i;
//			int terceiro = i * i * i;
//			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
//		}
//		
//		sc.close();
//	}
//}