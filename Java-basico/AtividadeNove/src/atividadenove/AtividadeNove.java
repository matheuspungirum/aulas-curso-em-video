/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadenove;

/**
 *
 * @author mathe
 */
public class AtividadeNove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Exerc�cio 1
         * Analise o algoritimo abaixo:
         * inicio
         *    Inteiro Y, X, DIV
         *    Leia (Y)
         *    X = Y % 7
         *    se x > 10
         *    ent�o DIV = Verdadeiro
         *    sen�o DIV = 10
         *    fim se
         *    fim
         * Assinale a opc�o que apresenta a linha que cont�m o erro na execu��o do algoritmo.
        *a) linha 2 inteiro x, y, div
        *b) linha 4 x = y % 7
        *c) linha 5 se x > 10
        *d) linha 6 entao DIV = verdadeiro
        *e) linha 7 sen�o DIV = 10
        *     
        * Resposta: Vari�vel DIV � do tipo inteiro, e essa vari�vel n�o pode ser
        * verdadeira sendo do tipo inteiro, sendo assim o erro est� na linha 6
        * letra b)
        */
        
        
        
        /*Exerc�cio 2
        * Indique o resultado de "x" do trecho do programa em portugu�s
        * estruturado, mostrado abaixo. Para as sa�das, considere os seguintes
        * valores:
        * A=2, B=3, C=3, D=4
        * se.n�o.(D<5) ent�o
        * x<-(A+B) * D
        * sen�o
        *     x<-(C+A)*B
        * fim se
        * Escreva x
        *a)15
        *b)10
        *c)25
        *d)20
        *
        *Resposta, na Linha um � verdadeiro, como tem o se.n�o. ele passa a ser
        *falso logo ele vai executar o else onde (3+2) * 3 = 15. resposta A)
        */
        
/* Fazendo a linha de comando
int a= 2, b=3, c=3, d=4;
int x;
if (!(d<5)){
 x = (a+b)*d;
 System.out.println (x);
} else {
    x = (c+a)*b;
    System.out.println(x);
} */

/* Exerc�cio 3
*Dada a estrutura representada abaixo:
*
*int a=5, b=2;
*String c;
*if (a>b) {
*c = "Primeiro � Maior";
*} else {
*c = "Segundo � Maior";
*}
*Que linha substituiria a condi��o apresentada?
*a)c = (a < b)?"Segundo � Maior":"Primeiro � Maior";
*b)c = (a <= b)?"Segundo � Maior":"Primeiro � Maior";
*c)c = (a > b)?"Segundo � Maior":"Primeiro � Maior";
*d)c = (a >= b)?"Primeiro � Maior":"Segundo � Maior";
*/
    }
}

        
   