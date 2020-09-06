package fiado;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

// CTRL + SHIFT + C - ALT + UP		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		
		String nome = scanner.nextLine();
		Consumidor consumidor = new Consumidor(nome);
		
		System.out.print("Informe o valor da compra: ");
		int fiado = Integer.valueOf(scanner.nextLine());
		consumidor.registrarFiado(fiado);
		
		System.out.print("Informe seu telefone: ");
		String fone = scanner.nextLine();
		
				
		int total = consumidor.getFiado();
		
		if (total > 100) {
			System.out.println("Cliente " + consumidor.getNome() + " deve: " + total + " Ganhou um Brinde ");			
		} else {
			System.out.println("Cliente " + consumidor.getNome() + " deve: " + total);
		}
		

		
	}
	
	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}
		return total;		
	}

}
