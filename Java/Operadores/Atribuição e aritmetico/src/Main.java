import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double nota1 = 9.0;
        double nota2 = 8.5;
        double nota3 = 3.0;

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println(media);

        int valor;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número:");

        valor = teclado.nextInt();

        System.out.println(valor + 3);
    }
}

