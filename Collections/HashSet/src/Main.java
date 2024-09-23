import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Hello");
        set.add("World");
        set.add("Bye");
        set.add("Hello");
        set.add("World");

        for (String s : set) {
            System.out.println(set);
        }
    }
}