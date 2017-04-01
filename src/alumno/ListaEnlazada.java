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
public class ListaEnlazada {

    private Nodo cabeza;
    private Nodo fin;

    public ListaEnlazada() {
        cabeza = null;
        fin = null;
    }

    public boolean vacio() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

 public void insertarAlumno(Alumno alumno){
        Nodo actual;
        if(vacio()){
            actual = new Nodo(alumno,null);
            cabeza = actual;
            fin = actual;
        }else{
            actual = new Nodo(alumno,null);
            fin.setSiguiente(actual);
            fin = actual;
        }
    }
    
    public void mostrar(){
        if(!vacio()){
            Nodo aux;
            aux = cabeza;
            while(aux!=null){
                System.out.println(aux.getValor().toString());
                aux = aux.getSiguiente();
            }
        }
    }


   
    
    
}
