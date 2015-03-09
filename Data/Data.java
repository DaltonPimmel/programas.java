import java.util.Scanner;

class Data{
	
	private int dia;   // atributos da classe
	private int mes;	// private, so pode ser alterado somente dentro da classe.
	private int ano;
	
	public Data(){ // recebe valores por padrão.
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;	
	}

	public void RecebeDados(){   // metodo para receber o dia mes e ano.
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o dia: ");
		int d = input.nextInt();
		System.out.println("Informe o mes: ");
		int m = input.nextInt();
		System.out.println("Informe o ano: ");
		int a = input.nextInt();
		
		if(m != 2 && d > 0 && d < 31 ){
			this.dia = d;
			this.mes = m;
			this.ano = a;
		}
	}
	
	public void imprime(){  // metodo para imprimir os dados.
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}
}
