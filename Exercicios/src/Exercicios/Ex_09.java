package Exercicios;
import java.util.Scanner;


public class Ex_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		
		System.out.println("Digite o primeiro número: ");
		m = sc.nextInt();
		System.out.println("Digite segundo número: ");
		n = sc.nextInt();
		
		if (n % m == 0 || m % n == 0) {
			System.out.printf("%d é multipo de %d.", m, n);
		} else {
			System.out.printf("%d não é multipo de %d.", m, n);
		}
		
		sc.close();
	}
}
