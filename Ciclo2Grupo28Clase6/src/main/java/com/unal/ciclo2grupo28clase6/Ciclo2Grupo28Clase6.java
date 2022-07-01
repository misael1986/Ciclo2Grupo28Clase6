package com.unal.ciclo2grupo28clase6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase6 {

    public static void main(String[] args) {
        //System.out.println(sumaWhile(5));
        //System.out.println(sumaFor(5));
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de 'n':");
        int n = sc.nextInt();
        System.out.print("La suma de los primeros " + n
                + " n\u00FAmeros naturales es:");
        System.out.print(sumaFor(n));
         */
        //forDobleControl();
        //forInfinito();
        //forBreak();
        System.out.println(menoresDe30());

    }

    //-----------------
    public static int sumaWhile(int n) {

        int s = 0;
        int i = 1;
        while (i <= n) {
            s = s + i;
            i++;
        }
        return s;

    }

//-------------------
    public static int sumaFor(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        return s;
    }
//--------------------------

    public static void forDobleControl() {
        for (int i = 0, j = 10; i <= j; i++, j--) {
            System.out.println(i + "," + j);
        }
    }

    //-----------------------------------------
    public static void forInfinito() {
        for (int i = 1; i <= 10; i--) {
            System.out.println(i);
            double aleatorio = Math.random();
            if (aleatorio < 0.001) {
                System.out.println(aleatorio);
                break;
            }
        }
    }

    //-------------------------
    public static void forBreak() {
        for (int i = 0; i <= 30; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

    }

    //------------------
    public static void forColecciones() {
        String[] frutas
                = new String[]{"Tomate de arbol", "Maracuya", "Guayaba", "Lulo"};

        for (String f : frutas) {//para cada elemento 
            System.out.println(f);
        }
    }

    public static List<Integer> menoresDe30() {
        int[] coleccionEdades = {23, 24, 34, 23, 26, 45, 25, 34, 33, 26, 21, 30, 21};//
        List<Integer> menores = new ArrayList<>();
        for (int edad : coleccionEdades) {
            if (edad <= Integer.parseInt("30")) {
                menores.add(edad);//append
            }
        }
        return menores;
    }

}
