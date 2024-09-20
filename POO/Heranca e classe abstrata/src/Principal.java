//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        Professor professor = new Professor();
        aluno.setNome("Jonas");
        aluno.teste = 10;
        aluno.prova = 5;

        System.out.println(aluno.getNome());
        System.out.println(aluno.getMedia());

        professor.setNome("Jon Doe");
        professor.setSalario(1000);

        System.out.println(professor.getNome());
        System.out.println(professor.getInss());
        System.out.println(professor.getSalarioLiquido());

}
}