import java.util.Scanner;

class main{
	

	
	public static void main(String[] args){
		raio a = new raio();
		double b;
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o comprimento do triangulo: ");
		a.compri = 20;
		a.altura = 2;
		b = a.calcula(20, 2);
		System.out.println(b);
	}
}
