package Models;

public class Relatorio {
    private int idRelatorio;
    private String titulo;
    private String descricao;

    public Relatorio(int idRelatorio, String titulo, String descricao) {
        this.idRelatorio = idRelatorio;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getIdRelatorio() {
        return idRelatorio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static void main(String[] args) {
        testarRelatorio();
    }

    public static void testarRelatorio() {
        Relatorio relatorio = new Relatorio(1, "Relatório Mensal", "Relatório de despesas do mês de janeiro");


        System.out.println("Informações do Relatório:");
        System.out.println("ID: " + relatorio.getIdRelatorio());
        System.out.println("Título: " + relatorio.getTitulo());
        System.out.println("Descrição: " + relatorio.getDescricao());
    }
}
