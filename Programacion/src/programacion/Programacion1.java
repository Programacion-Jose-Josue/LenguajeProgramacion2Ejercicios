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
public class Programacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//   1.- Mira esta serie: 7, 6, 8, 4, 9, 2, 10, 0, 11, -2, ...
//Cree una función que recibe dos enteros: x e y. Si alguno de ellos es 0 o negativo, o si son mayores que 255, la función debe devolver -1
//De lo contrario, la función debe devolver la suma de los elementos X e Y de la serie.
//Por ejemplo: Si la función recibe x = 1, y = 3, se debería devolver: 15 (Debido a que la suma de la primera, más el tercer argumento es 7 +8 = 15).. Si la función recibe x = 8, y = 9, es conveniente devolver 11. (Debido a que la suma de la octava más el elemento noveno es 0 11 = 11).
//La función recibirá 2 enteros, y devuelve un entero.

        int x=0, y=0, a=7, b=6, r=0, m;
        int[] arreglo1=new int[128];
        int[] arreglo2=new int[128];
        int[] arreglo3=new int[255];
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero en X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero en Y"));
        if (x<=0 || x>255 || y<=0 || y>255)
        {
            r=-1;
        }
        else
        {
            for (int i = 0; i <255; i++) 
            {
                if (x==(i+1))
                {
                    a=arreglo3[i];
                }
                else
                {
                    if (y==(i+1))
                    {
                        b=arreglo3[i];
                    }
                }
            }
            r=a+b;
        }
        JOptionPane.showMessageDialog(null,"Resultado es" +r);
    }
}