package by.academy.classwork.lesson10;

public class ArrayListCustom<T> {
    private T[] items;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayListCustom() {
        super();
        items = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public ArrayListCustom(int initCap) {
        super();
        items = (T[]) new Object[initCap];
    }

    public ArrayListCustom(T[] items) {
        super();
        this.items = items;
        size = items.length;
    }

    @SuppressWarnings("unchecked")
    private void growth() {
        T[] temp = (T[]) new Object[2 * items.length + 1];
        System.arraycopy(items, 0, temp, 0, items.length);
        items = temp;
    }

    public void add(T item) {
        if (size >= items.length) {
            growth();
        }
        items[size++] = item;
    }

    public void remove(int index) {
        if (index >= size || index < 0){
            System.out.println("Попытка удаления пустого элемента");
        }

        if (index < size) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
        }
        items[--size] = null;

    }

    public void set(int index, T item) {

    }

    public T get(int index) {
        if (index >= size || index < 0) {
            System.out.println("Выход за пределы массива");
            return null;
        } else {
            return items[index];
        }
    }

    public  T[] getItems(){
        return items;
    }

}
