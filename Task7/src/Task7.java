import exeption.Division;
import exeption.MyException;
import exeption.Resource;

public class Task7 {

    public static void main(String[] args) {

        getQuotient(new Division(10, 0));
        getQuotient(new Division(0.05, 3));

        try (Resource resource = new Resource()) {
            resource.useResource();
        }
    }

    private static void getQuotient(Division division) {
        try {
            division.getQuotient();
        } catch (IllegalArgumentException e) {
            System.out.println("Divider should n't be a zero!");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
