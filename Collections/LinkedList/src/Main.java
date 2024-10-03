import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> listaNome = new LinkedList<>();
        listaNome.add("Maria");
        listaNome.add("João");
        listaNome.add("Pedro");
        listaNome.add("José");
        listaNome.add(0,"Damiano");

        System.out.println("Antes");

        for (String nome : listaNome) {
            System.out.println(nome);
        }

    }
}