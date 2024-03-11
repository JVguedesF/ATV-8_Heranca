package Models;

import Enum.TipoTransacao;

import java.time.LocalDate;

public class TransacaoCartao extends Transacao {
    private LocalDate vencimento;
    private int  idCartao;

    public TransacaoCartao(int idUsuario, int idCartao,TipoTransacao tipo, LocalDate data, double valor, LocalDate vencimento) {
        super(idUsuario, tipo, data, valor);
        this.vencimento = vencimento;
        this.idCartao = idCartao;
    }

    public int getIdCartao() {
        return idCartao;
    }

    public TransacaoCartao(int idUsuario, int idCartao, TipoTransacao tipo, LocalDate data, double valor, String info, LocalDate vencimento) {
        super(idUsuario, tipo, data, valor, info);
        this.vencimento = vencimento;
        this.idCartao = idCartao;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    @Override
    public String gerarComprovante() {
        String operacao = (tipo == TipoTransacao.ENTRADA) ? "+" : "-";

        String comprovante = "Transação Cartão nº:" + idTransacao + "\t\t Usuário nº: " + idUsuario + "\n";
        comprovante += "Data: " + data + "\t\t" + "Tipo: " + tipo + "\n";
        comprovante += "Valor: " + operacao + "R$" + valor + "\n";
        comprovante += "Vencimento: " + vencimento + "\n";
        comprovante += "Descrição: " + info + "\n";

        return comprovante;
    }

    public void extornarCompra() {
        super.tipo = TipoTransacao.ENTRADA;
    }
}
