/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;


public class Metodos {

   
static aluno imprimir(aluno teste){
   //teste = new aluno();
    teste.idade = 10;
    teste.nome = "teste";
    System.out.println(teste.idade);        // 10
    System.out.println(teste.nome);         //teste
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
        aluno teste1 = new aluno(); // crição de um objeto do tipo aluno.
        livro livro = new livro();  // criação de novo objeto do tipo livro

        teste1.idade = 20;
        teste1.nome = "teste2";
        imprimir(teste1);
        // apos o retorno da função, ele volta com o valor que foi alterado na funcao, ira imprimir duas vezes 10, teste; mesmo retornando null da função.
        // Ele passa para a função como se fosse o endereço, um ponteiro.
        System.out.println(teste1.idade);       // 10
        System.out.println(teste1.nome);        // teste
        
        recebe(livro);
        imprimeLivros(livro);
    }

    
}

  
class aluno{
    int idade;
    String nome;
}

class livro{
    String autor;
    String editora;
    int paginas;
}

 
