package by.academy.homework1.task5;

import by.academy.Animal;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    String nickname;
    int age;

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
    }

    boolean isHomeAnimal;

    public char getInitials() {
        return initials;
    }

    public void setInitials(char initials) {
        this.initials = initials;
    }

    char initials;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    int money;

    public void grow() {
        age = age + 1;
    }

    public void sleep() {
        System.out.println("cat sleeping");
    }

    public void eat() {
        System.out.println("cat eating");
    }

    public void walk() {
        System.out.println("cat walking");
    }

    public Cat() {
    }

    public Cat(String nickname) {
        this.nickname = nickname;
    }
}

