/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;


public class Metodos {

   
static aluno imprimir(Aluno aluno){
   //teste = new aluno();
    aluno.idade = 10;
    aluno.nome = "teste";
    System.out.println(aluno.idade);        // 10
    System.out.println(aluno.nome);         //teste
    return null;
}

static void recebe(livro cad){
    cad.autor = "Joao";
    cad.editora = "Lis";
    cad.paginas = 150;
   
}

static void imprimeLivros(livro livro){
    System.out.println(livro.autor);
    System.out.println(livro.editora);
    System.out.println(livro.paginas);
    
}
 
    
      
    public static void main(String[] args) {
        Aluno aluno = new Aluno(); // crição de um objeto do tipo aluno.
        livro livro = new livro();  // criação de novo objeto do tipo livro

        aluno.idade = 20; // na classe aluno se criar a variavel idade como private não sera poivel usar em outras classes.
        aluno.nome = "teste2";
        imprimir(aluno); // chamada do metodo imprime, mandando o objeto aluno, que pertence a classe Aluno.
        // apos o retorno da função, ele volta com o valor que foi alterado na funcao, ira imprimir duas vezes 10, teste; mesmo retornando null da função.
        // Ele passa para a função como se fosse o endereço, um ponteiro.
        System.out.println(aluno.idade);       // 10
        System.out.println(aluno.nome);        // teste
        
        recebe(livro);
        imprimeLivros(livro);
        
        livro f1; // objeto do tipo livro;
        f1 = new livro();  // criando objeto e resenvendo memoria (new) do tipo livro.
        // por padrão objetos sem atribuição recebem null para string e 0 para int.
        System.out.println(f1.autor);   // imprime null; nao tem nenhuma atribuiçao.
        System.out.println(f1.editora);
        System.out.println(f1.paginas); // imprime 0;
        
        funcionarios func = new funcionarios();
        func.numeroFuncionarios++;
        System.out.println(func.numeroFuncionarios);
        
        System.out.println();  // imprime uma linha em branco.
        
        funcionarios.colaboradores teste2;
      
       
       
    }

    
}

// parecido com structs em c.
class Aluno{
   int idade;
   //private int idade;  //Se deixar desta forma a variavel não sera visivel para outras classe, somente pela classe aluno. As outras variveis que não estão marcado com provate 
   //poderam ser acessado normalmente.
    String nome;
}

class livro{
    String autor;
    String editora;
    int paginas;
   
}

class funcionarios{
    int numeroFuncionarios;
    
    class colaboradores{
        int teste;
    }

}
 
