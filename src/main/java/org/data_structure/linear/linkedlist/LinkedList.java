package org.data_structure.linear.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<E> {
    private static class Node<E> {
        Node<E> next;
        E value;

        Node(E value) {
            this.value = value;
        }
    }

    private Node<E> root;

    public void add(E element) {
        Node<E> currentNode = new Node<>(element);
        if(root == null) {
            root = currentNode;
            return;
        }
        Node<E> current = root;
        while (current.next != null)
            current = current.next;

        current.next = currentNode;
    }

    public E remove() {
        if(root == null)
            throw new NoSuchElementException("Empty List");

        var element = root.value;
        root = root.next;
        return element;
    }
}
