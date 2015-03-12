class DadosCadastrais{
	
	private String Cliente;
	private int NumeroConta;
	private String Cpf;
	private String Rg;
	private String EstadoCivil;
	private String Sexo;
	private String Cidade;
	private String Estado;
	private String Telefone;
	
	public DadosCadastrais(){   // Constutor.
		this.Cliente = "teste";
		this.NumeroConta = 00024;
		this.Cpf = "03.567.543-98";
		this.Rg = "3.456.765-3";
		this.EstadoCivil = "Solteiro";
		this.Sexo = "M";
		this.Cidade = "Chapeco";
		this.Estado = "SC";
		this.Telefone = "9925515554";	
	}
	
	public void DadosCliente(){
		System.out.println("Nome: " + this.Cliente);
		System.out.println("Numero da Conta: " + this.NumeroConta);
		System.out.println("CPF: " + this.Cpf);
		System.out.println("RG: " + this.Rg);
		System.out.println("Estado civil: " + this.EstadoCivil);
		System.out.println("Sexo: "+ this.Sexo);
		System.out.println("Cidade: " + this.Cidade);
		System.out.println("Estado: " + this.Estado);
		System.out.println("Telefone: " + this.Telefone);
	}
	
}
