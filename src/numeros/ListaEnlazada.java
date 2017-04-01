/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

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

    public void eliminarUltimo() {
        Nodo aux = cabeza;
        if (aux.getSiguiente() == null) {
            vacio();
        }
        if (!vacio()) {
            aux = cabeza;
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(null);
        }
    }

    public void cortar(int indice) {
        int c = 0;
        Nodo aux = cabeza;
        while (c < indice - 1) {
            aux = aux.obtenerSiguiente();
            c++;
        }
        aux.enlazarSiguiente(null);
    }

    public void eliminarValor(int indice) {
        if (indice >= 0 && indice < tamaño) {
            if (indice == 0) {
                cabeza = cabeza.getSiguiente();
            } else {
                Nodo aux = cabeza;
                for (int i = 0; i < indice - 1; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamaño--;
        }
    }

    public int mayor() {
        int mayor = Integer.MIN_VALUE;
        Nodo aux = cabeza;
        Object valor = null;

        while (aux != null) {
            valor = aux.obtenerValor();
            aux = aux.getSiguiente();
            int v = (int) valor;

            if (v > mayor) {
                mayor = v;
            }
        }
        return mayor;
    }

    public void llenar(int tamaño) {
        for (int i = 0; i <= tamaño - 1; i++) {
            int l = ((int) (Math.random() * 9 + 1));
            adicionarPrincipio(l);
        }
    }

    public int menor() {
        int menor = Integer.MAX_VALUE;
        Nodo aux = cabeza;
        Object valor = null;

        while (aux != null) {
            valor = aux.obtenerValor();
            aux = aux.getSiguiente();
            int v = (int) valor;
            if (v < menor) {
                menor = v;
            }
        }
        return menor;
    }

    public int pares() {
        Nodo aux = cabeza;
        Object valor = null;
        int p = 0;

        while (aux != null) {
            valor = aux.obtenerValor();
            aux = aux.getSiguiente();
            int v = (int) valor;
            if (v % 2 == 0) {
                p++;
            }
        }
        return p;
    }

    public int sumatoria() {
        Nodo aux = cabeza;
        Object valor = null;
        int s = 0;

        while (aux != null) {
            valor = aux.obtenerValor();
            aux = aux.getSiguiente();
            int v = (int) valor;
            s = v + s;
        }
        return s;
    }

    public double promedio(double tamaño) {
        Nodo aux = cabeza;
        Object valor = null;
        double s = 0, prom = 0;

        while (aux != null) {
            valor = aux.obtenerValor();
            aux = aux.getSiguiente();
            int v = (int) valor;
            s = v + s;
            prom = s / tamaño;
        }
        return prom;
    }
}
