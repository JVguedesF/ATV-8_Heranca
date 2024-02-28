package Models;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private int idCartao;
    private int numeroCartao;
    private String bandeiraCartao;
    private String vencimentoCartao;

    public Cartao(int idCartao, int numeroCartao, String bandeiraCartao, String vencimentoCartao) {
        this.idCartao = idCartao;
        this.numeroCartao = numeroCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.vencimentoCartao = vencimentoCartao;
    }

    public int getIdCartao() {
        return idCartao;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public String getVencimentoCartao() {
        return vencimentoCartao;
    }

    public static List<Cartao> cartoes = new ArrayList<>();

    public static void cadastrarCartao(Cartao cartao){
        cartoes.add(cartao);
    }

    public static void atualizarCartao(int idCartao, int numeroCartao, String bandeiraCartao, String vencimentoCartao){
        for (Cartao cartao: cartoes){
            if (cartao.getIdCartao() == idCartao){
                cartao.numeroCartao = numeroCartao;
                cartao.bandeiraCartao = bandeiraCartao;
                cartao.vencimentoCartao = vencimentoCartao;
                return;
            }
        }
    }

    public static void deletrarCartao(int idCartao){
        cartoes.removeIf(cartao -> cartao.getIdCartao() == idCartao);
    }
}
