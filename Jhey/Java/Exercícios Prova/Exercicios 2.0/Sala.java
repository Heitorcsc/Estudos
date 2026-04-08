public class Sala{
    private String nome;
    private boolean ocupado;
    private int[] vetor = new int [10];
    private int dia = 0;

    public Sala(String nome,boolean ocupado,int[] vetor,int dia){
        this.nome = nome;
        this.ocupado = ocupado;
        this.vetor = vetor;
        this.dia = dia;
}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    

    public void alternar() {
        this.ocupado = !this.ocupado;
    }
    
    
}