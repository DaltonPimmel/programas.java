/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo;

import java.util.Scanner;

public class Exemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // receber dados do teclado 
        int a, b;
        float res = 0;
        int op = 0;
        
    while(op != 4){
        System.out.println("Selecione a opcao: ");        
        System.out.println("Opcao '0': Soma ");
        System.out.println("Opcao '1': Subtração ");
        System.out.println("Opcao '2': Multiplicação ");
        System.out.println("Opcao '3': Divisão ");
        System.out.println("Opcao '4': Sair do programa ");       
        System.out.println("Digite a Opcao: ");
        op = entrada.nextInt();
        if(op == 4){
            break;
        }
        System.out.println("Informe dois numeros para operacao: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        
        switch(op){
            case 0:
                res = a + b;
            break;
                
            case 1:
                res = a - b;
            break;
                
            case 2:
                res = a * b;
            break;
                
            case 3:
                res = a / b;
            break;
                
            default:
                System.out.println("Opcao invalida");
                break;
                
        }
        System.out.println("Resposta: " + res);
        
        
                
      }
    
    }   
    
}

