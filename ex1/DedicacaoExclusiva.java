// DedicacaoExclusiva.java
public class DedicacaoExclusiva extends Professor {
    private double salarioFixo = 8000.0;
    private int titulos; // mestre/doutor counts (1 por titulação)
    private static final double ADICIONAL_TITULACAO = 1500.0;

    public DedicacaoExclusiva(String nome, int titulos){
        super(nome);
        this.titulos = Math.max(0, titulos);
    }

    @Override
    public double calcularPagamento(){
        return salarioFixo + titulos * ADICIONAL_TITULACAO;
    }

    public int getTitulos(){ return titulos; }
}
