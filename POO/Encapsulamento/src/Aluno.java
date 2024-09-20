public class Aluno {
    String nome;
    double teste, prova;

    

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return this.nome;
    }

    double getMedia() {
        return (teste + prova) / 2;
    }
}
