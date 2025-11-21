import java.util.Scanner;

public class ProfessorSemPOO {

    public static double calcularPagamento(String tipo, int horas, int titulos, int projetos) {
        switch (tipo) {
            case "horista":
                return Math.min(horas, 160) * 85.0;

            case "dedicacao":
                return 8000 + titulos * 1500;

            case "pesquisador":
                return 5000 + projetos * 2000;

            default:
                return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de professor (horista/dedicacao/pesquisador): ");
        String tipo = sc.nextLine();

        System.out.print("Horas trabalhadas: ");
        int horas = sc.nextInt();

        System.out.print("Quantidade de títulos: ");
        int titulos = sc.nextInt();

        System.out.print("Quantidade de projetos: ");
        int projetos = sc.nextInt();

        double pagamento = calcularPagamento(tipo, horas, titulos, projetos);

        System.out.println("Pagamento calculado: R$ " + pagamento);

        sc.close();
    }
}
