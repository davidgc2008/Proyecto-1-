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
        contarDe10a1();
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
    public static void contarDe10a1(){
        //contar del 10 al 1 TODO EN LA MISMA LISTA
       int i = 10;
        System.out.println("Bucle While");
        while (i <=10){
            System.out.println( i + " ");
            i--;
            
        }
        
        
        
    }
}
//mostrar los numeros pares entre 0 y 10 con el bucle que queramos
//pedir numeros al usuario hasta que teclee un 0
//mostrar solo los numeros negativos
//igual que el anterior, pero contando el numero de positivos, el numero de negativos, y los multiplos de cinco
//HACERLO SIN IA