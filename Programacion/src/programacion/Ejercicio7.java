/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JoséLuis
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
     
    String Cadena1="";
    Cadena1=JOptionPane.showInputDialog("Ingrese Frase");
    int longitud1 = Cadena1.length();
    
    char [] frase1= Cadena1.toCharArray();
    
     for (int i = 0; i < longitud1; i++)
          {
              if (Cadena1.codePointAt(i)>=65 && Cadena1.codePointAt(i)<=90)
              {
                  
              int codigo = Cadena1.codePointAt(i);
              codigo =codigo+32;
            frase1[i] = Character.toLowerCase(frase1[i]); 
            
           char x=(char)frase1[i];

             System.out.println(x+ " = " +codigo);
             
              }else
                  
              {
              System.out.println( Cadena1.charAt(i)+ " = " + Cadena1.codePointAt(i)); 
          }
          
          }
    }
    
}
