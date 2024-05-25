public class Main {
    public static void main(String[] args) {

        Author tom = new Author("Tom", "Buckler");
        Author bob = new Author("Bob", "Potato");

        Book badBoys = new Book("Bad Boys", tom, 1998);
        Book crazyDays = new Book("Crazy Days", bob, 2015);

        System.out.println(crazyDays.getDateOfPublication());
        crazyDays.setDateOfPublication(2020);
        System.out.println(crazyDays.getDateOfPublication());

    }
}
