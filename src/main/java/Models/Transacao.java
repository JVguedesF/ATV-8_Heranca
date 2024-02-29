package Models;

public class Transacao {
    private static int idCounter = 1;
    private int idTransacao;
    private double valor;
    private String info;
    private long idUsuario;
    private String data;

    public Transacao(int idTransacao, double valor, String descricao, long idUsuario, String data) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.info = descricao;
        this.idUsuario = idUsuario;
        this.data = data;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double novoValor) {
        this.valor = novoValor;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String novaDescricao) {
        this.info = novaDescricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String novaData) {
        this.data = novaData;
    }

    public long getIdUsuario() {
        return idUsuario;
    }



}
