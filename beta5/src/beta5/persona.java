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
    String nombre,edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    public persona(String nombre, String edad, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
       
    }
}
