import java.util.Iterator;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeSet<String> listaNome = new TreeSet<String>();

        listaNome.add("Andre");
        listaNome.add("Carlos");
        listaNome.add("Ana");
        listaNome.add("Carlo");

        Iterator<String> iterator = listaNome.iterator();

        while(iterator.hasNext()) {
            System.out.println(listaNome);
        }
    }
}

//TreeSet trabalha com os nomes ordenados