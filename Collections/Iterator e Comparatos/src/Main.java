import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Alice");
        listaNome.add("Bob");
        listaNome.add("Charlie");
        listaNome.add("David");

        Iterator<String> iterator = listaNome.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}