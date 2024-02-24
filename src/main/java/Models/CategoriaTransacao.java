package Models;

public class CategoriaTransacao {
    private int idCategoria;
    private String nomeCategoria;

    public CategoriaTransacao(String nomeCategoria, int idCategoria) {
        this.nomeCategoria = nomeCategoria;
        this.idCategoria = idCategoria;
    }



    public void visualizarCategoriaTransacao() {
        System.out.println("ID da Categoria: " + idCategoria);
        System.out.println("Nome da Categoria: " + nomeCategoria);
    }
}
