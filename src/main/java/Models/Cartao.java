package Models;

public class Cartao {
    private int idCounter = 0;
    private int idCartao;
    private String numeroCartao;
    private String vencimentoCartao;
    private double saldoDevido;

    public Cartao(String numeroCartao, String bandeiraCartao, String vencimentoCartao) {
        this.idCartao = idCounter++;
        this.numeroCartao = numeroCartao;
        this.vencimentoCartao = vencimentoCartao;
        this.saldoDevido = 0.0;
    }

    public int getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(int idCartao) {
        this.idCartao = idCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public double getSaldoDevido() {
        return saldoDevido;
    }

    public void setSaldoDevido(double saldoDevido) {
        this.saldoDevido = saldoDevido;
    }

    public String getVencimentoCartao() {
        return vencimentoCartao;
    }

    public void setVencimentoCartao(String vencimentoCartao) {
        this.vencimentoCartao = vencimentoCartao;
    }

    public void fazerPagamento(double valor){
        saldoDevido -= valor;
    }
}
