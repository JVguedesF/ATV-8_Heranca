package Repository;

import Models.Cartao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
public class CartaoRepository {
    public static List<Cartao> cartoes = new ArrayList<>();

    public static void cadastrarCartao(String numeroCartao, String bandeiraCartao, String vencimentoCartao) {
        Cartao novoCartao = new Cartao(numeroCartao, bandeiraCartao, vencimentoCartao);
        cartoes.add(novoCartao);
    }


    public static void visualizarCartao() {
        System.out.println("------ Lista de Cartões ------");
        for (Cartao cartao : cartoes) {
            System.out.println("Cartão " + cartao.getIdCartao() + ":");
            System.out.println("Número do Cartão: " + cartao.getNumeroCartao());
            System.out.println("Bandeira do Cartão: " + cartao.getBandeiraCartao());
            System.out.println("Vencimento do Cartão: " + cartao.getVencimentoCartao());
            System.out.println();
        }
    }


    public static void atualizarCartao(int idCartao, String numeroCartao, String bandeiraCartao, String vencimentoCartao) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Atualizando cartão com ID " + idCartao + "...");
        for (Cartao cartao : cartoes) {
            if (cartao.getIdCartao() == idCartao) {
                cartao.setNumeroCartao(numeroCartao);
                cartao.setBandeiraCartao(bandeiraCartao);
                cartao.setVencimentoCartao(vencimentoCartao);
                System.out.println("Cartão atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Cartão com ID " + idCartao + " não encontrado. Nenhuma atualização realizada.");
    }


    public static void deletarCartao(int idCartao) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Excluindo cartão com ID " + idCartao + "...");
        cartoes.removeIf(cartao -> cartao.getIdCartao() == idCartao);
        System.out.println("Cartão excluído com sucesso!");
    }
}
*/