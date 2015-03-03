/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;


public class Primos {
    
     static void teste(int a){
        System.out.println(a);
    }
     
     // teste de funcoes
     static int soma(int a, int b){
         return a + b;
     }

   // verificar numeros primos
    public static void main(String[] args) {
        int i, a = 0, n = 2, b = 0;
        int rec;
        int c = 10;
        while(b < 20){
             for(i=1;i<=b;i++){
                if(n %i == 0){
                    a++;
                }
              }
                if(a < 2){
                     System.out.println(n);
                     b++;
                }
                 a = 0;
                 n++;
        }
        teste(c); // teste de funcoes
        System.out.println(soma(c, c));
    }
}
      