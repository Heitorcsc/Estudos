public class Veiculo { 
    private String marca;
    private boolean estado;
    private double tanque;
    private double consumo;
    private double velocidadeAtual;
    private double litragem;
    private double velocidadeMaxima;

    public Veiculo(String marca, boolean estado,double tanque,double consumo,double velocidadeAtual,double litragem,double velocidadeMaxima){
        this.marca = marca;
        this.estado = estado;
        this.tanque = tanque;
        this.consumo = consumo;
        this.velocidadeAtual = velocidadeAtual;
        this.litragem = litragem;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getLitragem() {
        return litragem;
    }

    public void setLitragem(double litragem) {
        this.litragem = litragem;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


    public void chavear(){
        this.estado = !this.estado;
    }

    public void Acelerar(){
        while(velocidadeAtual < velocidadeMaxima){
            velocidadeAtual+= 1;
        }
    }
        public void Frear(){
        while(velocidadeAtual > 0 ){
            velocidadeAtual-= 1;
        }
    }
    public void Corrida(double distancia) {
    
    double litrosNecessarios = distancia / consumo;

    if (litrosNecessarios > litragem) {
        double distanciaPercorrida = litragem * consumo;
        double kmFaltantes = distancia - distanciaPercorrida;
        System.out.println("Combustível insuficiente! Faltam " + kmFaltantes + " km para completar.");
        this.litragem = 0;
        this.velocidadeAtual = 0;
    } else {
        this.litragem -= litrosNecessarios;
        System.out.println("Corrida finalizada! Litragem restante: " + this.litragem);
    }
}
    
    
}
