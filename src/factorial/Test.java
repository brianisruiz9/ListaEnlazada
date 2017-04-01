/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Esmeralda
 */
public class Test {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        ListaEnlazada l = new ListaEnlazada();
        ListaEnlazada aux = new ListaEnlazada();

        int tam;
        System.out.println("Dijite el tamaño:");
        tam = lea.nextInt();

        l.llenar(tam);
        System.out.println("Lista:");
        l.recorrerLista();

        System.out.println("");
        aux.factorial(l);
        System.out.println("Lista Factorial:");
        aux.recorrerLista();

    }
}
