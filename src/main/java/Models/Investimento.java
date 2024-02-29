package Models;

public class Investimento {
    private static long idCounter = 1;
    private int idInvestimento;
    private double totalInvestimento;
    private String data;
    private String tipo;
    private double valor;

    public Investimento(double totalInvestimento, String data, String tipo, double valor){
        this.idInvestimento = (int) idCounter++;
        this.totalInvestimento = totalInvestimento;
        this.data = data;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getIdInvestimento() {
        return idInvestimento;
    }

    public void setIdInvestimento(int idInvestimento) {
        this.idInvestimento = idInvestimento;
    }

    public double getTotalInvestimento() {
        return totalInvestimento;
    }

    public void setTotalInvestimento(double totalInvestimento) {
        this.totalInvestimento = totalInvestimento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void setIdCounter(long idCounter) {
        Investimento.idCounter = idCounter;
    }






}