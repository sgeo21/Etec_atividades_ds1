package Atividades09;

import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {
		
		        Scanner leitor = new Scanner(System.in);

		        System.out.print("Digite um número: ");
		        int n = leitor.nextInt();

		        System.out.print("Deseja continuar? (s/n): ");
		        char opcao = leitor.next().charAt(0);

		        while (opcao == 's') {
		            for (int i = 1; i <= 10; i++) {
		                System.out.println(n + " x " + i + " = " + (n * i));
		            }

		            System.out.print("Digite outro número: ");
		            n = leitor.nextInt();

		            System.out.print("Deseja continuar? (s/n): ");
		            opcao = leitor.next().charAt(0);
		        }

		    }
}
