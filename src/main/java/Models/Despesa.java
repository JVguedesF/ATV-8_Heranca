package Models;

public class Despesa extends Transacao {
    public int nmDespesa;

    public Despesa(int nmDespesa, short idTransacao, int dtTransacao, int valorTransacao, int nmCategoria) {
        super(idTransacao, dtTransacao, valorTransacao, nmCategoria);
        this.nmDespesa = nmDespesa;
    }


}
