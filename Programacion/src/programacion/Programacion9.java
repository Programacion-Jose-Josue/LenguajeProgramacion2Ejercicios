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
public class Programacion9 {
   public static void main(String[] args) {
        // TODO code application logic here
//9. Dado un número entero positivo determinar si es la potencia de dos de otro número entero.
//No empezar a programar, lea las limitaciones.
//Por ejemplo:
//Si la función recibe 25, debe devolver TRUE, porque 5 ^ 2 = 25 Si la función recibe 1, debe devolver TRUE, porque 1 ^ 2 = 1 Si la función recibe 16, debe devolver TRUE, porque 4 ^ 2 = 16 Si la función recibe 14, debería devolver FALSE.
//Limitación: No es posible utilizar las funciones de raíz cuadrada (sqrt () o similar), potenciación (pow () o similar). Sólo se permiten las operaciones aritméticas básicas (suma, resta, multiplicación, división), y las operaciones lógicas.
//La función recibe un número entero positivo mayor que 0, y debe devolver un valor booleano.
       
    int num=0,c=0;
    for (int i = 0; i < 2; i++) 
    {
    num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero entero positivo"));
    if (num>0)
   {i=2;}
    else
            {
        i=0;
        JOptionPane.showMessageDialog(null, "Debe de Ingresar Valores Enteros Positivos es Decir Numeros Mayores a 0" );
            }  
        }
    long[] arreglo=new long[num];
    for (int i = 0; i < arreglo.length; i++) 
     {arreglo[i]=i*i;
     }
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (num==arreglo[i])
            {
                i=arreglo.length;
                c=1;
            }
        }
        if (c==1 || num == 1)
        {
            JOptionPane.showMessageDialog(null, "TRUE" );
        }
        else
        {
            JOptionPane.showMessageDialog(null, "FALSE" );
        }
    }
}
