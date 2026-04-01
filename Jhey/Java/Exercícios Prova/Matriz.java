import java.util.Scanner;

public class Matriz {
    private int[][] matriz = new int[3][3];

    public void lerMatriz() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.println("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
    }
}

    public void imprimirTransposta() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.printf("%4d", matriz[j][i]);
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Matriz m = new Matriz();
        m.lerMatriz();
        System.out.println("Transposta:");
        m.imprimirTransposta();
    }
}