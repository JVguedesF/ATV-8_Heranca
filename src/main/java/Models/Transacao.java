package Models;

public class Transacao {
    private short idTransacao;
    private int dtTransacao;
    private int valorTransacao;
    private int nmCategoria;

    public Transacao(short idTransacao, int dtTransacao, int valorTransacao, int nmCategoria){
        this.idTransacao = idTransacao;
        this.dtTransacao = dtTransacao;
        this.valorTransacao = valorTransacao;
        this.nmCategoria = nmCategoria;
    }

    public short getIdTransacao() {
        return idTransacao;
    }

    public int getDtTransacao() {
        return dtTransacao;
    }

    public int getValorTransacao() {
        return valorTransacao;
    }

    public int getNmCategoria() {
        return nmCategoria;
    }


}
