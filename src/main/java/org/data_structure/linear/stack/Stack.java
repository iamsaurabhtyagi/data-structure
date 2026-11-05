package org.data_structure.linear.stack;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Stack<T> {
    private final T[] items;

    private int index = -1;

    public Stack() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public Stack(int initialCapacity) {
        if(initialCapacity <= 0)
            throw new IllegalArgumentException("capacity must be greater than zero");

        items = (T[]) new Object[initialCapacity];
    }


    public void push(T item) {
        Objects.requireNonNull(item, "Stack does not allow NULL elements");

        if(index == items.length - 1)
            throw new IllegalStateException("Stack is FULL");

        items[++index] = item;
    }

    public T pop() {
        if(isEmpty())
            throw new NoSuchElementException("Empty Stack");

        T item = items[index];
        items[index--] = null;
        return item;
    }

    public T peek() {
        if(isEmpty())
            throw new NoSuchElementException("Empty Stack");

        return items[index];
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public int size() {
        return index + 1;
    }

    public void clear() {
        while (index >= 0)
            items[index--] = null;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(items, size()));
    }
}
