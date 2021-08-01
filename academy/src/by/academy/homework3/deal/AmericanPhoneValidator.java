package by.academy.homework3.deal;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
    static Pattern pattern = Pattern.compile("\\+1\\(\\d{3}\\)\\d{3}-\\d{4}");

    @Override
    public boolean isValid(String anumber) {
        return pattern.matcher(anumber).find();
    }
}
