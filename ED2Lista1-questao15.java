/**
** Função : Calcula a multiplicação de dois números inteiros usando recursão
** Autor : Carolina Veloso
** Data  : 08/10/2024
*/

import java.util.Scanner;

class MultiplicacaoRecursiva {

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }

        if (b == 1) {
            return a;
        }
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (a): ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número (b): ");
        int b = scanner.nextInt();

        int resultado = multiplicar(a, b);
        System.out.println("Resultado de " + a + " * " + b + " = " + resultado);

        scanner.close();
    }
}