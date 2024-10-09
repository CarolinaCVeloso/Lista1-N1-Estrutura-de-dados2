/**
** Função : Contar o número de nós em uma lista encadeada usando recursão.
** Autor : Carolina Veloso
** Data  : 07/10/2024
*/

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    public int contarNos(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + contarNos(node.next);
    }
    public void adicionar(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}


class ContarNosListaEncadeada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList lista = new LinkedList();

        System.out.println("Digite os valores dos nós da lista encadeada (digite 'P' para finalizar):");

        while (true) {
            System.out.print("Digite o valor do nó: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("P")) {
                break;
            } try {
                int valor = Integer.parseInt(input);
                lista.adicionar(valor);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, insira um número inteiro ou 'P' para parar.");
            }
        }

        int quantidadeNos = lista.contarNos(lista.head);
        System.out.println("O número total de nós na lista encadeada é: " + quantidadeNos);
        scanner.close();
    }
}