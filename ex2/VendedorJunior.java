// VendedorJunior.java
public class VendedorJunior extends Vendedor {
    private double vendas;
    private static final double PORCENTAGEM = 0.05; // 5%

    public VendedorJunior(String nome, double vendas){
        super(nome);
        this.vendas = Math.max(0, vendas);
    }

    @Override
    public double calcularRemuneracao(){
        return vendas * PORCENTAGEM;
    }
    public double getVendas(){ return vendas; }
}
