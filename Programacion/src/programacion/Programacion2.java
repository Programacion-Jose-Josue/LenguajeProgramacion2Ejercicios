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
public class Programacion2 {
 public static void main(String[] args) {
        // TODO code application logic here
//     2. Mira esta serie: 2, 2, 4, 12, 48, ... la semilla de esta serie fue el número 2 Mira esta serie:. 3, 3, 6, 18, 72, ... la semilla de esta serie fue el número 3.
//Cree una función que recibe dos enteros: x, y  y. Si alguno de ellos es 0 o negativo, o si son mayores que 255, la función debe devolver -1
//La función debe devolver el elemento y de las series generadas por x.
//Por ejemplo, si la serie recibe x = 3, y = 4, es conveniente devolver 72, porque 72 es el cuarto elemento de la serie generado cuando x = 3.
//La función recibirá 2 enteros, y devuelve un entero.

        int x,y,z;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero en X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero en Y"));
        if (x<=0 || x>255)
        {
            z=-1;
            JOptionPane.showMessageDialog(null,"Resultado es"+z);   
        }
        else
        {
            int[] array=new int[y];
            array[0]=x;
            for (int i = 1; i < array.length; i++) 
            {
               x=x*(i+1);
               array[i]=x;
                System.out.println(i+" "+array[i]);               
            }
            for (int i = 0; i < array.length; i++) 
            {
                if(i==(y-1))
                {
                    z=array[i];
                    JOptionPane.showMessageDialog(null,"Resultado "+z);
                }
            }
        }   
    }
 }
