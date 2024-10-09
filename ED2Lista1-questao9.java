/**
** Função : Gera todas as permutações de uma string
** Autor : Carolina Veloso
** Data  : 07/10/2024
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class PermutacoesString {
    private static void permutar(String str, String permutacao, Set<String> resultados) {
        if (str.length() == 0) {
            resultados.add(permutacao);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permutar(str.substring(0, i) + str.substring(i + 1), permutacao + str.charAt(i), resultados);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> resultados = new HashSet<>();
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        permutar(input, "", resultados);

        for (String permutacao : resultados) {
            System.out.println(permutacao);
        }

        System.out.println("Quantidade de permutações: " + resultados.size());
        scanner.close();
    }
}