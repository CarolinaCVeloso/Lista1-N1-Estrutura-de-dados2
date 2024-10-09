/**
** Função : Verifica se um array contém um elemento que é a soma de dois elementos anteriores
** Autor : Carolina Veloso
** Data  : 07/10/2024
*/

import java.util.Scanner;

class SomaDeDoisAnteriores {

    public static boolean verificaSoma(int[] A, int i) {
        if (i < 2) {
            return false;
        }

        for (int j = 0; j < i; j++) {
            for (int k = j + 1; k < i; k++) {
                if (A[j] + A[k] == A[i]) {
                    return true;
                }
            }
        }
        return verificaSoma(A, i - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        boolean resultado = verificaSoma(A, n - 1);

        if (resultado) {
            System.out.println("O array contém um elemento que é a soma de dois elementos anteriores.");
        } else {
            System.out.println("O array não contém tal elemento.");
        }
        scanner.close();
    }
}