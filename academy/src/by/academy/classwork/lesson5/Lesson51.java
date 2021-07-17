package by.academy.classwork.lesson5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson51 { //Изменить регулярное выражение в примере для нахождения строк cab, ccab, cccab.
            public static void main(String[] args) {
                Pattern pattern = Pattern.compile("[a-с]+");
                Matcher matcher = pattern.matcher("cccab");
                boolean b = matcher.matches();
                System.out.println(b);
            }
        }



