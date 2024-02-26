package Models;

public class CategoriaTransacao {
    private static int idCategoria;
    private static String nome;

    public CategoriaTransacao(int idCategoria, String nome) {
        this.idCategoria = idCategoria;
        this.nome = nome;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNome() {
        return nome;
    }


    public static void main(String[] args) {
        testarCategoriaTransacao();
    }

    public static void testarCategoriaTransacao() {
        CategoriaTransacao categoria = new CategoriaTransacao(1, "Alimentação");


        System.out.println("------Informações da Categoria de Transação------");
        System.out.println("ID da Categoria: " + idCategoria);
        System.out.println("Nome: " + nome);
        System.out.println();
    }
}
