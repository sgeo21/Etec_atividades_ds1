package dev1;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	
				//incluir a leitura do leia pelo System.in = teclado - onde irá dar entrada ao numero correspondete ao mês
				Scanner leia = new Scanner (System.in);
				// int = numero inteiro
						
				int mes;
				
				//Leitura de dados via teclado
				System.out.println("Digite o número correspondete ao seu mês de aniversário: ");
				mes = leia.nextInt();
				
				//Adicionar opções de comando
				switch(mes) { 
				case 1: 
					System.out.println("Janeiro");
					break;
				case 2:
					System.out.println("Fevereiro");
					break;
		         case 3: 
		        	 System.out.println("Março");
					break;
				case 4:
					System.out.println("Abril");
					break;
		        case 5: 
		        	System.out.println("Maio");
					break;
				case 6:
					System.out.println("Junho");
					break;
				case 7: 
					System.out.println("Julho");
					break;
				case 8:
					System.out.println("Agosto");
					break;
		         case 9: 
		        	 System.out.println("Setembro");
					break;
				case 10:
					System.out.println("Outubro");
					break;
		        case 11: 
		        	System.out.println("Novembro");
					break;
				case 12:
					System.out.println("Dezembro");
					break;
					//Para adicionar número inexistente no menu
				default:
					System.out.println("Opção inválida!");

		} leia.close();
		
			}
}
