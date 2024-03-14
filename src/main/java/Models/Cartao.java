package Models;

import Repositorio.TransacaoRepositorio;

import java.time.LocalDate;


public class Cartao {
    private static int idCounter = 0;
    private int idCartao;
    private String numeroCartao;
    private LocalDate vencimentoCartao;
    private double saldoDevido;

    public Cartao(String numeroCartao, LocalDate vencimentoCartao) {
        this.idCartao = idCounter++;
        this.numeroCartao = numeroCartao;
        this.vencimentoCartao = vencimentoCartao;
        this.saldoDevido = 0.0;
    }

    public int getIdCartao() {
        return idCartao;
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

    public LocalDate getVencimentoCartao() {
        return vencimentoCartao;
    }

    public void setVencimentoCartao(LocalDate vencimentoCartao) {
        this.vencimentoCartao = vencimentoCartao;
    }

    public static void gerarFatura(int idCartao) {
       TransacaoRepositorio.mostrarExtratoCartao();
       double valorFatura = TransacaoRepositorio.calcularSomatorioTransacoesCartao(idCartao);

       System.out.println("Valor da Fatura R$" + valorFatura);

    }
}
