package exercicio05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1 = sc.nextInt();
		int numeroDePecas1 = sc.nextInt();
		double valorPeca1 = sc.nextFloat();
		double valorTotal = numeroDePecas1 * valorPeca1;
		
		System.out.println("======");
		
		int codigoPeca2 = sc.nextInt();
		int numeroDePeca2 = sc.nextInt();
		double valorPeca2 = sc.nextFloat();
		double valorTotal2 = numeroDePeca2 * valorPeca2;
		
		double valorFinal = valorTotal + valorTotal2;
		System.out.println("Dados digitados: ");
		System.out.println(codigoPeca1);
		System.out.println(codigoPeca2);
		System.out.printf("Valor total - %.2f", valorFinal);
		sc.close();
	}
}
