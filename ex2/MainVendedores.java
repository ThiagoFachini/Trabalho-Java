// MainVendedores.java
import java.util.*;

public class MainVendedores {
    public static void main(String[] args){
        VendedorJunior j1 = new VendedorJunior("Lucas", 8000);
        VendedorSenior s1 = new VendedorSenior("Marina", 12000);
        List<Vendedor> equipe = Arrays.asList(j1, s1);
        GerenteComercial g = new GerenteComercial("Roberto", equipe);

        List<Vendedor> todos = Arrays.asList(j1, s1, g);
        System.out.println("Remunerações:");
        for(Vendedor v : todos){
            System.out.printf("%s - R$ %.2f%n", v.getNome(), v.calcularRemuneracao());
        }
    }
}
