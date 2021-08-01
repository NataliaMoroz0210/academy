package by.academy.homework3.deal;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
    static Pattern pattern = Pattern.compile("\\+375\\(\\d{2}\\)\\d{3}-\\d{4}");

    public BelarusPhoneValidator(String s) {

    }

    @Override
    public boolean isValid(String bnumber) {
        return pattern.matcher(bnumber).find();
    }
}
