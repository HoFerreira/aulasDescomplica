import java.util.LinkedHashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, String> listaNomes = new LinkedHashMap<>();
        listaNomes.put("Vava", "Oswaldo");
        listaNomes.put("Gi", "Gisele");
        listaNomes.put("Be", "Bernardo");
        listaNomes.put("Pe", "Pedro");
        listaNomes.put("Gio", "Giovanna");

        System.out.println("LinkedHashMap1: " + listaNomes);

        LinkedHashMap<String, String> novaListaNomes  = new LinkedHashMap<>(listaNomes);
        novaListaNomes.put("Ju", "Juliana");
        System.out.println("LinkedHashMap2: " + novaListaNomes);
    }
}