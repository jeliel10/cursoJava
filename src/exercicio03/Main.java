package exercicio03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int mult = A * B;
		int mult2 = C * D;
		int diferenca = mult - mult2;
		System.out.println("Dados: ");
		System.out.println("A - " + A);
		System.out.println("B - " + B);
		System.out.println("C - " + C);
		System.out.println("D - " + D);
		System.out.println("Diferença = " + diferenca);
		sc.close();
		
	}
}
