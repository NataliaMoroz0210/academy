package by.academy.classwork.lesson8;

public class Lesson8 {
    public static void main(String[] args) {

        interface Printable {
            static void print() {
                System.out.println("Book");
            }

        }
        class Book implements Printable {
            String name;
            String author;

            public Book(String name, String author) {
                this.name = name;
                this.author = author;
            }

        }
        class Magazine implements Printable {
            String name;
            public Magazine(String name) {
                this.name = name;
            }


        }
    }
}