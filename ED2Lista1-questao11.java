/**
** Função : Implementação da Cifra de César para mensagens em português
** Autor : Carolina Veloso
** Data  : 07/10/2024
*/

import java.util.Scanner;

class CifraDeCesar {
    
    public static String criptografar(String mensagem, int chave) {
        StringBuilder resultado = new StringBuilder();

        for (char c : mensagem.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char novoChar = (char) (((c - 'A' + chave) % 26) + 'A');
                resultado.append(novoChar);
            } else if (Character.isLowerCase(c)) {
                char novoChar = (char) (((c - 'a' + chave) % 26) + 'a');
                resultado.append(novoChar);
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public static String descriptografar(String mensagem, int chave) {
        return criptografar(mensagem, 26 - (chave % 26));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a mensagem: ");
        String mensagem = scanner.nextLine();
        
        System.out.print("Digite a chave (número de posições para deslocar): ");
        int chave = scanner.nextInt();

        String mensagemCriptografada = criptografar(mensagem, chave);
        System.out.println("Mensagem criptografada: " + mensagemCriptografada);

        String mensagemDescriptografada = descriptografar(mensagemCriptografada, chave);
        System.out.println("Mensagem descriptografada: " + mensagemDescriptografada);
        scanner.close();
    }
}