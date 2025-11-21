// Horista.java
public class Horista extends Professor {
    private int horas; // horas no mês
    private static final double VALOR_POR_HORA = 85.0;
    private static final int MAX_HORAS = 160;

    public Horista(String nome, int horas){
        super(nome);
        this.horas = Math.min(horas, MAX_HORAS);
    }

    @Override
    public double calcularPagamento(){
        return horas * VALOR_POR_HORA;
    }

    public int getHoras(){ return horas; }
}
