package Models;

import Enum.TipoTransacao;

import java.time.LocalDate;

public class TransacaoCartao extends Transacao {
    private LocalDate vencimento;

    public TransacaoCartao(int idUsuario, TipoTransacao tipo, LocalDate data, double valor, LocalDate vencimento) {
        super(idUsuario, tipo, data, valor);
        this.vencimento = vencimento;
    }

    public TransacaoCartao(int idUsuario, TipoTransacao tipo, LocalDate data, double valor, String info, LocalDate vencimento) {
        super(idUsuario, tipo, data, valor, info);
        this.vencimento = vencimento;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public void extornarCompra() {
        super.tipo = TipoTransacao.ENTRADA;
    }
}
