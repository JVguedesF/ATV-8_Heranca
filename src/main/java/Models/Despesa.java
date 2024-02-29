package Models;

public class Despesa extends Transacao {
    private static int idCounter = 1;
    private int idDespesa;

    public Despesa(double valor, String info, long idUsuario, String data) {
        super(idCounter++, valor, info, idUsuario, data);
        this.idDespesa = idCounter;
    }

    public int getIdDespesa() {
        return idDespesa;
    }

}
