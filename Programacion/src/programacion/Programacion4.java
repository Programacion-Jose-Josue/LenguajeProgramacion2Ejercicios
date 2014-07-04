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
 * @author ElNIÑO
 */
public class Programacion4 {
   public static void main(String[] args) {
        // TODO code application logic here
//  4. Dadas dos cadenas S1 y S2. Eliminar en S1 todos esos caracteres que se presentan en S2. Devolver un S1 limpio con los caracteres eliminados. Cualquier carácter se elimina tanto en mayúsculas como en minúsculas.
//Por ejemplo, dado:
//S1 = "La vida es bella" S2 = "El santo"
//La función debe devolver: "vidb".
//La función recibirá 2 cadenas y devolver una cadena
 
        Scanner Ingreso = new Scanner(System.in);
        String S1="";
        String S2="";
        S1=(JOptionPane.showInputDialog("Ingrese Valor de la Cadena 1"));
        S2=(JOptionPane.showInputDialog("Ingrese Valor de la Cadena 2"));
        int longitud1=S1.length();
        int longitud2=S2.length();
        char[] frasecadena1 = S1.toCharArray();
        char[] frasecadena2 = S2.toCharArray();
        for (int i = 0; i < longitud2; i++)
          {
              for (int j = 0; j < longitud1; j++) 
              {
                  if (frasecadena1[j]== frasecadena2[i]) 
                  {
                      frasecadena1[j]=' ';
                  }
              }
          }
         for (int i=0;i<frasecadena1.length;i++)
               if (frasecadena1[i]!=' ') {
                   JOptionPane.showMessageDialog(null, frasecadena1[i] + " ");
               }
    }
}
