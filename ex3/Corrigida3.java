// 3Corrigida.java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Corrigida3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("=== Divisão de dois números ===");
            System.out.print("Informe o penúltimo numero do seu celular: ");
            int x = teclado.nextInt();

            System.out.print("Informe o ultimo digito do seu celular: ");
            int y = teclado.nextInt();

            if (y == 0) {
                System.out.println("Erro: divisão por zero não é permitida.");
            } else {
                double r = (double) x / (double) y;
                System.out.println("O resultado da divisão é " + r);
            }
        } catch (InputMismatchException ime) {
            System.out.println("Entrada inválida: por favor, digite números inteiros.");
        } catch (ArithmeticException ae) {
            System.out.println("Erro aritmético: " + ae.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            teclado.close();
            System.out.println("Scanner fechado. Programa finalizado.");
        }
    }
}
