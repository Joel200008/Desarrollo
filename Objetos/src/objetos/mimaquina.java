/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Scanner;

/**
 * mimaquina.java
 *
 * Creado el 19 ene. 2024, 17:00:00
 *
 * Desarrollado por Joel en la empresa Ocoru.sl el dia 19 ene. 2024
 *
 * Puedes contactar conmigo por el siguiente email: ocoruzl@gmail.com
 *
 * @autor Joel
 * @date 19 ene. 2024
 *
 */
public class mimaquina {

    public static void main(String[] args) {
        Maquina n = new Maquina();
        String contra="MaquinaGolosina2017";
        String contras;
        Scanner teclado = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);
        String[] menu = {"Pedir Golosinas", "Mostrar Golosinas", "Recargar Golosinas", "Salir"};
        int opt = 0;

        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }

        do {
            System.out.println("Que quieres hacer en la maquina: ");
            opt = teclado.nextInt();
            switch (opt) {
                case 0:
                    n.pedirGolosina();
                    break;
                case 1:
                    n.mostrar();
                    break;
                case 2:
                    System.out.println("Dime la contraseña: ");
                    contras=teclado1.nextLine();
                    if (contras.equals(contra)) {
                        n.inicializar();
                        System.out.println("Golosinas recargadas");
                    }else{
                        System.out.println("Lo siento, no eres adminitrador y solo los administradores pueden entrar a esta opcion");
                    }
                    break;
                case 3:
                    System.exit(0);
            }
        } while (opt != 3);
    }
}
