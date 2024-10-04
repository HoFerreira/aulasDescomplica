import javax.swing.*;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fatorial {
    static int fat (int n) {
        int f;
        if (n == 0) {
            return 1; //regra 1
        } else {  //chamada da função recursiva
            f = n * fat(n-1); //regra 2 e 3
        return f;
        }
    }
    public static void main(String[] args) {
        int f, nro;

        nro = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que quer saber o fatorial"));
        if (nro <0) {
            System.out.println("Valor inválido");
System.exit(0);
}
else {   f = fat(nro); //chamda da função recursiva
            System.out.println("O fatorial de " + nro + " é " + f);
}
System.exit(0);
}
}