import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    class FatorialP {
        static void fastP (int n, int x, int f){
            if (x == 0 || x == 1) {
                System.out.println("O fatorial de " + n + " é " + f); //regra 1
            } else {
                //chamada função recursiva
                fastP(n, x - 1, f * x); //regra 2 e 3
            }
        }
        public static void main(String[] args) {
            int nro;

            nro = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para saber o fatorial"));
            if (nro < 0) {
                System.out.println("Valor inválido para cálculo de fatorial, o valor precisa ser maior ou igual a zero");
                System.exit(0);
            } else {
                fastP(nro, nro,1);
            }
            System.exit(0);

    }
}
