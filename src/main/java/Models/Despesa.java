package Models;

public class Despesa {
    private int idDespesa;
    private float valor;
    private String descricao;
    private int idUsuario;

    public Despesa(int idDespesa, float valor, String descricao, int idUsuario) {
        this.idDespesa = idDespesa;
        this.valor = valor;
        this.descricao = descricao;
        this.idUsuario = idUsuario;
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

    public static void main(String[] args) {
        testarDespesa();
    }

    public static void testarDespesa() {
        Despesa despesa = new Despesa(1, 50.0f, "Compras de supermercado", 1);

        System.out.println("Informações da Despesa:");
        System.out.println("ID: " + despesa.getIdDespesa());
        System.out.println("Valor: " + despesa.getValor());
        System.out.println("Descrição: " + despesa.getDescricao());
        System.out.println("ID do Usuário: " + despesa.getIdUsuario());
    }
}
