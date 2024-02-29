package Models;

public class Cartao {
    private int idCartao;
    private int numeroCartao;
    private String bandeiraCartao;
    private String vencimentoCartao;

    public Cartao(int idCartao, int numeroCartao, String bandeiraCartao, String vencimentoCartao) {
        this.idCartao = idCartao;
        this.numeroCartao = numeroCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.vencimentoCartao = vencimentoCartao;
    }

    public int getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(int idCartao) {
        this.idCartao = idCartao;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }
    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public String getVencimentoCartao() {
        return vencimentoCartao;
    }

    public void setVencimentoCartao(String vencimentoCartao) {
        this.vencimentoCartao = vencimentoCartao;
    }

}
