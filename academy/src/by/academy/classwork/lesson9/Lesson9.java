package by.academy.classwork.lesson9;

import by.academy.Animal;
import by.academy.homework1.task5.Cat;

import java.io.Serializable;

public class Lesson9<T extends Comparable<String>, V extends Animal & Serializable, K extends Number> {
    private T variableT;
    private V variableV;
    private K variableK;

    public Lesson9() {
        super();
    }

    public Lesson9(T variableT, V variableV, K variableK) {
        this.variableT = variableT;
        this.variableV = variableV;
        this.variableK = variableK;
    }

    public T getVariableT() {
        return variableT;
    }

    public void setVariableT(T variableT) {
        this.variableT = variableT;
    }

    public V getVariableV() {
        return variableV;
    }

    public void setVariableV(V variableV) {
        this.variableV = variableV;
    }

    public K getVariableK() {
        return variableK;
    }

    public void setVariableK(K variableK) {
        this.variableK = variableK;
    }

    public String getKName() {
        return variableK.getClass().getName();
    }

    public String getVName() {
        return variableV.getClass().getName();
    }

    public String getTName() {
        return variableT.getClass().getName();
    }

    public static void main(String[] args) {
        Lesson9<String, Cat, Integer> demo = new Lesson9<>("sdgsd", new Cat(), 45645);
        System.out.println(demo.getKName());
        System.out.println(demo.getVName());
        System.out.println(demo.getTName());

    }
}



