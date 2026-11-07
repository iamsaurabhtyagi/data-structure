package org.data_structure.linear.linkedlist;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public void reverse() {
        Node<E> previous = null;
        var current = root;
        Node<E> next;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        root = previous;
    }

    public int size() {
        var size = 0;
        var current = root;

        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }

    public void clear() {
        root = null;
    }

    public boolean contains(E element) {

        var current = root;
        while (current != null) {
            if(Objects.equals(element, current.value))
                return true;
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public String toString() {
        Stream<E> nodeStream = Stream.iterate(root, Objects::nonNull, current -> current.next).map(node -> node.value);
        return nodeStream.map(String::valueOf).collect(Collectors.joining(", ", "[", "]"));
    }
}
