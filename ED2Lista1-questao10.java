/**
** Função : Encontra o menor e o maior valor em um array de inteiros
** Autor : Carolina Veloso
** Data  : 07/10/2024
*/

import java.util.Random;

class MinMaxRecursivo {
    
    private static void encontrarMinMax(int[] array, int index, int[] minMax) {
        if (index == array.length) {
            return;
        }

        if (array[index] < minMax[0]) {
            minMax[0] = array[index]; 
        }
        if (array[index] > minMax[1]) {
            minMax[1] = array[index];
        }
        encontrarMinMax(array, index + 1, minMax);
    }

    public static void main(String[] args) {
        int tamanho = 10; 
        int[] array = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(1_000_000) + 1; 
        }

        int[] minMax = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        encontrarMinMax(array, 0, minMax);

        System.out.println("Array gerado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nMenor valor: " + minMax[0]);
        System.out.println("Maior valor: " + minMax[1]);
    }
}