import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.println("Digite a nota 1: ");
        nota1 = input.nextDouble();

        System.out.println("Digite a nota 2: ");
        nota2 = input.nextDouble();

        System.out.println("Digite a nota 3: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média é " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media <= 6.9 && media >= 3.9) {
            System.out.println("Recuperação");
        } else if (media <= 4){
            System.out.println("Reprovado");
        }
    }
}