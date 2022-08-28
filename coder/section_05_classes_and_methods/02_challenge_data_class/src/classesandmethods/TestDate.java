package classesandmethods;

public class TestDate {

    public static void main (String [] args) {

        Date date1 = new Date();

        Date date2 = new Date();

        date1.year = 2004;
        date1.month = 10;
        date1.day = 14;

        date2.year = 2005;
        date2.month = 11;
        date2.day = 15;

        // System.out.printf("%d/%d/%d\n", date1.year, date1.month, date1.day);

        // System.out.printf("%d/%d/%d", date2.year, date2.month, date2.day);

        System.out.println(date1.getFormattedDate());
        
        System.out.println(date2.getFormattedDate());

    }
}