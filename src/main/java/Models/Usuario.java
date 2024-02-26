package Models;

public class Usuario {
    private static long idUser;
    private static String nmUser;
    private static short nroSenha;
    private static int nroFone;
    private static String email;
    private static float saldo;


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


        System.out.println("------Informações do Usuário------");
        System.out.println("ID: " + idUser);
        System.out.println("Nome: " + nmUser);
        System.out.println("Senha: " + nroSenha);
        System.out.println("Telefone: " + nroFone);
        System.out.println("Email: " + email);
        System.out.println("Saldo: " + saldo);
        System.out.println();
    }
}
