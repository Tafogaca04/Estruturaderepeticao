package Estrutura.de.Repitição;


import java.util.Scanner;

public class Atividade04 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int n, resultado;
		System.out.print("Informe oum número para a tabuada:");
		n= ler.nextInt();


		for (int i=0; i<=10 ; i++) {
			resultado = n*i;
			System.out.println(n + "x" + i + "=" + resultado);
		}
		ler.close();
	}

}
