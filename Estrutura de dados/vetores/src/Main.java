import javax.swing.*;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int VetSoma [], soma = 0;
        VetSoma = new int[10];

        for (int i = 0; i <= 9; i++) {
            VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            soma = soma + VetSoma[i];
        }
        System.out.println("A soma dos 100 valores é: " + soma);
        System.exit(0);
    }
}