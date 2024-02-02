/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Scanner;

/**
 * Sems.java
 *
 * Creado el 16 ene. 2024, 16:09:34
 *
 * Desarrollado por Joel en la empresa Ocoru.sl el dia 16 ene. 2024
 *
 * Puedes contactar conmigo por el siguiente email: ocoruzl@gmail.com
 *
 * @autor Joel
 * @date 16 ene. 2024
 *
 */
public class Sems {

    public static void main(String[] args) {
        int elect, camEst;
        String color;
        Scanner teclado = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);
        Otro_semaforo s1 = new Otro_semaforo();
        Otro_semaforo s2 = new Otro_semaforo();
        Otro_semaforo s3 = new Otro_semaforo();
        
        Otro_semaforo[] todos={s1,s2,s3};

        do {
            System.out.println("1.Su estado");
            System.out.println("2.Cambiarles el color");
            System.out.println("3.Salir");
            System.out.println("Dime que quieres saber de los semaforos: ");
            elect = teclado.nextInt();
            switch (elect) {
                case 1:
                    System.out.println("El semaforo 1 está en " + s1.getColor());
                    s1.setColor();
                    System.out.println("El semaforo 2 está en " + s2.getColor());
                    s2.setColor();
                    System.out.println("El semaforo 3 está en " + s3.getColor());
                    s3.setColor();
                    break;
                case 2:
                    System.out.println("Dime de cual semaforo quieres cambiar el estado: ");
                    camEst = teclado.nextInt();
                    switch (camEst) {
                        case 1:
                            System.out.println("Dime a que color quieres cambiar el semaforo: ");
                            color = teclado1.nextLine();
                            s1.setColor();
                            break;
                        case 2:
                            System.out.println("Dime a que color quieres cambiar el semaforo: ");
                            color = teclado1.nextLine();
                            s2.setColor();
                            break;
                        case 3:
                            System.out.println("Dime a que color quieres cambiar el semaforo: ");
                            color = teclado1.nextLine();
                            s3.setColor();
                            break;
                        default:
                            System.out.println("No existe ese semaforo");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (elect != 3);
//        s1.setColor("Morado");
//        System.out.println("El morado no lo admite");
//        System.out.println("El semaforo está en " + s1.getColor());
//        s1.setColor("Verde");
//        System.out.println("El semaforo está en " + s1.getColor());

    }
}
