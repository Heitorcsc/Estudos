public class Aviao extends Veiculo {

    private boolean voando;


    public Aviao(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual, double litragem,
            double velocidadeMaxima, boolean voando) {
        super(marca, estado, tanque, consumo, velocidadeAtual, litragem, velocidadeMaxima);
        this.voando = voando;
    }


    public boolean isVoando() {
        return voando;
    }

    public void setVoando(boolean voando) {
        this.voando = voando;
    }
    public void Voar() {
    if (getVelocidadeAtual() >= 200 && !voando) {
        voando = true;
        System.out.println("Avião decolou! Status: Voando");
    } else if (getVelocidadeAtual() < 200 && voando) {
        voando = false;
        System.out.println("Avião pousou! Status: No chão");
    }
}

   @Override
public void Acelerar() {
    if (isVoando()) {
        setVelocidadeAtual(getVelocidadeAtual() + 20);
    } 
    Voar(); 
}

@Override
public void Frear() {
    if (isVoando()) {
        setVelocidadeAtual(getVelocidadeAtual() - 10);
    } 
    Voar(); 
}
@Override
public void chavear() {
    if (getVelocidadeAtual() == 0) {
        setEstado(!isEstado());
    } 
}

@Override 
public void Corrida(double distancia) {
    double litrosNecessarios = distancia / getConsumo();

    if (litrosNecessarios > getLitragem()) {
        setVelocidadeAtual(199);
        setLitragem(0);
        Voar();
        System.out.println("ALERTA: Pouso de emergência realizado por falta de combustível!");
    } else {
        setLitragem(getLitragem() - litrosNecessarios);
        System.out.println("Corrida finalizada! Litragem restante: " + getLitragem());
    }
}

}

