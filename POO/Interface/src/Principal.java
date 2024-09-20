//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        AlunoEnsinoSuperior alunoSuperior = new AlunoEnsinoSuperior();

        alunoEnsinoMedio.nome = "Carlos";
        alunoEnsinoMedio.teste = 1;
        alunoEnsinoMedio.prova = 9;

        System.out.println("Aluno do ensino médio: ");
        System.out.println("Nome do aluno " + alunoEnsinoMedio.nome);
        System.out.println("Sua média é de " + alunoEnsinoMedio.getMedia());

        alunoSuperior.nome = "Maria";
        alunoSuperior.teste = 10;
        alunoSuperior.prova = 7;

        System.out.println("Aluno do ensino superior: ");
        System.out.println("Nome do aluno " + alunoSuperior.nome);
        System.out.println("Sua média é de " + alunoSuperior.getMedia());
    }
}