package by.academy.classwork.lesson6;

import java.util.Objects;

public class Lesson54 {
  //// Product
    //     поля name
    //             price quantity (количество продукта)
    //
    //                 Добавить конструктор по умолчанию
    //            Добавить геттер.сеттеры
    //    equals/hashCoge
    //    to String

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder("Lesson54{");
        builder.append("name");
        builder.append("price");
        builder.append("quantity");

        builder.append('}');
        return builder.toString();
    }
}


