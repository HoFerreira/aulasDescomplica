//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "Hosana";
        String nomeGuerra = "Hosana";

        String sobreNome = new String("Hosana");

        if (nome.equals(nomeGuerra))
            System.out.println("Nomes iguais");
        else
            System.out.println("Nomes diferentes");

        if (nome.equals(sobreNome))
            System.out.println("Nomes iguais");
        else
            System.out.println("Nomes diferentes");

        //equals compara o conteudo

        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());
        System.out.println(nome.concat("Ferreira"));
    }
}