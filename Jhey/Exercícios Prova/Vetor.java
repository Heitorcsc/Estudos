import java.util.Scanner;

public class Vetor {
    private int[] vetor = new int[5];

    public void receberVetor(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 5;i++){
             System.out.printf("Digite o item do vetor: ");
             vetor[i] = sc.nextInt();
        }
    }
    public void acharMenor(){
        int menor = vetor[0];
        for(int i = 0;i < 4;i++){
            if(vetor[i + 1] < menor){
                menor = vetor[i + 1]; 
            }
            
        }
        System.out.printf("O menor foi alterado para %d%n",menor);
    }
    public static void main(String[] args) {
    Vetor v = new Vetor();
    v.receberVetor();
    v.acharMenor();
}

}


   
