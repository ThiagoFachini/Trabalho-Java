
public class Pesquisador extends Professor {
    private double salarioBase = 5000.0;
    private int projetosAtivos;
    private static final double BOLSA_POR_PROJETO = 2000.0;

    public Pesquisador(String nome, int projetosAtivos){
        super(nome);
        this.projetosAtivos = Math.max(0, projetosAtivos);
    }

    @Override
    public double calcularPagamento(){
        return salarioBase + projetosAtivos * BOLSA_POR_PROJETO;
    }

    public int getProjetosAtivos(){ return projetosAtivos; }
}
