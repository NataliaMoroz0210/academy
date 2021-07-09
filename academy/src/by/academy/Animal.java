package by.academy;

public class Animal {
    Integer age;
    String nickname;

    public Animal(Integer age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    public Animal() {
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
