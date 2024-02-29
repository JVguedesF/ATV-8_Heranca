package Repository;

import Models.Investimento;

import java.util.ArrayList;
import java.util.List;

public class InvetimentoRepository {
    public static List<Investimento> investimentos = new ArrayList<>();

    public static void cadastrarInvest(Investimento investimento){
        investimentos.add(investimento);
    }


    public static void visualizarInvet(List<Investimento> investimentos){
        for (Investimento investimento : investimentos){
            System.out.println("Investimento " + investimento.getIdInvestimento() + ":");
            System.out.println("Total do Investimento: " + investimento.getTotalInvestimento());
            System.out.println("Data: " + investimento.getData());
            System.out.println("Tipo: " + investimento.getTipo());
            System.out.println("Valor: " + investimento.getValor());
        }
    }

    public static void atualizarInvestimento(int idInvestimento, double novoTotalInvestimento, String novaData, String novoTipo, double novoValor) {
        for (Investimento investimento : investimentos) {
            if (investimento.getIdInvestimento() == idInvestimento) {
                investimento.setTotalInvestimento(novoTotalInvestimento);
                investimento.setData(novaData);
                investimento.setTipo(novoTipo);;
                investimento.setValor(novoValor);
                return;
            }
        }
    }

    public static void deletarInvestimento(int idInvestimento) {
        investimentos.removeIf(investimento -> investimento.getIdInvestimento() == idInvestimento);
    }

}
