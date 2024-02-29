package Repository;

import Models.Despesa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class despesaRepository {
    public static List<Despesa> despesas = new ArrayList<>();

    public static void cadastrarDespesa(double valor, String info, long idUsuario, String data) {
        Despesa despesa = new Despesa(valor, info, idUsuario, data);
        despesas.add(despesa);
    }

    public static void visualizarDespesa(List<Despesa> despesas) {
        System.out.println("------ Lista de Despesas ------");
        for (Despesa despesa : despesas) {
            System.out.println("Despesa " + despesa.getIdDespesa() + ":");
            System.out.println("Valor: " + despesa.getValor());
            System.out.println("Descrição: " + despesa.getInfo());
            System.out.println("Data: " + despesa.getData());
            System.out.println("ID do Usuário: " + despesa.getIdUsuario());
            System.out.println();
        }
    }

    public static void atualizarDespesa(int idDespesa, double novoValor, String novaDescricao, String novaData) {
        Scanner scanner = new Scanner(System.in);

        visualizarDespesa(despesas);

        System.out.println("Atualizando despesa com ID " + idDespesa + "...");
        for (Despesa despesa : despesas) {
            if (despesa.getIdDespesa() == idDespesa) {
                despesa.setValor(novoValor);
                despesa.setInfo(novaDescricao);
                despesa.setData(novaData);
                System.out.println("Despesa atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Despesa com ID " + idDespesa + " não encontrada. Nenhuma atualização realizada.");
    }

    public static void excluirDespesa(int idDespesa) {
        Scanner scanner = new Scanner(System.in);

        visualizarDespesa(despesas);

        System.out.println("Excluindo despesa com ID " + idDespesa + "...");
        despesas.removeIf(despesa -> despesa.getIdDespesa() == idDespesa);
        System.out.println("Despesa excluída com sucesso!");
    }
}
