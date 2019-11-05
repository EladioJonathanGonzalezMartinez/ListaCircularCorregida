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
public class nodo {
    
    int dato;
    nodo siguiente;
    nodo anterior;

    nodo(int a) {
        dato = a;
        anterior = null;
        siguiente = null;
    }
}
