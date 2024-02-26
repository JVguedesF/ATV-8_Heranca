package Models;

public class Transacao {
    private static int idTransacao;
    private static float valor;
    private static String descricao;
    private static int idUsuario;


    public Transacao(int idTransacao, float valor, String descricao, int idUsuario) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.descricao = descricao;
        this.idUsuario = idUsuario;
    }


    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public static void main(String[] args) {
        testarTransacao();
    }

    public static void testarTransacao() {
        Transacao transacao = new Transacao(1, 100.0f, "Compra de alimentos", 1);

        System.out.println("------Informações da Transação------");
        System.out.println("ID da Transação: " + idTransacao);
        System.out.println("Valor: " + valor);
        System.out.println("Descrição: " + descricao);
        System.out.println("ID do Usuário: " + idUsuario);
        System.out.println();
    }
}
