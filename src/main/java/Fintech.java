import Models.*;

public class Fintech {
    public static void main(String[] args) {

        testarUsuario();
        testarTransacao();
        testarDespesa();
        testarReceita();
    }

    public static void testarUsuario() {
        Usuario.testarUsuario();
    }
    public static void testarTransacao() {
        Transacao.testarTransacao();
    }
    public static void testarDespesa() {
        Despesa.testarDespesa();
    }
    public static void testarReceita() {
        Receita.testarReceita();
    }
}