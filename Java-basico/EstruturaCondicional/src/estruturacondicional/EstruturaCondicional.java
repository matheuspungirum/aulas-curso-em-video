/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturacondicional;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class EstruturaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Estrutura Condicional Simples
        
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
           System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
             float m = (n1+n2) / 2;
        System.out.println("Sua nota foi " + m);
        if (m>=9) {
            System.out.println("Parabéns!");
        }*/
        
        /* Estrutura Condicional Composta
         */
        
        Scanner digite = new Scanner (System.in);
        System.out.print("Digite o ano de Nascimento: ");
        int idade = digite.nextInt();
        int i = 2023 - idade;
        System.out.println ("Sua idade é: " + i);
        if (i>=18){
            System.out.println("Maior de idade");
        }
        else {
            System.out.println ("Menor de idade");
        }
    }
    
}
