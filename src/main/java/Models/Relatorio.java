package Models;

public class Relatorio extends Transacao {
    private String titulo;
    private String descricao;

    public Relatorio(int idTransacao, float valor, String descricao, int idUsuario, String titulo, String descricaoRelatorio) {
        super(idTransacao, valor, descricao, idUsuario);
        this.titulo = titulo;
        this.descricao = descricaoRelatorio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricaoRelatorio() {
        return descricao;
    }

    public void setDescricaoRelatorio(String descricaoRelatorio) {
        this.descricao = descricaoRelatorio;
    }

    public static void main(String[] args) {
        testarRelatorio();
    }

    public static void testarRelatorio() {
        Relatorio relatorio = new Relatorio(1, 100.0f, "Descrição da transação", 1, "Relatório Mensal", "Relatório de despesas do mês de janeiro");

        System.out.println("------Informações do Relatório------");
        System.out.println("ID da Transação: " + relatorio.getIdTransacao());
        System.out.println("Valor: " + relatorio.getValor());
        System.out.println("Descrição: " + relatorio.getDescricao());
        System.out.println("ID do Usuário: " + relatorio.getIdUsuario());
        System.out.println("Título: " + relatorio.getTitulo());
        System.out.println("Descrição do Relatório: " + relatorio.getDescricaoRelatorio());
        System.out.println();
    }
}
