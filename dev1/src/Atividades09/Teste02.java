package Atividades09;

import java.util.Scanner;

public class Teste02 {

	public static void main(String[] args) {
	
		        Scanner leitor = new Scanner(System.in);
		        char opcao;

		        do {
		            System.out.print("Digite um número: ");
		            int n = leitor.nextInt();

		            for (int i = 1; i <= 10; i++) {
		                System.out.println(n + " x " + i + " = " + (n * i));
		            }

		            System.out.print("Deseja continuar? (s/n): ");
		            opcao = leitor.next().charAt(0);

		        } while (opcao == 's');

		    }
		}