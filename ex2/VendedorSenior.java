// VendedorSenior.java
public class VendedorSenior extends Vendedor {
    private double vendas;
    private static final double PORCENTAGEM = 0.08; // 8%
    private static final double BONUS_META = 500.0;
    private static final double META = 10000.0;

    public VendedorSenior(String nome, double vendas){
        super(nome);
        this.vendas = Math.max(0, vendas);
    }

    @Override
    public double calcularRemuneracao(){
        double bonus = vendas > META ? BONUS_META : 0.0;
        return vendas * PORCENTAGEM + bonus;
    }
    public double getVendas(){ return vendas; }
}
