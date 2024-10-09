/**
** Função : Inverte a ordem de um array de inteiros usando recursividade.
** Autor : Carolina Veloso
** Data  : 07/10/2024
** Observações: 
*/
import java.util.Scanner;

class inverterOrdemArray {

    public static void inverterArray(int[] array, int inicio, int fim) {
        if (inicio >= fim) {
            return;
        }
        int temp = array[inicio];
        array[inicio] = array[fim];
        array[fim] = temp;

        inverterArray(array, inicio + 1, fim - 1);
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
        inverterArray(array, 0, array.length - 1);
        System.out.println("Array invertido:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}