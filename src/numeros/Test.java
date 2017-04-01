/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author BrianisRuiz
 */
public class Test {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        ListaEnlazada l = new ListaEnlazada();

        int tam;
        System.out.println("Dijite el tamaño:");
        tam = lea.nextInt();

        l.llenar(tam);
        System.out.println("Lista:");
        l.recorrerLista();
        
        System.out.println("");
        System.out.println("El número mayor es: "+l.mayor());
        System.out.println("El número menor es: "+l.menor());
        System.out.println("La cantidad de números pares es: "+l.pares());
        System.out.println("La sumatoria es: "+l.sumatoria());
        System.out.println("El promedio es: "+l.promedio(tam));
        
    }
}
