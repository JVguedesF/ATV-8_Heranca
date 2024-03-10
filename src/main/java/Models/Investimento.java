package Models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Investimento {
    private static int idCounter = 0;
    private int idInvestimento;
    private double totalInvestimento;
    private String tipo;
    private double metaInvestimento;
    private LocalDate dataResgate;
    private double taxaMensal;

    public Investimento(double totalInvestimento, String tipo, double metaInvestimento, LocalDate dataResgate, double mediaJurosMensal) {
        this.idInvestimento = idCounter++;
        this.totalInvestimento = totalInvestimento;
        this.tipo = tipo;
        this.metaInvestimento = metaInvestimento;
        this.dataResgate = dataResgate;
        this.taxaMensal = mediaJurosMensal;
    }

    public int getIdInvestimento() {
        return idInvestimento;
    }

    public double getTotalInvestimento() {
        return totalInvestimento;
    }

    public void setTotalInvestimento(double totalInvestimento) {
        this.totalInvestimento = totalInvestimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMetaInvestimento() {
        return metaInvestimento;
    }

    public void setMetaInvestimento(double metaInvestimento) {
        this.metaInvestimento = metaInvestimento;
    }

    public LocalDate getMetaData() {
        return dataResgate;
    }

    public void setMetaData(LocalDate metaData) {
        this.dataResgate = metaData;
    }

    public double getMediaJurosMensal() {
        return taxaMensal;
    }

    public void setMediaJurosMensal(double mediaJurosMensal) {
        this.taxaMensal = mediaJurosMensal;
    }

    public double calcAporteMensal() {
        long periodoEmMeses = mesesEntreHojeEMetaData();
        return (metaInvestimento - totalInvestimento) * taxaMensal / (Math.pow(1 + taxaMensal, periodoEmMeses) - 1);
    }

    private long mesesEntreHojeEMetaData(){
        LocalDate dataAtual = LocalDate.now();
        long diferencaMeses = ChronoUnit.MONTHS.between(dataAtual, dataResgate);
        return diferencaMeses;
    }
}
