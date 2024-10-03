import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome");
        nome = teclado.next();

        System.out.println("O nome é " + nome);
    }
}