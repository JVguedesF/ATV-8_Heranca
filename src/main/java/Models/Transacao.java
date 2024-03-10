package Models;

import Enum.TipoTransacao;

import java.time.LocalDate;

abstract class Transacao {
    protected static int idCounter = 1;
    protected int idTransacao;
    protected int idUsuario;
    protected TipoTransacao tipo;
    protected LocalDate data;
    protected double valor;
    protected String info;

    public Transacao(int idUsuario, TipoTransacao tipo, LocalDate data, double valor) {
        this.idTransacao = idCounter++;
        this.idUsuario = idUsuario;
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
    }

    public Transacao(int idUsuario, TipoTransacao tipo, LocalDate data, double valor, String info) {
        this.idTransacao = idCounter++;
        this.idUsuario = idUsuario;
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
        this.info = info;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String gerarComprovante() {
        String operacao = (tipo == TipoTransacao.ENTRADA) ? "+" : "-";

        String comprovante = "Transação nº:" + idTransacao + "Usuário nº: " + idUsuario + "\n";
        comprovante += "Data: " + data + "\t\t" + "Tipo: " + tipo + "\n";
        comprovante += "Valor: " + operacao + "R$" + valor + "\n";
        comprovante += "Descrição: " + info;

        return comprovante;
    }

    public void atualizarDados(LocalDate data, double valor, String info) {
        this.data = data;
        this.valor = valor;
        this.info = info;
    }
}
