package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Alvenio";
        first = first + " " + "Farhan";

        System.out.println(first);

        String second = "Alvenio Farhan";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Alvenio Farhan";
        System.out.println(third);

        System.out.println(second == third);
        System.out.println(second.equals(third));

    }
}
