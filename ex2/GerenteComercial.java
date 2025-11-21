
import java.util.List;

public class GerenteComercial extends Vendedor {
    private double salarioFixo = 3000.0;
    private List<Vendedor> equipe;

    public GerenteComercial(String nome, List<Vendedor> equipe){
        super(nome);
        this.equipe = equipe;
    }

    @Override
    public double calcularRemuneracao(){
        double totalVendasEquipe = equipe.stream()
            .filter(v -> v instanceof VendedorJunior || v instanceof VendedorSenior || v instanceof GerenteComercial)
            .mapToDouble(v -> {
                if(v instanceof VendedorJunior) return ((VendedorJunior)v).getVendas();
                if(v instanceof VendedorSenior) return ((VendedorSenior)v).getVendas();
                return 0.0;
            }).sum();
        return salarioFixo + totalVendasEquipe * 0.02;
    }

    public List<Vendedor> getEquipe(){ return equipe; }
}
