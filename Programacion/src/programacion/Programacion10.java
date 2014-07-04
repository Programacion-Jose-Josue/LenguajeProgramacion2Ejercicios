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
public class Programacion10 {
public static void main(String args[]) {
//10. Un número perfecto es un número entero positivo que es igual a la suma de sus divisores apropiados. Por ejemplo, 6 es un número perfecto porque 6 = 1 +2 +3.
//Crear una función que recibe dos valores X y Y, debe devolver  el menor número perfecto encontrado, que es mayor o igual que X y menor o igual a Y. Si ningún número perfecto encontró, debe devolver -1.
//Por ejemplo, si la función recibe X = 5, Y = 7, se debe devolver 6, porque 6 es el número perfecto menor entre 5 y 7.
//La función recibirá dos enteros y devolver un entero.

    int x,y,S=0;
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número",""));
        y=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese otro número",""));
         
        for (int i = x; i <= y; i++) {
            S=0; 
            for (int j = 1  ; j < i; j++) {
                if ((i % j)==0) {
                    S =S+j;
                }
                if ((i==y)&&((i%j)!=0)) {
                    S=0; 
                }
            }
            if (S==i) {
                JOptionPane.showMessageDialog(null, "El primer número perfecto ente "+ x+" y "+y+ " es = " +S);
                i=y;
            }
        }
            if(S==0) {
                JOptionPane.showMessageDialog(null, "No hay números perfectos ente "+ x+" y "+y);
            }
    }  
}
