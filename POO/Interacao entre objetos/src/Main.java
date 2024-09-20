//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno objeto = new Aluno();

        objeto.nome = "John Doe";
        objeto.teste = 9;
        objeto.prova = 6;

        System.out.println(objeto.obterMedia());

        if (objeto.obterMedia() > 7)
            System.out.println("Aprovado!");
        else if (objeto.obterMedia() > 4 && objeto.obterMedia() < 7)
            System.out.println("Recuperação!");
        else
            System.out.println("Reprovado!");
    }
}