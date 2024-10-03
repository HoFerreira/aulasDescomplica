import discentes.AlunoSuperior;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AlunoSuperior aluno = new AlunoSuperior();

        //aluno.nome = "John"; é errado usar
        aluno.setNome("John");

        aluno.setTeste(6);
        aluno.setProva(9);

        if (aluno.getMedia() >= 7)
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado!");

        System.out.println(aluno.getNome());
        System.out.println(aluno.getMedia());
    }
}