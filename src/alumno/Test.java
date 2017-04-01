/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import java.util.Scanner;

/**
 *
 * @author Esmeralda
 */
public class Test {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        ListaEnlazada l = new ListaEnlazada();
        int op;
        String opcion;
        do {
            System.out.println("Digite la Opcion:\n1-Insertar\n2-Mostrar");
            opcion = lea.next();
            op = Integer.parseInt(opcion);

            switch (op) {
                case 1:
                    String nombre;
                    String sexo;
                    int edad;
                    System.out.println("Digite el nombre:");
                    nombre = lea.next();
                    System.out.println("Digite la edad:");
                    edad = lea.nextInt();
                    System.out.println("Digite el sexo:");
                    sexo = lea.next();
                    Alumno a = new Alumno(nombre, edad, sexo);
                    l.insertarAlumno(a);
                    break;

                case 2:
                    l.mostrar();
                    break;
            }
        } while (op != 3);
        
    }
}
