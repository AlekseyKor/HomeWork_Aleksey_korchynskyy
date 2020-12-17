package hometask9;

public class Node<L> {
    L item;
    Node<L> next;
    Node<L> prev;

    Node(Node<L> prev, L element, Node<L> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}
