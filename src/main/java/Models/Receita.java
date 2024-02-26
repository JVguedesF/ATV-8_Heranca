package Models;

public class Receita extends Transacao {
    private int nmReceita;

    public Receita(int nmReceita, short idTransacao, int dtTransacao, int valorTransacao, int nmCategoria) {
        super(idTransacao, dtTransacao, valorTransacao, nmCategoria);
        this.nmReceita = nmReceita;
    }


}

