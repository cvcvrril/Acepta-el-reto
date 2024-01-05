package org.example;

import java.util.Scanner;

public class Ej617 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int k = teclado.nextInt();
        while (k-- != 0) {
            int num = teclado.nextInt();
            teclado.nextLine();
            Character[][] tabla = new Character[num][3];
            for (int i = 0; i < num; i++) {
                String input = teclado.nextLine();
                for (int j = 0; j < 3; j++) {
                    tabla[i][j] = input.charAt(j);
                }
            }
            String msg = "";
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < num; j++) {
                    msg += tabla[j][i];
                }
            }
            System.out.println(msg);
        }

    }

}
