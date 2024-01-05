package javaej;

import java.util.Scanner;

public class Ej616 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            int k = teclado.nextInt();
            if (k == 0) break;
            boolean left = false;
            int scoreLeft = 0, scoreRight = 0;
            for (int i = 0; i < k; i++) {
                String round = teclado.next();
                if (round.equals("PIC")) {
                    left = !left;
                }
                if (round.equals("PONG!")) {
                    if (left) scoreRight++;
                    else scoreLeft++;
                }
            }
            System.out.println(scoreLeft + " " + scoreRight);
        }
    }
}
