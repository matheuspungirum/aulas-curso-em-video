/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades8;

/**
 *
 * @author mathe
 */
public class Atividades8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Dadas as linhas a seguir:
        *
        * Atividade 1
        *int x = 8, y = 3;
        *int w = x / y;
        *String z = (w % 2 == 0)? "frase1" : "frase2";
        *System.out.println(z);
        *
        *O que acontecer� se esse c�digo for executado?
        *a) Um erro de tipo na vari�vel w
        *b) Um erro de atribui��o na vari�vel z
        *c) Ser� impresso "frase1"  // ---> x
        *d) Ser� Impresso "frase2"
         */
        
        
        /*Atividade 2
        * analise o c�digo a seguir e indique o que ser� impresso na tela:
        *
        *String parte1 = "Curso";
        *String parte2 = "Video";
        *String parte3 = "parte1 + parte2;
        *String parte4 = "CursoVideo";
        *System.out.println (parte3 == parte4);
        *System.out.println (parte3.equals(parte4));
        *
        *a) CursoVideo
        *b) False true // ----> x
        *c) true true
        *d) true false
        */
        
       /* Analise o c�digo a seguir e indique o que ser� impresso na tela:
        *boolean val1 = (4>=5), val2 = (4<4), val3 = (val1==val2);
        *boolean val4 = val1 ^ val3;
        *boolean val5 = !val2 && val4;
        *System.out.println(val4 + " " + val5);
        *
        *a) true true // ---->
        *b) false true
        *c) false false
        *d) true false
        */
       boolean val1 = (4>=5), val2 = (4<4), val3 = (val1==val2);
        boolean val4 = val1 ^ val3;
        boolean val5 = !val2 && val4;
        System.out.println(val4 + " " + val5);
    }
    
}
