package javaej;

import java.util.Scanner;

public class Ej114 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        for (int i = 0; i < num1; i++){
            int num2 = teclado.nextInt();
            if (num2>=5) System.out.println(0);
            else if (num2==4) System.out.println(4);
            else if (num2==3) System.out.println(6);
            else if (num2==2) System.out.println(2);
            else if ((num2==1) || (num2==0)) System.out.println(1);

        }

    }
}
