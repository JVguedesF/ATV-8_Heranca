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

}
