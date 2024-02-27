package Models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private static long idCounter = 1;
    private long idUser;
    private String nmUser;
    private short nroSenha;
    private int nroFone;
    private String email;
    private float saldo;

    public Usuario(String nmUser, short nroSenha, int nroFone, String email, float saldo) {
        this.idUser = idCounter++;
        this.nmUser = nmUser;
        this.nroSenha = nroSenha;
        this.nroFone = nroFone;
        this.email = email;
        this.saldo = saldo;
    }

    public static Usuario getUsuariobyID(long idUser) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUser() == idUser) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario(String nmUser) {
    }

    public long getIdUser() {
        return idUser;
    }

    public String getNmUser() {
        return nmUser;
    }

    public short getNroSenha() {
        return nroSenha;
    }

    public int getNroFone() {
        return nroFone;
    }

    public String getEmail() {
        return email;
    }

    public float getSaldo() {
        return saldo;
    }

    public static List<Usuario> usuarios = new ArrayList<>();

    public static void cadastrarUser(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void testarUsuario() {
        cadastrarUser(new Usuario("Rafael", (short) 1234, 759511865, "rafael@email.com", 100000.00f));
        cadastrarUser(new Usuario("Maria", (short) 4321, 987654321, "maria@email.com", 200000.00f));
        cadastrarUser(new Usuario("João", (short) 5678, 123456789, "joao@email.com", 50000.00f));

        System.out.println("------Informações dos Usuários------");
        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getIdUser());
            System.out.println("Nome: " + usuario.getNmUser());
            System.out.println("Senha: " + usuario.getNroSenha());
            System.out.println("Telefone: " + usuario.getNroFone());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Saldo: " + usuario.getSaldo());
            System.out.println();
        }
    }
}
