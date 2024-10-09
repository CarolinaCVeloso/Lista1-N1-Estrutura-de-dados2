/**
** Função : Calcula a soma dos primeiros N inteiros positivos usando recursão
** Autor : Carolina Veloso
** Data  : 08/10/2024
*/

import java.util.Scanner;

class SomaRecursiva {

    public static int somar(int[] array, int n) {
        if (n <= 0) {
            return 0;
        }
        return array[n - 1] + somar(array, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        
        int[] array = new int[tamanho];
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Digite o número N: ");
        int n = scanner.nextInt();

        if (n > tamanho) {
            System.out.println("N não pode ser maior que o tamanho do array.");
        } else {
            int resultado = somar(array, n);
            System.out.println("A soma dos primeiros " + n + " inteiros positivos é: " + resultado);
        }
        scanner.close();
    }
}