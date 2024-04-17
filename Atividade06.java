package Estrutura.de.Repitição;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
        int nota,media,soma=0;
        
        
		for(int i=0; i<=5 ; i++) {
			
			System.out.println("Informe o nota:");
			nota= ler.nextInt();
		
			
			soma =(soma+nota);
		}
			media = (soma)/5;
			
			
			System.out.println(" A soma é: " + soma);
			
			System.out.println(" A média é: " + media);
			
			
		ler.close();
	}

}
