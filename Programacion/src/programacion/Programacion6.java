/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ElNIÑO
 */
public class Programacion6 {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//  6. Dada una cadena, que contiene palabras y espacios (caracteres especiales), crear una función que devuelva una cadena con las palabras en un orden inverso.
//Ejemplo:
//Si la función recibe: "esta es una prueba", debe regresar: "prueba una es este".
//Si se recibe una cadena vacía, una cadena vacía se debe devolver. Si sólo hay una palabra recibida, la misma palabra que se debe devolver.
//La función recibirá una cadena y devolver una cadena.
//  
      BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Ingrese uns frase : ");
      String frase=a.readLine();
      String []palabra=frase.split(" ");

      for(int i=palabra.length-1;i>=0;i--){
          System.out.print(palabra[i]+" ");
      }
    }
}
