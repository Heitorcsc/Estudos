public class Professor extends Sala {
    private String nome;
    private int idade;
    private int matricula;
    private Aluno aluno;

    public Professor(int idade, int matricula, String nome) {
        super(nome, false, new int[10], 0);
        this.idade = idade;
        this.matricula = matricula;
        this.nome = nome;
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

    public void iniciarAula() {
        if (!isOcupado()) {
            alternar();
            System.out.println("A aula está acontecendo com o professor " + nome + ", matrícula " + matricula);
        } else {
            System.out.println("A sala está ocupada.");
        }
    }
    public void chamada(boolean[] presencas) {
    for (int i = 0; i < presencas.length; i++) {
        if (presencas[i]) {
            getVetor()[getDia()]++;
        }
    }
    setDia(getDia() + 1);
}
public void terminarAula() {
    if (isOcupado()) {
        alternar();
        setDia(getDia() + 1);
        System.out.println("A aula foi finalizada pelo professor " + nome + ", matrícula " + matricula);
    } else {
        System.out.println("Não existe aula nessa sala.");
    }
}
}