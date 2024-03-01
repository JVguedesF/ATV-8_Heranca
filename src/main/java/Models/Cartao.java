package Models;

public class Cartao {
    private static long idCounter = 0;
    private int idCartao;
    private String numeroCartao;
    private String bandeiraCartao;
    private String vencimentoCartao;

    public Cartao(String numeroCartao, String bandeiraCartao, String vencimentoCartao) {
        this.idCartao = (int) idCounter++;
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

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
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
