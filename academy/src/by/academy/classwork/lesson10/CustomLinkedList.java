package by.academy.classwork.lesson10;

public class CustomLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    private Integer size = 0;

    public void add(T item) {
        Node<T> node = new Node<>();
        node.value = item;
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void print() {
        Node<T> node = head;
        while (node != null) {
            System.out.println(node.value + " ");
            node = node.next;
        }

    }

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.print();
        list.remove(3);
        list.print();
        list.remove(0);
        list.print();

    }



    public void remove(int index) {

        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        if (index == size - 1) {
            Node<T> prev = tail.prev;
            prev.next = null;
            tail = prev;
            size--;
            return;
        }

        if (index >= 0 && index < size) {
            System.out.println("removing");
            int counter = 0;
            Node<T> node = head;
            while (node != null) {
                if (counter == index) {
                    break;
                }
                node = node.next;
                counter++;
            }
            Node<T> prev = node.prev;
            Node<T> next = node.next;
            if (index == 0){
                head = next;
            }
            if (prev != null) {
                prev.next = next;
            }
            next.prev = prev;
            size--;

            return;
        }
        System.out.println("Index of bound");
    }

    public void set(int index, T item) {

    }

    public T get(int index) {
        return null;
    }

    class Node<T> {
        Node<T> next;
        Node<T> prev;
        T value;

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Node{");
            sb.append("next=").append(next);
            sb.append(", prev=").append(prev);
            sb.append(", value=").append(value);
            sb.append('}');
            return sb.toString();
        }
    }


}