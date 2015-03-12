class caixa{
	
	private double saldo;   // atributos privados, só podem ser alterados dentro da classe, ou atraves dos metodos.
	
	public caixa(){    // metodo construtor
		this.saldo = 1000;
	}
	
	public boolean saque(int saq){  // metodo para verificar o saque e retornar o false ou true.
		if(saq > this.saldo){
			return false;
		}else{
			this.saldo -= saq;
			return true;
		}
	}
	
	public boolean Deposito(int dep){
		saldo += dep;
		return true;	
	}
	
	public double SaldoConta(){  // metodo que retorna o saldo
		return this.saldo;
	}
	
}
