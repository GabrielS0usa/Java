package Aula_02;

import java.util.Locale;
import java.util.Scanner;

public class Aula_02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome, idade, cor;
		String x;
		int y;
		double w;
		char t;
		
		System.out.println("Digite uma frase");
		x = sc.next();
		System.out.println("Digite um número inteiro");
		y = sc.nextInt();
		System.out.println("Digite um número com ponto flutuante");
		w = sc.nextDouble();
		System.out.println("Digite uma letra");
		t = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Digite seu nome");
		nome = sc.nextLine();
		System.out.println("Digite sua idade");
		idade = sc.nextLine();
		System.out.println("Digite sua cor");
		cor = sc.nextLine();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Você digitou: " + x);
		System.out.println(y);
		System.out.println(w);
		System.out.printf("Você digitou: %.1f\n", w);
		System.out.printf("Você digitou: %c\n", t);
		System.out.println(nome);
		System.out.println("idade: " + idade);
		System.out.println("cor: " + cor);
		
		sc.close();

	}

}
