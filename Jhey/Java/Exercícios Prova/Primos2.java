import java.util.Scanner;

public class Primos2 {
    private int pa;
    private int pb;

    public void ePrimo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o começo: ");
        pa = sc.nextInt();
        System.out.print("Digite o fim: ");
        pb = sc.nextInt();

        for (int i = pa; i <= pb; i++) {
            boolean primo = true;
            if (i < 2) primo = false;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo)
                System.out.println(i + " é primo");
        }
    }

    public static void main(String[] args) {
        Primos2 p = new Primos2();
        p.ePrimo();
    }
}