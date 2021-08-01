package by.academy.classwork.lesson9;

import by.academy.Animal;

public class Box<T extends Animal>{ //Average
    T item;

    public  Box (T item){
        this.item = item;
    }
    public T getItem(){
        return item;
    }
    public void setItem(T item){
        this.item = item;
    }




}
