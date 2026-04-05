import java.util.Scanner;

public class Conta{
    private String agencia;
    private String numero;
    private int saldo;

    
    public Conta(String agencia, String numero, int saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void saque(int saldo){
        Scanner sc = new Scanner(System.in);
        int receber = sc.nextInt();
        if (receber > saldo){
            System.out.println("Saldo indisponível.");
        } else{
            saldo = saldo - receber;
            System.out.println("Saque realizado com sucesso!");
        }
    }
    public void deposito(int saldo){
        Scanner sc = new Scanner(System.in);
        int depositar = sc.nextInt();
        saldo = saldo + depositar;
        System.out.println("Depósito realizado com sucesso!");
    }

}