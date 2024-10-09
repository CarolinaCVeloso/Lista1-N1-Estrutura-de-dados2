/**
** Função : Implementa a operação de resto da divisão usando recursividade.
** Autor : Carolina Veloso
** Data  : 07/10/2024
*/

import java.util.Scanner;

class restoDivisao {

    public static int mod(int x, int y) {
        if (x == y) {
            return 0;
        } else if (x < y) {
            return x;
        }else {
            return mod(x - y, y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número x: ");
        int x = scanner.nextInt();
        System.out.print("Digite o número y: ");
        int y = scanner.nextInt();
        if (y == 0) {
            System.out.println("Erro: O valor de y não pode ser zero.");
        } else {
            int resultado = mod(x, y);
            System.out.println("O resultado de " + x + " mod " + y + " é: " + resultado);
        }
        scanner.close();
    }
}