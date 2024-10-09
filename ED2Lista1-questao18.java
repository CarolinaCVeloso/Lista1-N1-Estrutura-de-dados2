/**
** Função : Verifica se uma string é um palíndromo usando recursão
** Autor : Carolina Veloso
** Data  : 08/10/2024
*/

import java.util.Scanner;

class PalindromoRecursivo {

    public static boolean isPalindromo(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false; 
        }
        return isPalindromo(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase para verificar se é um palíndromo: ");
        String input = scanner.nextLine();

        if (isPalindromo(input)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
        scanner.close();
    }
}