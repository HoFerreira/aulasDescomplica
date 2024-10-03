import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> mapaNomes = new TreeMap<>();
        mapaNomes.put("Vava", "Oswaldo");
        mapaNomes.put("Gi", "Gisele");
        mapaNomes.put("Be", "Bernardo");
        mapaNomes.put("Pe", "Pedro");
        mapaNomes.put("Gio", "Giovanna");

        System.out.println("TreeMap: " + mapaNomes);

        System.out.println("Chaves " + mapaNomes.keySet());
        System.out.println("Valores " + mapaNomes.values());
        System.out.println("Chave/Valores " + mapaNomes.entrySet());

    }
}