/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Estruturas condicionais*/
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pernas? ");
        int perna = teclado.nextInt();
        String tipo;
        System.out.println("Isso � um(a) ");
        switch(perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "B�pede";
                break;
            case 3:
                tipo = "trip�";
                break;
            case 4:
                tipo = "Quadr�pede";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
         System.out.println(tipo);
    }
        
}
