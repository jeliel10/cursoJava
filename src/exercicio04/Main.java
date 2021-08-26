package exercicio04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		double hrsTrabalhadas = sc.nextFloat();
		double valorPorHora = sc.nextFloat();
		double salario = valorPorHora * hrsTrabalhadas;
		
		System.out.println("Dados digitados:");
		System.out.println(numeroFuncionario);
		System.out.printf("Salario - %.2f", salario);
		sc.close();
	}
}
