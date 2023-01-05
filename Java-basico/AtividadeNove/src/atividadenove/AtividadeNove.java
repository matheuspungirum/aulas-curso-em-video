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
        /* Exercício 1
         * Analise o algoritimo abaixo:
         * inicio
         *    Inteiro Y, X, DIV
         *    Leia (Y)
         *    X = Y % 7
         *    se x > 10
         *    então DIV = Verdadeiro
         *    senão DIV = 10
         *    fim se
         *    fim
         * Assinale a opcão que apresenta a linha que contém o erro na execução do algoritmo.
        *a) linha 2 inteiro x, y, div
        *b) linha 4 x = y % 7
        *c) linha 5 se x > 10
        *d) linha 6 entao DIV = verdadeiro
        *e) linha 7 senão DIV = 10
        *     
        * Resposta: Variável DIV é do tipo inteiro, e essa variável não pode ser
        * verdadeira sendo do tipo inteiro, sendo assim o erro está na linha 6
        * letra b)
        */
        
        
        
        /*Exercício 2
        * Indique o resultado de "x" do trecho do programa em português
        * estruturado, mostrado abaixo. Para as saídas, considere os seguintes
        * valores:
        * A=2, B=3, C=3, D=4
        * se.não.(D<5) então
        * x<-(A+B) * D
        * senão
        *     x<-(C+A)*B
        * fim se
        * Escreva x
        *a)15
        *b)10
        *c)25
        *d)20
        *
        *Resposta, na Linha um é verdadeiro, como tem o se.não. ele passa a ser
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

/* Exercício 3
*Dada a estrutura representada abaixo:
*
*int a=5, b=2;
*String c;
*if (a>b) {
*c = "Primeiro é Maior";
*} else {
*c = "Segundo é Maior";
*}
*Que linha substituiria a condição apresentada?
*a)c = (a < b)?"Segundo é Maior":"Primeiro é Maior";
*b)c = (a <= b)?"Segundo é Maior":"Primeiro é Maior";
*c)c = (a > b)?"Segundo é Maior":"Primeiro é Maior";
*d)c = (a >= b)?"Primeiro é Maior":"Segundo é Maior";
*/
    }
}

        
   