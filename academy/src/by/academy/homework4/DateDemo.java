package by.academy.homework4;


import by.academy.homework3.deal.DateVerifier;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Objects;

public class DateDemo {
    YearDemo year;
    MonthDemo month;
    DayDemo day;

    public DateDemo(String date) {
        if (DateVerifier.verify(date)) {
            String[] adate = date.split("-");
            day = new DayDemo(Integer.parseInt(adate[0]));
            month = new MonthDemo(Integer.parseInt(adate[1]));
            year = new YearDemo(Integer.parseInt(adate[2]));
        }
    }

    public YearDemo getYear() {
        return year;
    }

    public void setYear(YearDemo year) {
        this.year = year;
    }

    public MonthDemo getMonth() {
        return month;
    }

    public void setMonth(MonthDemo month) {
        this.month = month;
    }

    public DayDemo getDay() {
        return day;
    }

    public void setDay(DayDemo day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateDemo dateDemo = (DateDemo) o;
        return Objects.equals(year, dateDemo.year) && Objects.equals(month, dateDemo.month) && Objects.equals(day, dateDemo.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DateDemo{");
        sb.append("year=").append(year);
        sb.append(", month=").append(month);
        sb.append(", day=").append(day);
        sb.append('}');
        return sb.toString();
    }

    public void setDate(int year1, int month1, int day1) {
        year.value = year1;
        month.value = month1;
        day.value = day1;
    }

    public void printDayOfWeek() {
        System.out.println("Day of week " + LocalDate.of(year.value, month.value, day.value)
                .getDayOfWeek().getDisplayName(
                        TextStyle.FULL_STANDALONE,
                        Locale.US
                ));
    }

    public static long dayBetween(DateDemo first, DateDemo second) {
        LocalDate first1 = LocalDate.of(first.year.value, first.month.value, first.day.value);
        LocalDate first2 = LocalDate.of(second.year.value, second.month.value, second.day.value);
        return Duration.between(first1.atStartOfDay(), first2.atStartOfDay()).toDays();
    }

    public boolean is() {
        if (year.value % 4 == 0) {
            if (year.value % 100 == 0) {
                return year.value % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }


    public static class YearDemo {
        private int value;

        public YearDemo(int parseInt) {
            value = parseInt;
        }
    }

    public static class MonthDemo {
        private int value;

        public MonthDemo(int parseInt) {
            value = parseInt;
        }


    }

    public static class DayDemo {


        private int value;

        public DayDemo(int parseInt) {
            value = parseInt;
        }
    }


}
