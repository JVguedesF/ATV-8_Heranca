package Repository;

import Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvestimentoRepository {
    public static List<Investimento> investimentos = new ArrayList<>();

    public static void cadastrarInvest(double valor, String data, String tipo, Usuario usuario) {
        Investimento investimento = new Investimento(usuario, 0.0, data, tipo, valor);
        investimentos.add(investimento);
    }


    public static void visualizarInvest(List<Investimento> investimentos) {
        System.out.println("------ Lista de Investimentos ------");
        for (Investimento investimento : investimentos) {
            System.out.println("Investimento " + investimento.getIdInvestimento() + ":");
            System.out.println("Total do Investimento: " + investimento.getTotalInvestimento());
            System.out.println("Data: " + investimento.getData());
            System.out.println("Tipo: " + investimento.getTipo());
            System.out.println("Valor: " + investimento.getValor());
            System.out.println();
        }
    }

    public static void atualizarInvestimento(int idInvestimento, double novoTotalInvestimento, String novaData, String novoTipo, double novoValor) {
        Scanner scanner = new Scanner(System.in);

        visualizarInvest(investimentos);

        System.out.println("Atualizando investimento com ID " + idInvestimento + "...");
        for (Investimento investimento : investimentos) {
            if (investimento.getIdInvestimento() == idInvestimento) {
                investimento.setTotalInvestimento(novoTotalInvestimento);
                investimento.setData(novaData);
                investimento.setTipo(novoTipo);
                investimento.setValor(novoValor);
                System.out.println("Investimento atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Investimento com ID " + idInvestimento + " não encontrado. Nenhuma atualização realizada.");
    }

    public static void deletarInvestimento(int idInvestimento) {
        Scanner scanner = new Scanner(System.in);

        visualizarInvest(investimentos);

        System.out.println("Excluindo investimento com ID " + idInvestimento + "...");
        investimentos.removeIf(investimento -> investimento.getIdInvestimento() == idInvestimento);
        System.out.println("Investimento excluído com sucesso!");
    }

    public static double somarInvestimentos() {
        double totalInvestido = 0;
        for (Investimento investimento : investimentos) {
            totalInvestido += investimento.getValor();
        }
        return totalInvestido;
    }

}
