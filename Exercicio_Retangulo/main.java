//Dalton Luiz Pimmel.
//Programa que calcula a area e o perimetro de um retangulo.

import java.util.Scanner; // receber entrada de dados do teclado

public class main{
	
	public static void main(String[] args){ // metodo principal
		raio a = new raio();	// declarando um objeto do tipo raio
		Scanner ent = new Scanner(System.in); // declarando ent do tipo Scanner
		
		System.out.println("Informe o base do Retangulo: ");
		a.compri = ent.nextDouble();
		System.out.println("Informe a altura do Retangulo: ");
		a.altura = ent.nextDouble();
		a.Calcula(a.compri, a.altura); // chama o metodo Raio 
				
	}
}
