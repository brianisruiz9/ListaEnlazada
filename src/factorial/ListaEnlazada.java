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
public class ListaEnlazada {

    private Nodo cabeza;
    private int tamaño;

    public ListaEnlazada() {
        cabeza = null;
        tamaño = 0;
    }

    public void adicionarPrincipio(Object valor) {
        if (cabeza == null) {
            Nodo nuevo = new Nodo(valor);
            cabeza = nuevo;
        } else {
            Nodo nuevo = new Nodo(valor);
            nuevo.enlazarSiguiente(cabeza);
            cabeza = nuevo;
        }
        tamaño++;
    }

    public void adicionarUltimo(Object valor) {
        Nodo nuevo = new Nodo(valor);
        Nodo aux;
        if (vacio()) {
            adicionarPrincipio(valor);
        } else {
            aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public boolean vacio() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

    public int obtenerTamaño() {
        return this.tamaño;
    }

    public void recorrerLista() {
        if (!vacio()) {
            Nodo aux = cabeza;
            while (aux != null) {
                System.out.print("[ " + aux.getValor() + " ] ");
                aux = aux.getSiguiente();
            }
        }
    }

    public Object obtenerValorLista(int indice) {
        if (indice >= 0 && indice < tamaño) {
            if (indice == 0) {
                return cabeza.obtenerValor();
            } else {
                Nodo aux = cabeza;
                for (int i = 0; i < indice; i++) {
                    aux = aux.getSiguiente();
                }
                return aux.obtenerValor();
            }
        } else {
            return "";
        }
    }

    public Object primeroLista() {
        return cabeza.obtenerValor();
    }

    public Object ultimoLista() {
        return obtenerValorLista(tamaño - 1);
    }

    public void eliminarPrimeroLista() {
        cabeza = cabeza.obtenerSiguiente();
    }

    public void llenar(int tamaño) {
        for (int i = 0; i <= tamaño - 1; i++) {
            int l = ((int) (Math.random() * 9 + 1));
            adicionarPrincipio(l);
        }
    }

    public int factorial(int a) {
        int fact, i;
        i = 1;
        fact = 1;
        while (i <= a) {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    public void factorial(ListaEnlazada l) {
        Nodo aux = l.cabeza;
        Object valor = null;

        while (aux != null) {
            valor = aux.obtenerValor();
            aux = aux.getSiguiente();

            int v = (int) valor;
            int nuevol = l.factorial(v);

            ListaEnlazada.this.adicionarUltimo(nuevol);
        }
    }
}
