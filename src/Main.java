import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student dave = new Student("Dave", 22, 'M',  new ArrayList<String>(Arrays.asList("Programming", "Precalculus")), 2024);
        Athlete john = new Athlete("John", 22, 'M', 5, new ArrayList<String>(Arrays.asList("Soccer", "Basketball")));

        System.out.println(dave.Greet());
        System.out.println(john.Greet());
    }
}
