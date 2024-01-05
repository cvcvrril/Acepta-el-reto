import java.util.Scanner;

public class Ej103 {

    public static double f(double x, int[] coefs) {
        double result = 0;
        double term = 1;
        for (int coef : coefs) {
            result += coef * term;
            term *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grado = scanner.nextInt();
        while (grado != 20) {
            int[] coefs = new int[grado + 1];
            for (int i = 0; i < grado + 1; ++i)
                coefs[grado - i] = scanner.nextInt();
            int n = scanner.nextInt();
            double area = 0;
            for (int i = 0; i < n; ++i) {
                double h = 1.0 / n;
                double eval = f(i * h, coefs);
                if (eval < 0) continue;
                else if (eval > 1) eval = 1;
                area += h * eval;
            }
            if (area < 0.4995) System.out.println("ABEL");
            else if (area > 0.5005) System.out.println("CAIN");
            else System.out.println("JUSTO");
            grado = scanner.nextInt();
        }
    }
}
