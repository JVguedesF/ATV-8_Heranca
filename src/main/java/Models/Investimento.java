package Models;

import java.util.ArrayList;
import java.util.List;

public class Investimento {
    private int idInvestimento;
    private double totalInvestimento;
    private String data;
    private String tipo;
    private double Valor;

    public Investimento(int idInvestimento, double totalInvestimento, String data, String tipo, double valor){

        this.idInvestimento = idInvestimento;
        this.totalInvestimento = totalInvestimento;
        this.data = data;
        this.tipo = tipo;
        Valor = valor;
    }

    public int getIdInvestimento() {
        return idInvestimento;
    }

    public double getTotalInvestimento() {
        return totalInvestimento;
    }

    public String getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return Valor;
    }

    public static List<Investimento> investimentos = new ArrayList<>();

    public static void cadastrarInvest(Investimento investimento){
        investimentos.add(investimento);
    }

    public static void atualizarInvestimento(int idInvestimento, double novoTotalInvestimento, String novaData, String novoTipo, double novoValor) {
        for (Investimento investimento : investimentos) {
            if (investimento.getIdInvestimento() == idInvestimento) {
                investimento.totalInvestimento = novoTotalInvestimento;
                investimento.data = novaData;
                investimento.tipo = novoTipo;
                investimento.Valor = novoValor;
                return;
            }
        }
    }

    public static void deletarInvestimento(int idInvestimento) {
        investimentos.removeIf(investimento -> investimento.getIdInvestimento() == idInvestimento);
    }

    public static void testarInvestimento() {
        cadastrarInvest(new Investimento(1, 1000.00, "2024-02-28", "Ações", 500.00));
        cadastrarInvest(new Investimento(2, 2000.00, "2024-02-28", "Tesouro Direto", 1000.00));
        cadastrarInvest(new Investimento(3, 3000.00, "2024-02-28", "Fundo Imobiliário", 1500.00));

        System.out.println("------Informações dos Investimentos------");
        for (Investimento investimento : Investimento.investimentos) {
            System.out.println("ID: " + investimento.getIdInvestimento());
            System.out.println("Total do Investimento: " + investimento.getTotalInvestimento());
            System.out.println("Data: " + investimento.getData());
            System.out.println("Tipo: " + investimento.getTipo());
            System.out.println("Valor: " + investimento.getValor());
            System.out.println();
        }
    }


}
