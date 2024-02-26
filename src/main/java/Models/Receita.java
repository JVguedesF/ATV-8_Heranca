package Models;

public class Receita {
    private static int idReceita;
    private static float valor;
    private static String descricao;
    private static int idUsuario;
    private static String data;

    public Receita(int idReceita, float valor, String descricao, int idUsuario) {
        this.idReceita = idReceita;
        this.valor = valor;
        this.descricao = descricao;
        this.idUsuario = idUsuario;
        this.data= data;
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

    public String getData() {
        return data;
    }

    // Métodos de teste
    public static void main(String[] args) {
        testarReceita();
    }

    public static void testarReceita() {
        Receita receita = new Receita(1, 500.0f, "Salário", 1);


        System.out.println("------Informações da Receita------");
        System.out.println("ID da Receita: " + idReceita);
        System.out.println("Valor: " + valor);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data: " + data);
        System.out.println("ID do Usuário: " + idUsuario);
        System.out.println();
    }
}
