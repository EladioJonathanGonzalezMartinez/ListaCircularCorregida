/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCircular;

/**
 *
 * @author remix
 */
public class ListaDoblementeCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circular num = new circular();
        int a = 1, b = 2, c = 3, d =4;
        num.alta(a);
        num.alta(b);
        num.alta(c);
        num.alta(d);
        System.out.println("Valor inicial: \n");
        num.imprimir();
        num.baja(0);
        System.out.println("\nDespues de borrar la Posicion 1:\n");
        num.imprimir();
    }
    
}
