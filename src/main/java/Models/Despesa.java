package Models;

public class Despesa extends Transacao {
    public int nmDespesa;

    public Despesa(int nmDespesa, short idTransacao, int dtTransacao, int valorTransacao, int nmCategoria) {
        super(idTransacao, dtTransacao, valorTransacao, nmCategoria);
        this.nmDespesa = nmDespesa;
    }



    public void visualizarDespesa() {
        System.out.println("ID da Transação: " + getIdTransacao());
        System.out.println("Data da Transação: " + getDtTransacao());
        System.out.println("Valor da Transação: " + getValorTransacao());
        System.out.println("Nome da Categoria: " + getNmCategoria());
        System.out.println("Nome da Despesa: " + nmDespesa);
    }
}
