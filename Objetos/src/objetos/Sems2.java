/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Scanner;

/**
 * Sems2.java
 *
 * Creado el 18 ene. 2024, 17:13:00
 *
 * Desarrollado por Joel en la empresa Ocoru.sl el dia 18 ene. 2024
 *
 * Puedes contactar conmigo por el siguiente email: ocoruzl@gmail.com
 *
 * @autor Joel
 * @date 18 ene. 2024
 *
 */
public class Sems2 {

    public static void main(String[] args) {
        int op;
        Scanner teclado = new Scanner(System.in);
        Semaforo s1 = new Semaforo();
        Semaforo s2 = new Semaforo();
        Semaforo s3 = new Semaforo();

        Semaforo[] todos = {s1, s2, s3};

        String[] menu = {"Su estado", "Cambiar color", "Salir"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
        op = teclado.nextInt();
        switch (op) {
            case 0:
                for (int i = 0; i < todos.length; i++) {
                    System.out.println("Semaforo " + i+": " + todos[i] + "esta en el color: " + s1.getColor());
                }   break;
            case 1:
                System.out.println("Cual?");
                int sem=teclado.nextInt();
                if (sem>=0 && sem<todos.length) {
                    todos[sem].cambiarColor();
                }   break;
            default:
                System.exit(0);
        }
    }
}
