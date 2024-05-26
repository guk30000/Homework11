import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Author tom = new Author("Tom", "Buckler");
        Author bob = new Author("Bob", "Potato");
        Author alsoTom = new Author("Tom", "Buckler");

        Book badBoys = new Book("Bad Boys", tom, 1998);
        Book crazyDays = new Book("Crazy Days", bob, 2015);

        System.out.println(crazyDays.getDateOfPublication());
        crazyDays.setDateOfPublication(2020);
        System.out.println(crazyDays.getDateOfPublication());

        System.out.println(crazyDays);
        System.out.println(crazyDays.hashCode());
        if (crazyDays.equals(badBoys)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Разные книги");
        }

        System.out.println(tom);
        System.out.println(tom.hashCode());
        if (tom.equals(alsoTom)) {
            System.out.println("Один и тот же автор");
        } else {
            System.out.println("Разные авторы");
        }
    }
}
