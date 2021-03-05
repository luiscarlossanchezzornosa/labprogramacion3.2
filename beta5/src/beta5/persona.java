/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beta5;

/**
 *
 * @author paule
 */
public class persona {
    String nombre;
int modelo,edad,cedula;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public persona(String nombre, int modelo, int edad, int cedula) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.edad = edad;
        this.cedula = cedula;
    }
    
       
    
}
