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
public class circular {
    
    nodo primero;
    nodo ultimo;

    circular() {
        primero = null;
        ultimo = null;
    }

    public boolean vacio() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public circular alta(int dat) {
        if (vacio()) {
            nodo nuevo = new nodo(dat);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
        } else {
            nodo nuevo = new nodo(dat);
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            primero.anterior = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
        }
        return this;
    }

    public boolean baja(int dat) {
        nodo actual = primero;
        nodo anterior;
        nodo siguiente;
        for (int i = 0; i <= dat; i++) {
            if (actual == ultimo) {
                if (i < dat) {
                    return false;
                } else {
                    if (i == dat) {
                        anterior = actual.anterior;
                        anterior.siguiente = primero;
                        primero.anterior = anterior;
                        ultimo = anterior;
                        return true;
                    }

                }

            } else {
                if (dat == 0) {
                    siguiente = actual.siguiente;
                    siguiente.anterior = ultimo;
                    ultimo.siguiente = siguiente;
                    primero = siguiente;
                    return true;
                }
                if (dat == i) {
                    anterior = actual.anterior;
                    siguiente = actual.siguiente;
                    anterior.siguiente = siguiente;
                    siguiente.anterior = anterior;
                    return true;
                }
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void imprimir() {
        nodo actual;
        actual = primero;
        while (actual != ultimo) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
        System.out.println(actual.dato);

    }
}
