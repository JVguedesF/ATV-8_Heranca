package Models;

public class Usuario {
    private long idUser;
    private String nmUser;
    private short nroSenha;
    private int nroFone;
    private String email;
    private float saldo;


    public Usuario(long idUser, String nmUser, short nroSenha, int nroFone, String email, float saldo) {
        this.idUser = idUser;
        this.nmUser = nmUser;
        this.nroSenha = nroSenha;
        this.nroFone = nroFone;
        this.email = email;
        this.saldo = saldo;
    }


    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getNmUser() {
        return nmUser;
    }

    public void setNmUser(String nmUser) {
        this.nmUser = nmUser;
    }

    public short getNroSenha() {
        return nroSenha;
    }

    public void setNroSenha(short nroSenha) {
        this.nroSenha = nroSenha;
    }

    public int getNroFone() {
        return nroFone;
    }

    public void setNroFone(int nroFone) {
        this.nroFone = nroFone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public static void main(String[] args) {
        testarUsuario();
    }

    public static void testarUsuario() {
        Usuario usuario = new Usuario(1, "João", (short)1234, 12345678, "joao@example.com", 100.0f);


        System.out.println("Informações do Usuário:");
        System.out.println("ID: " + usuario.getIdUser());
        System.out.println("Nome: " + usuario.getNmUser());
        System.out.println("Senha: " + usuario.getNroSenha());
        System.out.println("Telefone: " + usuario.getNroFone());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Saldo: " + usuario.getSaldo());
    }
}
