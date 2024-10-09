/**
** Função : Conta quantas vezes um dígito K ocorre em um número N usando recursividade.
** Autor : Carolina Veloso
** Data  : 07/10/2024
** Observações:
*/
import java.util.Scanner;

class contadorDigito {

    public static int contarDigito(int N, int K) {
        if (N == 0) {
            return 0;
        }
        int digitoAtual = N % 10;
        if (digitoAtual == K) {
            return 1 + contarDigito(N / 10, K);
        } else {
            return contarDigito(N / 10, K);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número N: ");
        int N = scanner.nextInt();
        System.out.print("Digite o dígito K: ");
        int K = scanner.nextInt();
        int ocorrencias = contarDigito(N, K);
        System.out.println("O dígito " + K + " ocorre " + ocorrencias + " vezes no número " + N);
        scanner.close();
    }
}