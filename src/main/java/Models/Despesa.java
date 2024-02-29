package Models;

import java.util.ArrayList;
import java.util.List;

public class Despesa extends Transacao {
    private static int idCounter = 1;
    private int idDespesa;

    public Despesa(double valor, String info, long idUsuario, String data) {
        super(idCounter++, valor, info, idUsuario, data);
        this.idDespesa = idCounter;
    }

    public int getIdDespesa() {
        return idDespesa;
    }

    public static List<Despesa> despesas = new ArrayList<>();

    public static void cadastrarDespesa(double valor, String info, long idUsuario, String data) {
        Despesa despesa = new Despesa(valor, info, idUsuario, data);
        despesas.add(despesa);
    }

    public static void atualizarDespesa(int idDespesa, double novoValor, String novaDescricao, String novaData) {
        for (Despesa despesa : despesas) {
            if (despesa.getIdDespesa() == idDespesa) {
                despesa.setValor(novoValor);
                despesa.setInfo(novaDescricao);
                despesa.setData(novaData);
                return;
            }
        }
    }

    public static void excluirDespesa(int idDespesa) {
        despesas.removeIf(despesa -> despesa.getIdDespesa() == idDespesa);
    }

    public static void testarDespesa() {
        cadastrarDespesa(200.0d, "Compras de supermercado", 2, "08/08/2024");

        System.out.println("------Informações da Despesa------");
        for (Despesa despesa : despesas) {
            System.out.println("ID da Despesa: " + despesa.getIdDespesa());
            System.out.println("Valor: " + despesa.getValor());
            System.out.println("Descrição: " + despesa.getInfo());
            System.out.println("Data: " + despesa.getData());
            System.out.println("ID do Usuário: " + despesa.getIdUsuario());
            System.out.println();
        }
    }
}
