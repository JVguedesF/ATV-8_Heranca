package Models;

public class Receita {
    private int idReceita;
    private float valor;
    private String descricao;
    private int idUsuario;

    public Receita(int idReceita, float valor, String descricao, int idUsuario) {
        this.idReceita = idReceita;
        this.valor = valor;
        this.descricao = descricao;
        this.idUsuario = idUsuario;
    }

    public int getIdReceita() {
        return idReceita;
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

    // Métodos de teste
    public static void main(String[] args) {
        testarReceita();
    }

    public static void testarReceita() {
        Receita receita = new Receita(1, 500.0f, "Salário", 1);

        // Exibir informações da receita
        System.out.println("Informações da Receita:");
        System.out.println("ID: " + receita.getIdReceita());
        System.out.println("Valor: " + receita.getValor());
        System.out.println("Descrição: " + receita.getDescricao());
        System.out.println("ID do Usuário: " + receita.getIdUsuario());
    }
}
