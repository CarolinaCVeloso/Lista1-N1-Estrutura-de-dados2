/**
** Função : Determina se uma string possui mais vogais que consoantes.
** Autor : Carolina Veloso
** Data  : 07/10/2024
*/

import java.util.Scanner;

class ContadorVogaisConsoantes {

    private static int[] contarVogaisConsoantes(String s, int index, int[] counts) {
        if (index >= s.length()) {
            return counts;
        }

        char ch = Character.toLowerCase(s.charAt(index)); 
        if ("aeiou".indexOf(ch) != -1) {
            counts[0]++;
        } else if (Character.isLetter(ch)) {
            counts[1]++;
        }
        return contarVogaisConsoantes(s, index + 1, counts); 
    }

    public static boolean temMaisVogaisQueConsoantes(String s) {
        int[] counts = {0, 0}; 
        contarVogaisConsoantes(s, 0, counts);
        return counts[0] > counts[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        if (temMaisVogaisQueConsoantes(input)) {
            System.out.println("A string tem mais vogais do que consoantes.");
        } else {
            System.out.println("A string não tem mais vogais do que consoantes.");
        }
        scanner.close();
    }
}