package classesandmethods;

public class DateImpl {

    int day;

    int month;

    int year;

    DateImpl () {

        day = 1;

        month = 1;

        year = 1970;

    }

    DateImpl (
            int initialDay,
            int initialMonth,
            int initialYear)
    {

        day = initialDay;

        month = initialMonth;

        year = initialYear;

    }

    public String getFormattedDate() {

        String formattedDate = String.format("%d/%d/%d",year, month, day);

        return formattedDate;
    }
}