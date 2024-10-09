/**
** Função : Calcula a soma da série até o N-ésimo termo de forma recursiva.
** Autor : Carolina Veloso
** Data  : 07/10/2024
** Observações: A função usa recursividade para calcular a soma.
*/
import java.util.Scanner;

class SerieRecursiva {
    public static double serie(int n) {
        if (n == 1) {
            return 1.0; 
        }
        return 1.0 / n + serie(n - 1);  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();
        System.out.printf("A soma da série até 1/%d é: %.5f\n", n, serie(n));
        scanner.close();
    }
}
