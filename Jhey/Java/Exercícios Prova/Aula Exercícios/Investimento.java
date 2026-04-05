import java.util.Random;

public class Investimento extends Conta {
    private String agencia;
    private String numero;
    protected int saldo;
    private String risco;

    public Investimento(String agencia, String numero, int saldo) {
        super(agencia, numero, saldo);
    }

    

    public void investir(int valorInvestido) {
        Random random = new Random();
        double chance = random.nextDouble();

        switch (risco.toLowerCase()) {
            case "baixo":
                if (chance <= 0.85) {
                    saldo += valorInvestido * 0.025;
                }
                break;
            case "medio":
                if (chance <= 0.45) {
                    saldo += valorInvestido * 0.30;
                }
                break;
            case "alto":
                if (chance <= 0.02) {
                    saldo += valorInvestido * 1.00;
                }
                break;
            default:
                System.out.println("Risco inválido!");
        }
    }

    
    public String getRisco() { return risco; }
    public void setRisco(String risco) { this.risco = risco; }

    public int getSaldo() { return saldo; }
    public void setSaldo(int saldo) { this.saldo = saldo; }

    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
}