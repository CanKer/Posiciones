/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posiciones;

import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Posiciones {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor = 0, posicion = 0;

        Arreglo arr = new Arreglo();
        System.out.println(arr);
        for (int y = 0; y < arr.getArreglo().length; y++) {
            System.out.print(arr.getArreglo()[y]);
        }

        System.out.println("");
        System.out.println("Bienvenido al selector de posición de un arreglo");
        do {
            try {
                System.out.println("Ingrese valor para moverse");
                valor = in.nextInt();
                if (valor < 0) {
                    --posicion;
                    arr.cambiaValor(posicion, arr.getArreglo());
                } else if (valor > 0) {
                    posicion++;
                    arr.cambiaValor(posicion, arr.getArreglo());
                }
            } catch (Exception e) {
                System.out.println("Eso no fue un número válido");
                in.next();
            }
            if (posicion <= 0) {
                posicion = 0;
            } else if (posicion >= 10) {
                posicion = 9;
            }
            for (int h = 0; h < arr.getArreglo().length; h++) {
                System.out.print(arr.getArreglo()[h]);
            }
            System.out.println("");
        } while (valor != 0);

        System.out.println("Adios");
    }

}
