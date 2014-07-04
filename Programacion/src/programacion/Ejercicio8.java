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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String Cadena1="";
        Cadena1=JOptionPane.showInputDialog("Ingrese Frase");
        Cadena1=" "+ Cadena1 +" "; 
        int longitud = Cadena1.length();
        char[] frase1 =Cadena1.toCharArray();
        int ac=0;
        for (int i = 0; i< Cadena1.length() ; i++)
        {
            if (frase1[i]=='A'||frase1[i]=='a') 
            {
                ac=ac+1;
                for (int j = i; j < Cadena1.length(); j++) 
                {
                    if (frase1[j]==' ') 
                    {
                      i=j;
                      j=Cadena1.length();
                      
                    }
   
                }
                
            }
            
        }
        
        System.out.println(""+Cadena1);
        System.out.println("hay   "+   ac + "  palabras  con A");
    }
    
}
