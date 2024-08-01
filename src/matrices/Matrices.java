package matrices;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {


        Double matriz[][] = new Double[4][4];
        Scanner teclado = new Scanner(System.in);
        double suma = 0.0;

        // for para cargar
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Insert the grade of the student n° " + f);
                matriz[f][c] = teclado.nextDouble();
                suma = suma + matriz[f][c];
            }
            matriz[f][3] = suma / 3;
            suma = 0.0;
        }

        // for para recorrer
        for (int f = 0; f < 4; f++) {
            System.out.println("The grades of the student n° " + f + " son: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("Note n° " + c + " | " + matriz[f][c]);
            }
            System.out.println("GPA: " + matriz[f][3]);
        }


    }
}
