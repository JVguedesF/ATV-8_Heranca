package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    protected void setValor(double novoValor) {
        this.valor = novoValor;
    }

    public String getInfo() {
        return info;
    }

    protected void setInfo(String novaDescricao) {
        this.info = novaDescricao;
    }

    public String getData() {
        return data;
    }

    protected void setData(String novaData) {
        this.data = novaData;
    }

    public long getIdUsuario() {
        return idUsuario;
    }


    public static List<Transacao> transacoes = new ArrayList<>();
    public static void cadastrarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public static void visualizarTransacao(List<Transacao> transacoes){
        System.out.println("------ Lista de Transações ------");
        for (Transacao transacao : transacoes){
            System.out.println("transação " + transacao.getIdTransacao() + ":");
            System.out.println("Valor:" + transacao.getValor());
            System.out.println("Descriçao:" + transacao.getInfo());
            System.out.println("Data:" + transacao.getData());
            System.out.println();
        }
    }

    public static void atualizarTransacao(int idTransacao, double novoValor, String novaDescricao, String novaData) {
        visualizarTransacao(transacoes);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Atualizando receita com ID " + idTransacao + "...");
        for (Transacao transacao : transacoes) {
            if (transacao.getIdTransacao() == idTransacao) {
                transacao.setValor(novoValor);
                transacao.setInfo(novaDescricao);
                transacao.setData(novaData);
                System.out.println();
                System.out.println("Transação atualizada com sucesso!");
                System.out.println();
                return;
            }
        }
        System.out.println("Transação com ID " + idTransacao + " não encontrada. Nenhuma atualização realizada.");
    }

    public static void deletarTransacao(int idTransacao) {
        visualizarTransacao(transacoes);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Excluindo Transação com ID " + idTransacao+ "...");
        transacoes.removeIf(transacao -> transacao.getIdTransacao() == idTransacao);
        System.out.println("Transação excluída com sucesso!");
    }

}
