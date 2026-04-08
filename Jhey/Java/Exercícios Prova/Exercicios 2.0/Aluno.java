public class Aluno{
    private String nome;
    private int idade;
    private int matricula;
    private boolean[] vetor = new boolean[10];

    public Aluno(String nome,int idade,int matricula,boolean[] vetor){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.vetor = vetor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean[] getVetor() {
        return vetor;
    }

    public void setVetor(boolean[] vetor) {
        this.vetor = vetor;
    }
    
}
