
package javamatriz;

import java.util.Scanner;

public class JavaMatriz {

    // llevar a cabo un programa que permita cargar completamente con numeros 5 una matriz de 4 filas 5 columnas 
    public static void main(String[] args) {
        int nFilas = 0,nColumnas = 0;
        Scanner teclado = new Scanner (System.in);
        int matriz [][] = new int [4][5];
        
        
        
        
        // rellenar matriz con numeros 5
        
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 5;
            }
            System.out.println("");
        }
        // mostrar matriz
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                
            }
            System.out.println("");
        }
       
        
        
        
        
        
     
    }
    
}
