import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> linguagensProgramacao = new HashMap<>();
        linguagensProgramacao.put(1, "C++");
        linguagensProgramacao.put(2, "Java");
        linguagensProgramacao.put(3, "Python");
        System.out.println("Conteúdo do HashMap: " + linguagensProgramacao);

        String valor = linguagensProgramacao.get(3);
        System.out.println("Elemento da chave 3: " + valor);


        System.out.println("Chaves: " + linguagensProgramacao.keySet());
        System.out.println("Valores: " + linguagensProgramacao.values());
        System.out.println("Chaves/valor: " + linguagensProgramacao.entrySet());
    }
}