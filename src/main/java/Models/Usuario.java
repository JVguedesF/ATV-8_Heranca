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

    public float visualizarSaldo(){
        return saldo;
    }
}