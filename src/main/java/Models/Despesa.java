package Models;

public class Despesa {
    private static int idDespesa;
    private static float valor;
    private static String descricao;
    private static int idUsuario;
    private static String data;

    public Despesa(int idDespesa, float valor, String descricao, int idUsuario) {
        this.idDespesa = idDespesa;
        this.valor = valor;
        this.descricao = descricao;
        this.idUsuario = idUsuario;
        this.data = data;
    }

    public int getIdDespesa() {
        return idDespesa;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getData() {
        return data;
    }

    public static void main(String[] args) {
        testarDespesa();
    }

    public static void testarDespesa() {
        Despesa despesa = new Despesa(1, 50.0f, "Compras de supermercado", 1);

        System.out.println("------Informações da Despesa------");
        System.out.println("ID da Despesa: " + idDespesa);
        System.out.println("Valor: " + valor);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data: " + data);
        System.out.println("ID do Usuário: " + idUsuario);
        System.out.println();
    }
}
