// programa que possui um caixa, o atributo sq representa o valor do saque, o objeto a possui os atributos e os metodos da classe caixa, o atributo i é quem controla o laço que vai sacando os valores de 100
// reais até que o caixa possui saldo, quando i retornar false do metodo a.saque() o programa termina. Dentro do metodo saque da classe caixa é quem verifica se o saque é menor que o saldo para poder sacar.

import java.util.Scanner;

class main{
	
	public static void main( String[] args){
		Scanner in = new Scanner(System.in);
		boolean i = true;
		DadosCadastrais pessoa = new DadosCadastrais(); // preenchendo automatico o cadastro de um cliente, atraves de um contrutor na classe DadosCadastrais.
		caixa a = new caixa();  // dados dos caixa
		while(i == true){
			System.out.println("Informe o usuario: ");
			String usu = in.nextLine();
			System.out.println("Informe a senha: ");
			String senha = in.nextLine();
			login e = new login();    // testado o metodo imprimir como static para não preceisar declarar um novo objeto sendo (login.verifica), mas não deu certo.
			if(e.Verifica(usu, senha) == false){
				System.out.println("Login invalido!!!\n");
			}else{
				opcao b = new opcao();
				int controle = 1;  // atributo para voltar para a opcao, nao para i usuario e senha.
				while(controle != 0){
					int r = b.imprimir();
					switch(r){
						case 0:
							System.out.println("\nValor saque: ");
							int d = in.nextInt();
							if(a.saque(d)){
								System.out.println("\nVoce sacou: " + d + "\n");
							}else{
								System.out.println("\nSaldo indisponivel!!!\n");
							}
						break;
				
						case 1:
							System.out.println("\nValor do deposito: ");
							int dep = in.nextInt();
							if(a.Deposito(dep)){
								System.out.println("\nDeposito de " + dep + " reais efetuado com sucesso\n");
							}else{
								System.out.println("\nErro ao depositar, entar em contato com o gerente.\n");
							}
						break;
				
						case 2:
							System.out.println("\nSaldo atual: " + a.SaldoConta() + "\n");
						break;
						
						case 3:
							pessoa.DadosCliente();
						break;
							
						case 4:
							controle = 0;
							//i = false;
						break;
					
					}
				}
			}
		}
	}
}

