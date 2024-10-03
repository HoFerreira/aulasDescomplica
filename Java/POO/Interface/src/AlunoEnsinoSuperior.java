public class AlunoEnsinoSuperior extends Aluno implements  Media{

   public double getMedia() {
       return (teste + prova * 2) / 3;}
}
