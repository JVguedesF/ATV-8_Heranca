import Models.*;
import Repositorio.*;
import Enum.*;

import java.time.LocalDate;

public class Fintech {
    public static void main(String[] args) {
        Transacao t1 = new Transacao(1, TipoTransacao.SAIDA, LocalDate.of(2024, 03, 11), 50.0 );
        Transacao t2 = new Transacao(1, TipoTransacao.ENTRADA, LocalDate.of(2024, 03, 11), 100 );

        TransacaoCartao tc1 = new TransacaoCartao(1, 1,TipoTransacao.SAIDA, LocalDate.of(2024, 03, 11), 100, LocalDate.of(2024, 04, 11));
        TransacaoCartao tc2 = new TransacaoCartao(1, 1, TipoTransacao.SAIDA, LocalDate.of(2024, 03, 11), 100, LocalDate.of(2024, 04, 11));
        TransacaoCartao tc3 = new TransacaoCartao(1, 2, TipoTransacao.SAIDA, LocalDate.of(2024, 03, 11), 100, LocalDate.of(2024, 04, 11));

        TransacaoRepositorio.adicionarTransacao(t1);
        TransacaoRepositorio.adicionarTransacao(t2);
        TransacaoRepositorio.adicionarTransacao(tc1);
        TransacaoRepositorio.adicionarTransacao(tc2);
        TransacaoRepositorio.adicionarTransacao(tc3);

        TransacaoRepositorio.visualizarTransacoes();
        TransacaoRepositorio.atualizarTransacao(3, 99, TipoTransacao.SAIDA, LocalDate.of(2025, 05, 11));
        System.out.println("-----");
        TransacaoRepositorio.visualizarTransacoes();
    }
}