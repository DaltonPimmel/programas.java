class raio{
		public double altura;
		public double compri;	
	
		static void Calcula(double area, double altura){   // metodo para calcular o raio e o perimetro
			double r, p;
			r = (area * altura) / 2;
			p = 2 * (area * altura);
			imprime(r, p); // chama o metodo imprimir
			
		}	
		static void imprime(double r, double p){     // metodo para imprimir o raio e o perimetro
			System.out.println("Raio: " + r + "\nPerimetro: " + p);
		}
		
}
		

