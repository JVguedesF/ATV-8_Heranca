package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Receita extends Transacao {
    private static int idCounter = 1;
    private int idReceita;
    private Usuario usuario;

    public Receita(double valor, String info, long idUsuario, String data) {
        super(idCounter++, valor, info, idUsuario, data);
        this.idReceita = idCounter;
        this.usuario = Usuario.getUsuariobyID(idUsuario);
    }

    public int getIdReceita() {
        return idReceita;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public static List<Receita> receitas = new ArrayList<>();

    public static void cadastrarReceita(double valor, String info, long idUsuario, String data) {
        Receita receita = new Receita(valor, info, idUsuario, data);
        receitas.add(receita);
    }

    public static void visualizarReceita(List<Receita> receitas) {
        System.out.println("------ Lista de Receitas ------");
        for (Receita receita : receitas) {
            System.out.println("Receita " + receita.getIdReceita() + ":");
            System.out.println("Valor: " + receita.getValor());
            System.out.println("Descrição: " + receita.getInfo());
            System.out.println("Data: " + receita.getData());
            System.out.println();
        }
    }

    public static void atualizarReceita(int idReceita, double novoValor, String novaDescricao, String novaData) {

        visualizarReceita(receitas);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Atualizando receita com ID " + idReceita + "...");
        for (Receita receita : receitas) {
            if (receita.getIdReceita() == idReceita) {
                receita.setValor(novoValor);
                receita.setInfo(novaDescricao);
                receita.setData(novaData);
                System.out.println();
                System.out.println("Receita atualizada com sucesso!");
                System.out.println();
                return;
            }
        }
        System.out.println("Receita com ID " + idReceita + " não encontrada. Nenhuma atualização realizada.");
    }

    public static void excluirReceita(int idReceita) {
        visualizarReceita(receitas);

        Scanner scanner = new Scanner(System.in);


        System.out.println("Excluindo receita com ID " + idReceita + "...");
        receitas.removeIf(receita -> receita.getIdReceita() == idReceita);
        System.out.println("Receita excluída com sucesso!");
    }
}
