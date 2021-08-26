package exercicio01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int soma = num1 + num2;
		System.out.println("Dados: ");
		System.out.println("Numero 1 - " + num1);
		System.out.println("Numero 2 - " + num2);
		System.out.println("Soma dos numeros 1 e 2 - " + soma);
		sc.close();
	}
}
