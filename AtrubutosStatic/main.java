class main{
	
	public static void main( String[] args){
		teste a = new teste();
		teste b = new teste();
		a.a = 10;   // todos os objetos que pertencem a classe teste que utizaram o atributo 'a' terão o mesmo valor, pois dentro da classe teste foi declarado o atributo como static.
		System.out.println(a.a); //imprime 10		
		System.out.println(b.a); // imprime 10
	}
	
	
}
