public class Carro extends Veiculo {
    private String placa;

    public Carro(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual, double litragem, double velocidadeMaxima, String placa){
        super(marca, estado, tanque, consumo, velocidadeAtual, litragem, velocidadeMaxima);
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

@Override
public void Acelerar() {
    while(getVelocidadeAtual() < getVelocidadeMaxima()) {
        setVelocidadeAtual(getVelocidadeAtual() + 10);
    }
}
@Override
public void Frear() {
    while(getVelocidadeAtual() > 0) {
        setVelocidadeAtual(getVelocidadeAtual() - 5);
    }
}
@Override
public void chavear(){
        setEstado(!isEstado());
        while(getVelocidadeAtual() > 0 && isEstado() == false){
            Frear();
        }
    }
public void Corrida(double distancia, double gasolinaEspecial) {
    if (getLitragem() + gasolinaEspecial > getTanque()) {
        System.out.println("Erro: A mistura excede a capacidade do tanque!");
        return;
    }

    double consumoEspecial = getConsumo() * 2;
    double distanciaPossivelEspecial = gasolinaEspecial * consumoEspecial;

    if (distanciaPossivelEspecial >= distancia) {
        double litrosGastos = distancia / consumoEspecial;
        System.out.println("Corrida finalizada apenas com gasolina especial!");
    } else {
        double distanciaRestante = distancia - distanciaPossivelEspecial;
        System.out.println("Gasolina especial acabou! Faltam " + distanciaRestante + "km.");
        super.Corrida(distanciaRestante);
    }
    double litrosNecessarios = distancia / getConsumo();
    if (litrosNecessarios > getLitragem()) {
        double distanciaPercorrida = getLitragem() * getConsumo();
        double kmFaltantes = distancia - distanciaPercorrida;
        System.out.println("Combustível insuficiente! Faltam " + kmFaltantes + " km para completar.");
        setLitragem(0);
        setVelocidadeAtual(0);
    } else {
        setLitragem(getLitragem() -  litrosNecessarios);
        System.out.println("Corrida finalizada! Litragem restante: "+ (getLitragem() - litrosNecessarios));

    }
}
}
