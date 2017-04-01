/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

/**
 *
 * @author bruiz9
 */
public class Nodo {

    private Alumno valor;
    private Nodo siguiente;

    public void enlazarSiguiente(Nodo n) {
        this.siguiente = n;
    }

    public Nodo obtenerSiguiente() {
        return siguiente;
    }

    public Alumno obtenerValor() {
        return valor;
    }

    public Nodo(Alumno valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Alumno getValor() {
        return valor;
    }

    public void setValor(Alumno valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
