import Models.*;

public class Fintech {
    public static void main(String[] args) {

        testarUsuario();
        testarTransacao();
        testarCategoriaTransacao();
        testarDespesa();
        testarReceita();
        testarRelatorio();
    }


    public static void testarUsuario() {
        Usuario.testarUsuario();
    }

    public static void testarTransacao() {
        Transacao.testarTransacao();
    }

    public static void testarCategoriaTransacao() {
        CategoriaTransacao.testarCategoriaTransacao();
    }

    public static void testarDespesa() {
        Despesa.testarDespesa();
    }

    public static void testarReceita() {
        Receita.testarReceita();
    }

    public static void testarRelatorio() {
        Relatorio.testarRelatorio();
    }
}
