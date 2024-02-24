package Models;

public class Receita extends Transacao {
    private int nmReceita;

    public Receita(int nmReceita, short idTransacao, int dtTransacao, int valorTransacao, int nmCategoria) {
        super(idTransacao, dtTransacao, valorTransacao, nmCategoria);
        this.nmReceita = nmReceita;
    }

    // put receita: nao sei :(

    public void visualizarReceita() {
        System.out.println("ID da Transação: " + getIdTransacao());
        System.out.println("Data da Transação: " + getDtTransacao());
        System.out.println("Valor da Transação: " + getValorTransacao());
        System.out.println("Nome da Categoria: " + getNmCategoria());
        System.out.println("Nome da Receita: " + nmReceita);
    }

}

