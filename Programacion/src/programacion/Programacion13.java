/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programacion;

import javax.swing.JOptionPane;

/**
 *
 * @author ElNIÑO
 */
public class Programacion13 {
public static void main(String[] args) {
//13. Se le da una matriz con números enteros positivos y negativos. Escriba una función para cambiar el orden de los elementos de la matriz de tal manera que los enteros negativos estén al principio, los enteros positivos queden al final. Cero (0) y números enteros que tienen el mismo signo no cambia el orden.
//Por ejemplo, si la función recibe: a[0] = 4; a[1] = -3; a[2] = -100; a[3] = 7; a[4] = 0; a[5] = 1; a[6] = -6;
//la función debe devolver:
//a[0] = -3; a[1] = -100; a[2] = -6; a[3] = 4; a[4] = 7; a[5] = 0; a[6] = 1;
//La función recibe un arreglo de enteros y devuelve un array de enteros.
//Limitaciones: Usted no puede utilizar métodos proporcionados por el lenguaje de clasificación. (Por ejemplo, Array.sort (), sort (), etc ..). Si usted lo necesita, debe crear su propia implementación de la función de clasificación.

    int n=0; int menor=0; int posicion =0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero n"));
        int[] arreglo1=new int[n];
        int[] arregloauxiliar=new int[n];
        for (int i = 0; i < n; i++) {
            arreglo1 [i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valores al vector"));
        }
         
         for (int i = 0; i < n; i++) {
             if (arreglo1[i] < 0) {
                arregloauxiliar[posicion]= arreglo1[i];
                posicion++;
             }
         }
         for (int i = 0; i < n; i++) {
            if (arreglo1[i] >= 0) {
                arregloauxiliar[posicion]= arreglo1[i];
                posicion++;
             }
        }
         for (int i :arregloauxiliar) {
        System.out.printf("%d ",i);
    }
}    
}