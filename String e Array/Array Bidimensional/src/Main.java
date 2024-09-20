//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [][] matriz = new int[2][3];
        int i, j;

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        for ( i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}