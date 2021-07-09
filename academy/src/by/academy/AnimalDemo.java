package by.academy;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal(5,"Angela");
        System.out.println(dog.getAge());
        System.out.println(dog.getNickname());
        System.out.println(cat.getAge());
        System.out.println(cat.getNickname());
        }
}