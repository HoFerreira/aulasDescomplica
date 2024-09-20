import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int op;

        do {
            System.out.println("---------");
            System.out.println("Menu principal");
            System.out.println("---------");
            System.out.println("Selecione uma das opções abaixo");
            System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.println("3 - Coordenador");
            System.out.println("0 - Sair");

            System.out.println("Qual opção deseja?");
            op = teclado.nextInt();

            if (op ==0)
                break;
            switch (op) {
                case 1:
                    System.out.println("Você selecionou a opção Aluno");
                    break;
                case 2:
                    System.out.println("Você selecionou a opção professor");
                    break;
                case 3:
                    System.out.println("Você selecionou a opção coordenador");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (true);

        System.out.println("Fim");
    }
}