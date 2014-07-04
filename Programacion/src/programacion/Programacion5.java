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
public class Programacion5 {
    public static void main(String[] args) {
        // TODO code application logic here
//  5. Escriba una función para eliminar los duplicados de una matriz ordenada de enteros en una línea de código. (Usted puede usar tantas declaraciones como sea necesario, pero el código debe ser escrito en una sola línea).
//Ejemplo:
//Si la función recibe esta matriz: A = [-3, -2, 0, 0, 5, 7, 9, 11, 11, 25]
//La función debe devolver: A = [-3, -2, 0, 5, 7, 9, 11, 25]
//La función recibirá un arreglo de enteros, y devolver una matriz de enteros.
    
        int p=Integer.parseInt(JOptionPane.showInputDialog("Registre rango del vector"));
        int[] vector=new int[p];
        int n=0;
        for (int i = 0; i < vector.length; i++) 
            {
            int num=Integer.parseInt(JOptionPane.showInputDialog("Ingresar cantidad número"));
            vector[i]=num;
            }
             int i, j, varaux;
              for(i=0;i<vector.length-1;i++)
                for(j=0;j<vector.length-i-1;j++)
                 if(vector[j+1]<vector[j])
                    {
                     varaux=vector[j+1];
                     vector[j+1]=vector[j];
                     vector[j]=varaux;
                    } 
                    JOptionPane.showMessageDialog(null, "Vector con numeros ingresados \n");
                     for ( i = 0; i < vector.length; i++)
                        {
                        JOptionPane.showMessageDialog(null,vector[i]) ;     
                        }
                        JOptionPane.showMessageDialog(null, "\n El vector sin numeros repetidos \n"); 
                        int a;
                        for ( i = 0; i < vector.length; i++)
                            {
                            if (i==0) 
                                {
                                JOptionPane.showMessageDialog(null,vector[i]) ;
                                }
                                else
                                    {
                                    a=i-1;
                                    varaux=vector[i];
                                    if (varaux==vector[a])
                                        {
                                        }
                                        else
                                            {
                                            JOptionPane.showMessageDialog(null,vector[i]) ;
                                        }
                                }
                        }    
    }
}