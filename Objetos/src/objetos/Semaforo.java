/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetos;

/**
 *
 * @author Joel
 */
public class Semaforo {

    private String color;
    private String color2;
    private String color3;

    public Semaforo() {
        color = "Rojo";
        color2 = "Verde";
        color3 = "Amarillo";
    }

    /*
    Esto junto con el public de arriba es la sobre carga
    public Semaforo(String color) {
        this.color = color;
    }*/
    public String getColor() {
        return color;
    }

    public String getColor2() {
        return color2;
    }

    public String getColor3() {
        return color3;
    }

    public void setColor(String color) {
        if (!color.equals("Rojo") && !color.equals("Amarillo") && !color.equals("Verde")) {
            this.color = "Rojo";
        } else {
            this.color = color;
        }
    }

    public void setColor2(String color2) {
        if (!color2.equals("Verde") && !color2.equals("Amarillo") && !color2.equals("Rojo")) {
            this.color2 = "Verde";
        } else {
            this.color2 = color2;
        }
    }

    public void setColor3(String color3) {
        if (!color3.equals("Amarillo") && !color3.equals("Verde") && !color3.equals("Rojo")) {
            this.color3 = "Amarillo";
        } else {
            this.color3 = color3;
        }
    }

    public void cambiarColor() {
        if (color.equals("Rojo")) {
            color = "Verde";
        } else {
            if (color.equals("Amarillo")) {
                color = "Rojo";
            } else {
                color = "Amarillo";
            }
        }
    }

    public void cambiarColor2() {
        if (color2.equals("Verde")) {
            color2 = "Rojo";

        } else {
            if (color2.equals("Amarillo")) {
                color2 = "Verde";
            } else {
                color2 = "Amarillo";
            }
        }
    }

    public void cambiarColor3() {
        if (color3.equals("Amarillo")) {
            color3 = "Rojo";

        } else {
            if (color3.equals("Rojo")) {
                color3 = "Amarillo";
            } else {
                color3 = "Verde";
            }
        }
    }

}
