import java.util.ArrayList;
import  java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> listaNome = new ArrayList<>();
        listaNome.add("Joao");
        listaNome.add("Maria");
        listaNome.add("Pedro");
        listaNome.add("Domingos");

        System.out.println("Antes");

        for (String nome : listaNome) {
            System.out.println(nome);
        }
        listaNome.set(0,"Jujuba");

        System.out.println();
        System.out.println();

        System.out.println("Depois");

        for (String nome : listaNome) {
            System.out.println(nome);
        }

        listaNome.remove(3);

        System.out.println();
        System.out.println();

        System.out.println("Depois de remover");

        for (String nome : listaNome) {
            System.out.println(nome);
        }
    }
}