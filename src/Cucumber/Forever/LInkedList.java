package Cucumber.Forever;

public class LInkedList<E> {
    class Node<E> {
        E value;
        Node<E> next;
        Node<E> previous;
    }

    private Node<E> head;
    private Node<E> tail;
    private int length = 0;

    public void addTail(E newElement) {
        Node<E> element = new Node<E>();
        element.value = newElement;
        element.next = null;
        element.previous = null;

        if (tail == null) {
            head = element;
            tail = element;
        }
        element.previous = tail;
        tail.next = element;
        tail = element;
        length++;
    }

    public E searchElement (int n) {
        if (n < 0 || n > length) {
            System.out.println("Такого номера не существует");
        }
        if (n > length/2) {
            System.out.println("Tail");
            return searchElementHead(n);
        }

        System.out.println("Head");
        return searchElementTail(n);
    }

    private E searchElementTail (int n) {
        int i = length - 1;
        Node<E> elementNow = tail;
        while (i != n) {
            elementNow = elementNow.previous;
            i--;
        }
        return  elementNow.value;
    }

    private E searchElementHead (int n) {
        int i = 0;
        Node<E> elementNow = head;
        while (i != n) {
            elementNow = elementNow.next;
            i++;
        }
        return elementNow.value;
    }

    public String toString () {
        String listInString = "" + head.value;
        Node<E> element = head.next;

        for (int i = 0; i < length - 1; i++) {
            listInString += ", " + element.value;
            element = element.next;
        }

        return listInString;
    }
}
