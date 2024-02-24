package Models;

public class Relatorio {
    private int idRelatorio;
    private int dataInicioRelatorio;
    private int dataFimRelatorio;
    private int transacoes;

    public Relatorio(int idRelatorio, int dataInicioRelatorio, int dataFimRelatorio, int transacoes) {
        this.idRelatorio = idRelatorio;
        this.dataInicioRelatorio = dataInicioRelatorio;
        this.dataFimRelatorio = dataFimRelatorio;
        this.transacoes = transacoes;
    }

    public void visualizarRelatorio() {
        System.out.println("Visualizando Relatório:");
        System.out.println("ID do Relatório: " + idRelatorio);
        System.out.println("Data de Início do Relatório: " + dataInicioRelatorio);
        System.out.println("Data de Fim do Relatório: " + dataFimRelatorio);
        System.out.println("Número de Transações: " + transacoes);
    }
}
