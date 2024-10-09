/**
** Função : Inverter uma string de forma recursiva.
** Autor : Carolina Veloso
** Data  : 07/10/2024
*/

import java.util.Scanner;

class InverterString {

    public static String inverter(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return s.charAt(s.length() - 1) + inverter(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();
        String resultado = inverter(entrada);
        System.out.println("O inverso da string \"" + entrada + "\" é: \"" + resultado + "\"");
        scanner.close();
    }
}