package dev1;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
				
				//incluir a leitura do leia pelo System.in = teclado
				Scanner leia = new Scanner (System.in);
				//Solicitar o dado de valor
				System.out.println("Digite o valor total da compra: R$");
				//Explicar leitura do valor incluido pelo usuário
				double valorCompra = leia.nextDouble();
				
				//Incluir a variavel desconto e sua aplicação
				double desconto = valorCompra*0.05;
				
				//incluir as variações da inclusão do código
				if (valorCompra >= 200.00 && valorCompra <= 300.00) desconto = (valorCompra * 0.10);
				
				else if (valorCompra > 300.00) desconto = (valorCompra * 0.15); 
				
				//explicar a operação final para utilização das opções anteriores
				double valorApagar = valorCompra - desconto;
				
				//adicionar a saida do que foi incluido e calculado até aqui 
				System.out.println("O desconto nessa compra é de: R$" + desconto);
				System.out.println("O valor da compra com desconto ficou: R$" + valorApagar);

	}

}
