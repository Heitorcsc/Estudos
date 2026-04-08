public class Cliente2 extends Cliente{
    private int pontos;
    private double saldo;

    public Cliente2(int pontos, double saldo, String nome, int idade, String cpf, String endereco, boolean cliente) {
        super(nome, idade, cpf, endereco, cliente);
        this.pontos = 0;
        this.saldo = 0;
        
    }

    

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void compraEspecial(double total){
        double novoTotal = total * 0.95;
        double descontoPontos = this.pontos * 5;
        double valorFinal = novoTotal - descontoPontos;
        if (valorFinal < 0) {
            valorFinal = 0;
        }
        this.pontos = 0;

        if (this.saldo >= 100) {
            int gruposDeCem = (int) (this.saldo / 100);
            
            
            this.pontos += (gruposDeCem * 5);
            
            this.saldo = this.saldo % 100;
        }


    

    
}
}
