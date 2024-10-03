//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "Hosana";
        String sobreNome = "Ferreira";
        String nomeCompleto = nome + sobreNome;
        String nomeComBuffer;

        System.out.println(sobreNome);

        StringBuffer buffer = new StringBuffer();

        buffer.append(nome);
        buffer.append(sobreNome);

        nomeComBuffer = buffer.toString();

        System.out.println(nomeCompleto);
        System.out.println(nomeComBuffer);
    }
}