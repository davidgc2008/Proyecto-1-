/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package jdgc.bucles;

/**
 *
 * @author usuariom
 */
public class Bucles {

    public static void main(String[] args) {
        buclesWhile();
        bucleDoWhile();
        bucleFor();
    }

    public static void buclesWhile() {
//escribir del 1 al 3
        int i = 1;
        while (i <= 3) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(""); //para que se vaya la linea de abajo
    }

    public static void bucleDoWhile() {
System.out.println("BUCLE DO WHILE");
int i = 1;
do{
    System.out.print(i + " ");
    i++;
}while (i<=3);
System.out.println(""); //para que se vaya la linea de abajo
}
    

    public static void bucleFor() {
        System.out.println("BUCLE FOR");
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");                      
        }
        System.out.println("");
    }
}
