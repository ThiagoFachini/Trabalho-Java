// MainProfessores.java
import java.util.*;

public class MainProfessores {
    public static void main(String[] args){
        List<Professor> lista = new ArrayList<>();
        lista.add(new Horista("Ana", 120));
        lista.add(new Horista("Bruno", 200)); // será limitado a 160
        lista.add(new DedicacaoExclusiva("Carla", 2)); // mestre + doutor = 2
        lista.add(new Pesquisador("Diego", 3));

        System.out.println("Pagamentos do mês:");
        for(Professor p : lista){
            System.out.println(p);
        }

        // Total da folha
        double total = lista.stream().mapToDouble(Professor::calcularPagamento).sum();
        System.out.printf("Total da folha: R$ %.2f%n", total);
    }
}
