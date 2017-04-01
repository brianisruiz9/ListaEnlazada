/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

/**
 *
 * @author BrianisRuiz
 */
public class Alumno {

    private String Nombre;
    private int edad;
    private String sexo;

    public Alumno(String Nombre, int edad, String sexo) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String toString() {
        return "Alumno"
                + "\nNombre: " + getNombre()
                + "\nEdad: " + getEdad()
                + "\nSexo: " + getSexo();
    }
}
