package Models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    public String getInfo() {
        return info;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public String getData() {
        return data;
    }



    public static List<Transacao> transacoes = new ArrayList<>();

    public static void cadastrarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public static void atualizarTransacao(int idTransacao, double novoValor, String novaDescricao, String novaData) {
        for (Transacao transacao : transacoes) {
            if (transacao.getIdTransacao() == idTransacao) {
                transacao.valor = novoValor;
                transacao.info = novaDescricao;
                transacao.data = novaData;
                return;
            }
        }
    }

    public static void deletarTransacao(int idTransacao) {
        transacoes.removeIf(transacao -> transacao.getIdTransacao() == idTransacao);
    }


    public static void testarTransacao() {
        Transacao transacao = new Transacao(1, 100.0d, "Compra de alimentos", 1, "25/02/2024");

        System.out.println("------Informações da Transação------");
        System.out.println("ID da Transação: " + transacao.getIdTransacao());
        System.out.println("ID do Usuário: " + transacao.getIdUsuario());
        System.out.println("Valor: " + transacao.getValor());
        System.out.println("Descrição: " + transacao.getInfo());
        System.out.println("Data: " + transacao.getData());
        System.out.println();
    }
}
