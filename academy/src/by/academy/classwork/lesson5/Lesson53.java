package by.academy.classwork.lesson5;

import java.util.Objects;

public class Lesson53 {
    public class Cat {
        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        String nickname;
        int age;



        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return age == cat.age && Objects.equals(nickname, cat.nickname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nickname, age);
        }

    }

}
