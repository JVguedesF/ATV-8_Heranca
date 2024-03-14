package Repositorio;

import Models.*;
import Enum.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class TransacaoRepositorio {

    public static List<Transacao> transacoes = new ArrayList<>();

    public static void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }


    public static void mostrarExtrato() {
        System.out.println("------ Lista de Transações ------");
        for (Transacao transacao : transacoes) {
            System.out.println(transacao.gerarComprovante());
        }
    }

    public static void mostrarExtratoCartao() {
        System.out.println("------ Lista de Transações ------");
        for (Transacao transacao : transacoes) {
            if (transacao instanceof TransacaoCartao) {
                System.out.println(transacao.gerarComprovante());
            }
        }
    }

    public static void visualizarTransacoes() {
        for (Transacao transacao : transacoes) {
            String dados = "idTransacao: " + transacao.getIdTransacao() + "\n";
            dados += "idUsuario: " + transacao.getIdUsuario() + "\n";
            dados += "Tipo: " + transacao.getTipo() + "\n";
            dados += "Data: " + transacao.getData() + "\n";
            dados += "Valor: " + transacao.getValor() + "\n";
            dados += "Info: " + transacao.getInfo() + "\n";

            System.out.println(dados);
        }
    }

    public static double calcularSomatorioTransacoes() {
        double somatorio = 0;
        for (Transacao transacao : transacoes) {
            somatorio += transacao.getValor();
        }
        return somatorio;
    }

    public static double calcularSomatorioTransacoesCartao(int idCartao) {
        double somatorio = 0;
        for (Transacao transacao : transacoes) {
            if (transacao instanceof TransacaoCartao) {
                if (((TransacaoCartao) transacao).getIdCartao() == idCartao) {
                    somatorio += transacao.getValor();
                }
            }
        }
        return somatorio;
    }

    public static void atualizarTransacao(int idTransacao, double novoValor, TipoTransacao tipo, LocalDate novaData) {
        System.out.println("Atualizando receita com ID " + idTransacao + "...");
        for (Transacao transacao : transacoes) {
            if (transacao.getIdTransacao() == idTransacao) {
                transacao.setValor(novoValor);
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
        System.out.println("Excluindo Transação com ID " + idTransacao+ "...");
        transacoes.removeIf(transacao -> transacao.getIdTransacao() == idTransacao);
        System.out.println("Transação excluída com sucesso!");
    }
}
