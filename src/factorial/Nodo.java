/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author bruiz9
 */
public class Nodo {

    private Object valor;
    private Nodo siguiente;

    public void enlazarSiguiente(Nodo n) {
        this.siguiente = n;
    }

    public Nodo obtenerSiguiente() {
        return siguiente;
    }

    public Object obtenerValor() {
        return valor;
    }

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void actualizarNodo(Object nuevo){
        this.valor=nuevo;
    }
}
