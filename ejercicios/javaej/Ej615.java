package javaej;

import java.util.Scanner;

public class Ej615 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n, f, t, k = teclado.nextInt();
        while (k-- != 0 ){
            n = teclado.nextInt();
            t = teclado.nextInt();
            f = teclado.nextInt();
            System.out.println((f % (n + 1)) * t);
        }
    }
}
