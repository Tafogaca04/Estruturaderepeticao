package Estrutura.de.Repitição;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		String nome;

		for(int i=0; i<=5 ; i++) {
			System.out.print("Informe seu nome:");
			nome= ler.next();
			
			System.out.println("Seu nome é:" + nome);
			}
		ler.close();
	}
	
}
