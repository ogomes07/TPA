package exercicios;

import java.util.Scanner;

public class SalarioMInimo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n;
		
		System.out.println("Digite um n�mero:");
		n = in.nextDouble();
		
		if (n == 0) {
			System.out.println("N�mero neutro.");
		} else if (n > 0) {
			System.out.println("N�mero positivo.");
		} else {
			System.out.println("N�mero negativo.");
		}
		in.close();
	}
}
