package Models;

public class Receita extends Transacao {

    private static int idCounter = 0;

    private int idReceita;
    private Usuario usuario;

    public Receita(double valor, String info, Usuario usuario, String data) {
        super(idCounter++, valor, info, usuario.getIdUser(), data);
        this.usuario = usuario;
        this.idReceita = idCounter;
    }

    public int getIdReceita() {
        return idReceita;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Receita.idCounter = idCounter;
    }
}
