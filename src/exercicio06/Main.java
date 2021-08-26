package exercicio06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextFloat();
		double B = sc.nextFloat();
		double C = sc.nextFloat();
		
		double letraA = A*C;
		double letraB = 3.14159 * (Math.pow(C, 2));
		double letraC = A*B*C;
		double letraD = Math.pow(B, 2);
		double letraE = A*B;
		
		System.out.println("Respostas ----");
		System.out.printf("A - %.2f%n", letraA);
		System.out.printf("B - %.2f%n", letraB);
		System.out.printf("C - %.2f%n", letraC);
		System.out.printf("D - %.2f%n", letraD);
		System.out.printf("E - %.2f%n", letraE);
		sc.close();
		
	}
}
