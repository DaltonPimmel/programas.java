
class raio{
		public double altura;   // atributos da classe raio.
		public double compri;	
	
		public double CalculaArea(){   // metodo para calcular o raio.
			return this.altura * this.compri;   // calcula a area
			
		}	
		
		public double CalculaPerimetro(){  // metodo para calcular o perimetro.
			return 2 * (this.altura + this.compri); // calcula o perimetro
			
		}
		
}
		

