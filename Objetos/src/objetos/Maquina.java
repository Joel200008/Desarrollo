/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Scanner;

/**
 * Maquina.java
 *
 * Creado el 18 ene. 2024, 18:29:29
 *
 * Desarrollado por Joel en la empresa Ocoru.sl el dia 18 ene. 2024
 *
 * Puedes contactar conmigo por el siguiente email: ocoruzl@gmail.com
 *
 * @autor Joel
 * @date 18 ene. 2024
 *
 */
public class Maquina {
    Scanner teclado=new Scanner(System.in);
    Golosina[][] maq;
    public Maquina() {
        maq = new Golosina[4][4];
        inicializar();
    }

    public void inicializar() {
        String[][] nombresGolosinas = {{"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"}, {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"}, {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"}, {"Lacasitos", "Crunch", "Milkybar", "KitKat"}};
        double[][] precio = {{1.1, 0.8, 1.5, 0.9}, {1.8, 1, 1.2, 1}, {1.8, 1.3, 1.2, 0.8}, {1.5, 1.1, 1.1, 1.1}};
        for (int f = 0; f < maq.length; f++) {
            for (int c = 0; c < maq[0].length; c++) {
                maq[f][c] = new Golosina(nombresGolosinas[f][c], precio[f][c], 5);

            }
        }

    }

    public void pedirGolosina() {
        int numgolo=0;
        System.out.println("Dime el codigo de la golosina que quieres comprar: ");
        numgolo=teclado.nextInt();
        for (int i = 0; i < maq.length; i++) {
            for (int j = 0; j < maq[0].length; j++) {
                maq[i][j].setExist();
                System.out.println(maq[i][j].mostrar());
            }
        }
        
    }

    public void mostrar() {
        for (int f = 0; f < maq.length; f++) {
            for (int c = 0; c < maq[0].length; c++) {
                System.out.println(f + "" + c + ": " + maq[f][c].mostrarsinExist());
            }
        }
    }
}
