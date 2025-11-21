// Professor.java
public abstract class Professor {
    private String nome;
    public Professor(String nome){ this.nome = nome; }
    public String getNome(){ return nome; }
    public abstract double calcularPagamento();
    @Override
    public String toString(){
        return String.format("%s - R$ %.2f", nome, calcularPagamento());
    }
}
