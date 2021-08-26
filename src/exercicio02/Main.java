package exercicio02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextInt();
		double pi = 3.14159;
		
		double area = pi * Math.pow(raio, 2);
		System.out.println("Dados: ");
		System.out.println("Valor do raio - " + raio);
		System.out.printf("Valor da Area - %.2f%n", area);
		sc.close();
	}
}
