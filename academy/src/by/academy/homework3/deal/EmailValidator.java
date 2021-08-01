package by.academy.homework3.deal;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    static Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public EmailValidator(String s) {

    }

    @Override
    public boolean isValid(String email) {
        return pattern.matcher(email).find();
    }
}
