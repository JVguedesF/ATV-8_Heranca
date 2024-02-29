package Models;

public class Usuario {
    private static long idCounter = 1;
    private long idUser;
    private String nmUser;
    private String nroSenha;
    private int nroFone;
    private String email;
    private float saldo;
    private int cpf;


    public Usuario(String nmUser, String nroSenha, int nroFone, String email, float saldo, int cpf) {
        this.cpf = cpf;
        this.idUser = idCounter++;
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

    public String getNroSenha() {
        return nroSenha;
    }

    public void setNroSenha(String nroSenha) {
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public static void setIdCounter(long idCounter) {
        Usuario.idCounter = idCounter;
    }
















}
