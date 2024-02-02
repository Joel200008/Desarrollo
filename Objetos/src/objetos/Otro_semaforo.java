/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package objetos;

/**
 * Otro_semaforo.java
 * 
 * Creado el 25 ene. 2024, 17:03:37
 *
 * Desarrollado por Joel en la empresa Ocoru.sl el dia 25 ene. 2024
 *
 * Puedes contactar conmigo por el siguiente email: ocoruzl@gmail.com
 *
 * @autor Joel
 * @date 25 ene. 2024
 *
 */
public class Otro_semaforo {
    private ColorSemaforo color;

    public Otro_semaforo() {
        color=ColorSemaforo.ROJO;
    }

    public ColorSemaforo getColor() {
        return color;
    }

    public void setColor() {
        if (color==ColorSemaforo.ROJO) {
            color=ColorSemaforo.VERDE;
        } else {
            if (color==ColorSemaforo.AMARILLO) {
                color=ColorSemaforo.ROJO;
            }else{
                color=ColorSemaforo.AMARILLO;
            }
        }
    }
    
    
    
    
}
