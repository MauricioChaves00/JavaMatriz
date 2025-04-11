
package javamatriz;

import java.util.Scanner;
public class JavaMatriz {

    // llevar a cabo un programa que permita cargar completamente con numeros 5 una matriz de 4 filas 5 columnas 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double matriz [][] = new double[4][4];
        
        double nota,suma = 0.0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese la nota del alumno numero ["+i+"]");
                matriz[i][j] = entrada.nextDouble();
                suma = suma +matriz[i][j];
                
            }
            matriz[i][3] = suma/3;
            suma =0.0;
            
        }
        
        
        
        for (int i = 0; i < 4; i++) {
            System.out.println("la nota del alumno "+i+ "son:" );
            for (int j = 0; j < 3; j++) {
                
                System.out.println("nota numero " + j + " " + matriz[i][j]);
                
            }
            System.out.println("el promedio de las notas es: "+ matriz[i][3]);
            }
        
     
    }
    
}
