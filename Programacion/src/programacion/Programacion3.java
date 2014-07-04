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
public class Programacion3 {
    public static void main(String[] args) {
        // TODO code application logic here
//        3. Mira esta serie: 60, 30, 20, 15, 12 ... la semilla de esta serie fue el número 60.
//Cree una función que recibe dos enteros: x, y y. Si alguno de ellos es 0 o negativo, o si son mayores que 255, la función debe devolver -1.
//La función debe devolver el elemento y de las series generadas por x.
//Por ejemplo: Si la función recibe x = 60, y = 3, devolverá 20, porque el 20 es el elemento 3 º en la serie genera cuando x = 60.
//La función recibirá 2 enteros, devuelve un valor de punto flotante.

         int x,y,z,resultante;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero en X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero en Y"));
        if (x<=0 || x>255)
        {
            z=-1;
            JOptionPane.showMessageDialog(null,"Resultado es " +z);
        }
        else
        {
            int[] arreglo=new int[y];
            arreglo[0]=x;
            for (int i = 1;i<arreglo.length; i++) 
            {
               resultante=x/(i+1);
               arreglo[i]=resultante;           
            }
            for (int i = 0; i < arreglo.length; i++) 
            { 
              if(i==(y-1))
                {
                    JOptionPane.showMessageDialog(null,"Resultado es "+arreglo[i]);
                }  
            }
        }
    }
}
