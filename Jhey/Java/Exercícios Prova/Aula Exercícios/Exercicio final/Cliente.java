public class Cliente{
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private boolean cliente;
    private Item[] carrinho;

    public Cliente(String nome,int idade,String cpf,String endereco,boolean cliente){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cliente = cliente;
        this.carrinho = new Item[100];
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isCliente() {
        return cliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }

    public Item[] getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Item[] carrinho) {
        this.carrinho = carrinho;
    }


    public void adicionar(Item item){
        for(int i=0;i < 100;i++){
            if(carrinho[i] == null){
                carrinho[i] = item;
                break;
            }
        }
    }

    public void cancelar(int codigo){
        for(int i = 0;i < 100;i++){
            if(carrinho[i] != null && carrinho[i].getCodigo() == codigo){
                carrinho[i] = null;
            }
        }
    }

    public void comprar(){
        int contador = 0;
        double total = 0;
        for(int i = 0;i < 100;i++){
            if(carrinho[i] != null){
                total += carrinho[i].getValor();
                carrinho[i].setQuantidade(carrinho[i].getQuantidade() - 1);
                contador++;
            }
        }
        double media  = total / contador;
        System.out.println(total);
        System.out.println(media);
    }

}