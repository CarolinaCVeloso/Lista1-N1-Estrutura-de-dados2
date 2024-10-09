/**
** Função : Implementação de uma lista encadeada recursiva com método para inverter a lista
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

    public Node inverter(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node invertedListHead = inverter(node.next);
        node.next.next = node;
        node.next = null;
        return invertedListHead;
    }

    public void inverter() {
        head = inverter(head);
    }

    public void exibir() {
        Node current = head;
        if (current == null) {
            System.out.println("Lista vazia.");
            return;
        } while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class ListaEncadeadaRecursiva {
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

        System.out.println("Lista original:");
        lista.exibir();
        lista.inverter();
        System.out.println("Lista invertida:");
        lista.exibir();
        scanner.close();
    }
}