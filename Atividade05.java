package Estrutura.de.Repitição;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int n,valor;

		System.out.print("Informe o valor limite:");
		n= ler.nextInt();


		for(int i=0; i<=n ; i++) {

			if ( i % 2 != 0 ) {

				System.out.println("Os número impares são:" + i);
			}
				ler.close();
			}
		}

	}

