package classesandmethods;

public class TestDateThis {

    public static void main ( String[] args ) {

        DateThis date = new DateThis();

        System.out.println(date.day);
        System.out.println(date.month);
        System.out.println(date.year);

        DateThis anotherDateThis = new DateThis(2, 2, 2);

        System.out.println(anotherDateThis.day);
        System.out.println(anotherDateThis.month);
        System.out.println(anotherDateThis.year);
    }
}