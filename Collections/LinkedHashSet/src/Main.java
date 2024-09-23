import java.util.ArrayList;
import java.util.LinkedHashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numerosArray = new ArrayList<>();
        numerosArray.add(5);
        numerosArray.add(3);
        numerosArray.add(5);

        System.out.println(numerosArray);

        LinkedHashSet<Integer>  numerosLinkedHashSet = new LinkedHashSet<>(numerosArray);
        System.out.println(numerosLinkedHashSet);
    }
}

//LinkedHashSet não aceita numero repetido