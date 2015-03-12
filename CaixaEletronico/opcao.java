import java.util.Scanner;

class opcao{
	
	int i;
	
	public int imprimir(){
		Scanner in = new Scanner(System.in);
		System.out.println("\n0: Saque");
		System.out.println("1: Deposito");
		System.out.println("2: Saldo");
		System.out.println("3: Dados Cadastrais");
		System.out.println("4: Sair");
	
		System.out.println("\nSelecione a opcao: ");
		i = in.nextInt();
	
		return i;
	}
	
	
}
