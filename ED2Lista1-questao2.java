/**
** Função : Calcula a soma de todos os elementos de um array de reais de forma recursiva.
** Autor : Carolina Veloso
** Data  : 07/10/2024
** Observações:
*/
import java.util.Scanner;

class somaArray {

    public static double somaRecursiva(double[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        return array[index] + somaRecursiva(array, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        
        double[] array = new double[tamanho];
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextDouble();
        }

        double soma = somaRecursiva(array, 0);
        System.out.printf("A soma dos elementos do array é: %.2f\n", soma);
        scanner.close();
    }
}
