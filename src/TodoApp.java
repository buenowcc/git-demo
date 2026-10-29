import java.util.ArrayList;
import java.util.List;

public class TodoApp {

    static final String GREETING = "A new greeting right here.";

    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        tasks.add("Learn git basics");
        tasks.add("Create a GitHub account");

        System.out.println(GREETING);
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}