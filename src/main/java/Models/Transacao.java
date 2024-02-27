package Models;

public class Transacao {
    private static int idCounter = 1;
    private int idTransacao;
    private float valor;
    private String descricao;
    private long idUsuario;
    private String data;

    public Transacao(int idTransacao, float valor, String descricao, long idUsuario, String data) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.descricao = descricao;
        this.idUsuario = idUsuario;
        this.data = data;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public String getData() {
        return data;
    }

    public static void main(String[] args) {
        testarTransacao();
    }

    public static void testarTransacao() {
        Transacao transacao = new Transacao(1, 100.0f, "Compra de alimentos", 1, "25/02/2024");

        System.out.println("------Informações da Transação------");
        System.out.println("ID da Transação: " + transacao.getIdTransacao());
        System.out.println("ID do Usuário: " + transacao.getIdUsuario());
        System.out.println("Valor: " + transacao.getValor());
        System.out.println("Descrição: " + transacao.getDescricao());
        System.out.println("Data: " + transacao.getData());
        System.out.println();
    }
}
