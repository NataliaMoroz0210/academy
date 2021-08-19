package by.academy.homework4;

import java.util.Arrays;

public class ArrayList<T> {

    private T[] items;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        super();
        items = (T[]) new Object[16];
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int initCap) {
        super();
        items = (T[]) new Object[initCap];
    }

    @SuppressWarnings("unchecked")
    private void growth() {
        items = Arrays.copyOf(items, 2 * items.length + 1);
    }

    public void add(T item) {
        if (size >= items.length) {
            growth();
        }
        items[size++] = item;
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            System.out.println("Попытка удаления пустого элемента");
        }

        if (index < size) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
        }
        items[--size] = null;
    }

    public void remove1(T obj) {
        for (int i = 0; i < items.length; i++) {
            if (obj.equals(items[i])) {
                remove(i);
            }
        }
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            System.out.println("Выход за пределы массива");
            return null;
        } else {
            return items[index];
        }
    }

    public T[] getLast() {
        if (size >= 0) {
            return (T[]) items[size - 1];
        }
        return null;
    }

    public T[] getFirst() {
        if (size >= 0) {
            return (T[]) items[0];
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public int getIndexLast() {
        return (size - 1);
    }
}


