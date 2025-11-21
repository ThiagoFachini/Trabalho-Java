import java.util.Scanner;

public class VendedorSemPOO {

    public static double calcularSalario(double vendasMes, double salarioBase) {
        double comissao = vendasMes * 0.10; 
        return salarioBase + comissao;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();

        System.out.print("Total de vendas no mês: ");
        double vendasMes = sc.nextDouble();

        double salarioFinal = calcularSalario(vendasMes, salarioBase);

        System.out.println("Salário final: R$ " + salarioFinal);

        sc.close();
    }
}
