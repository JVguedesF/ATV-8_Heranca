package Repository;

import Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReceitaRepository {
    public static List<Receita> receitas = new ArrayList<>();

    public static void cadastrarReceita(double valor, String info, Usuario usuario, String data) {
        Receita receita = new Receita(valor, info, usuario, data);
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

    public static void atualizarReceita(int idReceita, double novoValor, String novaDescricao, String novaData, Usuario usuario) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Atualizando receita com ID " + idReceita + "...");
        for (Receita receita : receitas) {
            if (receita.getIdReceita() == idReceita) {
                System.out.println("Receita encontrada. ID: " + receita.getIdReceita());
                System.out.println("Valor atual: " + receita.getValor());
                System.out.println("Descrição atual: " + receita.getInfo());
                System.out.println("Data atual: " + receita.getData());

                receita.setValor(novoValor);
                receita.setInfo(novaDescricao);
                receita.setData(novaData);

                System.out.println("Receita atualizada com sucesso!");
                System.out.println("Novo valor: " + receita.getValor());
                System.out.println("Nova descrição: " + receita.getInfo());
                System.out.println("Nova data: " + receita.getData());
                return;
            }
        }
        System.out.println("Receita com ID " + idReceita + " não encontrada. Nenhuma atualização realizada.");
    }

    public static void excluirReceita(int idReceita, Usuario usuario) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Excluindo receita com ID " + idReceita + "...");
        receitas.removeIf(receita -> receita.getIdReceita() == idReceita);
        System.out.println("Receita excluída com sucesso!");
    }

}
