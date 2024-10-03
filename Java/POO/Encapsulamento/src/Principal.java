//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Jon");
        aluno.teste = 10;
        aluno.prova = 5;

        System.out.println(aluno.getNome());
        System.out.println(aluno.getMedia());
    }
}