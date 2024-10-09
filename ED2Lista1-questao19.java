/**
** Função : Desenvolvimento do polinômio (x + 1)^n usando coeficientes binomiais
** Autor : Carolina Veloso
** Data  : 08/10/2024
*/

import java.util.Scanner;

class DesenvolvimentoPolinomio {

    public static int coeficienteBinomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return coeficienteBinomial(n - 1, k - 1) + coeficienteBinomial(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo n < 10: ");
        int n = scanner.nextInt();

        if (n < 0 || n >= 10) {
            System.out.println("O número deve ser positivo e menor que 10.");
        }

        System.out.print("Desenvolvimento do polinômio (x + 1)^" + n + ":\n");
        
        for (int k = 0; k <= n; k++) {
            int coef = coeficienteBinomial(n, k);
            if (k == 0) {
                System.out.print(coef);
            } else {
                System.out.print(" + " + coef + "x**" + k);
            }
        }
        System.out.println();
        scanner.close();
    }
}