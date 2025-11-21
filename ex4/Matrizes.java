package ex4;

public class Matrizes {
    public static void subtrair3x1(double[] a, double[] b, double[] resultado) {
        if (a == null || b == null || resultado == null)
            throw new IllegalArgumentException("Nenhuma matriz pode ser nula.");
        if (a.length != 3 || b.length != 3 || resultado.length != 3)
            throw new IllegalArgumentException("Todas as matrizes devem ter tamanho 3.");

        for (int i = 0; i < 3; i++) {
            resultado[i] = a[i] - b[i];
        }
    }

    // método de exemplo para testar
    public static void main(String[] args) {
        double[] a = {5.0, 7.2, -1.0};
        double[] b = {2.0, 1.2, 4.0};
        double[] r = new double[3];

        subtrair3x1(a, b, r);
        System.out.printf("Resultado: [%.2f, %.2f, %.2f]%n", r[0], r[1], r[2]);
    }
}
