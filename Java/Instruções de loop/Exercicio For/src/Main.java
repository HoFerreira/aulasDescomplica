import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double nota1, nota2, media;
        Scanner input = new Scanner(System.in);

        for (int na = 1; na <= 5; na++) {

            System.out.println("Aluno " + na);
            System.out.println("Digite a primeira nota");
            nota1 = input.nextDouble();

            System.out.println("Digite a segunda nota");
            nota2 = input.nextDouble();

            media = (nota1 + nota2) / 2;
            System.out.println("Sua media é " + media);

        }
    }
}