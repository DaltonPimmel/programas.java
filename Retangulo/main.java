import java.util.Scanner; // receber entrada de dados do teclado

class main{
	
	public static void main(String[] args){ // metodo principal
		raio a = new raio();	// declarando um objeto do tipo raio
		Scanner ent = new Scanner(System.in); // declarando ent do tipo Scanner
		
		System.out.println("Informe o comprimento do triangulo: ");
		a.compri = ent.nextDouble();
		System.out.println("Informe a altura do triangulo: ");
		a.altura = ent.nextDouble();
		a.Calcula(a.compri, a.altura); // chama o metodo Raio 
		
		
	}
}
