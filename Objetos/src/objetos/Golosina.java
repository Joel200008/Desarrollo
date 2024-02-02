/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.logging.Logger;

/**
 * Golosina.java
 *
 * Creado el 18 ene. 2024, 18:29:11
 *
 * Desarrollado por Joel en la empresa Ocoru.sl el dia 18 ene. 2024
 *
 * Puedes contactar conmigo por el siguiente email: ocoruzl@gmail.com
 *
 * @autor Joel
 * @date 18 ene. 2024
 *
 */
public class Golosina {

    private String nombre;
    private double precio;
    private int exist;

    public Golosina(String nombre, double precio, int exist) {
        this.nombre = nombre;
        this.precio = precio;
        this.exist = exist;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExist() {
        return exist;
    }

    public void setExist() {
        this.exist--;
    }
     public void setExist(int exist) {
        this.exist+=exist;
    }
    

    public String mostrar(){
        return this.nombre+" "+this.precio+" "+this.exist;
    }
    
    public String mostrarsinExist(){
        return this.nombre+" "+this.precio;
        
    }
    
    public static void main(String[] args) {
        System.out.println("hOl");
    }
    
}
