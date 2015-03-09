import java.text.DecimalFormat; // utilização da classe DecimalFormat.

public class raio{
		public double altura;
		public double compri;	
	
		static void Calcula(double base, double altura){   // metodo para calcular o raio e o perimetro
			double a, p;
			a = base * altura;   // calcula a area
			p = 2 * (base + altura); // calcula o perimetro
			imprime(a, p); // chama o metodo imprimir
			
		}	
		static void imprime(double a, double p){     // metodo para imprimir o raio e o perimetro
			DecimalFormat rec = new DecimalFormat("0.00"); //criando um decimalformat para receber duas casas depois da virgula.
			String str = rec.format(a); //string str recebe a variavel a, para a impressão de somente duas casas depois da virgula
			String str1 = rec.format(p); 
			System.out.printf("Area: " + str + "\nPerimetro: " + str1);
		}
		
}
		

