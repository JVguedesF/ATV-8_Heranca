package Models;

public class Receita extends Transacao {
    private static int idCounter = 1;
    private int idReceita;
    private Usuario usuario;

    public Receita(double valor, String info, long idUsuario, String data) {
        super(idCounter++, valor, info, idUsuario, data);
        this.idReceita = idCounter;
    }

    public int getIdReceita() {
        return idReceita;
    }

    public Usuario getUsuario() {
        return usuario;
    }

}
