package by.academy.classwork.lesson9;

public class Lesson91 {
    private  String login;
    private String password;
    class Query {
        public void printToLog(){
            System.out.println("Пользователь " + login + " отправил запрос");
        }
    }
  public void  createQuery() {
      Query q = new Query();
      q.printToLog();
  }
}
