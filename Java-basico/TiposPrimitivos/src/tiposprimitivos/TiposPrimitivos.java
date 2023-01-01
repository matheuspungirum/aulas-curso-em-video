package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TiposPrimitivos {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dados = new Scanner(System.in);
        System.out.print("Digite o nome do aluno:");
        String nome = dados.nextLine();
        System.out.print("Digite a nota do aluno:");
        float nota = dados.nextFloat();
        System.out.printf ("A nota de %s é %.2f \n", nome, nota);
    }
    
}
