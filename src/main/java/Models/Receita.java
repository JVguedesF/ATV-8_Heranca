package Models;

public class Receita extends Transacao {
    private static int idCounter = 1;
    private int idReceita;

    private Usuario usuario;

    public Receita(float valor, String descricao, long idUsuario, String data) {
        super(idCounter++, valor, descricao, idUsuario, data);
        this.idReceita = idCounter;
        this.usuario = Usuario.getUsuariobyID(idUsuario);
    }

    public int getIdReceita() {
        return idReceita;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public static void testarReceita() {
        Receita receita = new Receita(500.0f, "Salário", 1, "08/08/2024");

        System.out.println("------Informações da Receita------");
        System.out.println("ID da Receita: " + receita.getIdReceita());
        System.out.println("Valor: " + receita.getValor());
        System.out.println("Descrição: " + receita.getDescricao());
        System.out.println("Data: " + receita.getData());
        System.out.println("ID do Usuário: " + receita.getIdUsuario());
        System.out.println("Nome do Usuário: " + receita.getUsuario().getNmUser());
        System.out.println();
    }
}
