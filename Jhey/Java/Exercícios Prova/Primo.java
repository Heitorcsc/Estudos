import java.util.Scanner;

public class Primo {
    private int numero;

    public boolean ePrimo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        if (numero < 2){ 
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Primo p = new Primo();
        if (p.ePrimo())
            System.out.println("É primo!");
        else
            System.out.println("Não é primo.");
    }
}

