#include <stdio.h>

double f(double x, int coefs[], int grado) {
    double result = 0;
    double term = 1;
    for (int i = 0; i <= grado; ++i) {
        result += coefs[i] * term;
        term *= x;
    }
    return result;
}

int main() {
    int grado;
    scanf("%d", &grado);
    while (grado != 20) {
        int coefs[grado + 1];
        for (int i = 0; i <= grado; ++i)
            scanf("%d", &coefs[grado - i]);
        int n;
        scanf("%d", &n);
        double area = 0;
        for (int i = 0; i < n; ++i) {
            double h = 1.0 / n;
            double eval = f(i * h, coefs, grado);
            if (eval < 0)
                continue;
            else if (eval > 1)
                eval = 1;
            area += h * eval;
        }
        if (area < 0.4995)
            printf("ABEL\n");
        else if (area > 0.5005)
            printf("CAIN\n");
        else
            printf("JUSTO\n");
        scanf("%d", &grado);
    }

    return 0;
}
