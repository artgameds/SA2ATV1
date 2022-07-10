package sp.senai;

public class Produto {

    private int id;
    private String nome;
    private int quantidade;
    private double preço;
    public Produto(String nome, int quantidade, double preço) {
        //this.nome = nome;
        //this.quantidade = quantidade;
        //this.preço = preço;
        setNome(nome);
        setQuantidade(quantidade);
        setPreço(preço);

    }
    public Produto(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public String toString(){
        return nome;


}
}
