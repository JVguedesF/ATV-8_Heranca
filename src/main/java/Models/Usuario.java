package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public String getNmUser() {
        return nmUser;
    }

    public String getNroSenha() {
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

    public int getCpf() {
        return cpf;
    }


    public static Usuario getUsuariobyID(long idUser) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUser() == idUser) {
                return usuario;
            }
        }
        return null;
    }

    public static List<Usuario> usuarios = new ArrayList<>();

    public static void cadastrarUser(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void visualizarUsuario(List<Usuario> usuarios){
        System.out.println("------ Informação de Perfil ------");
        for (Usuario usuario : usuarios){
            System.out.println("ID: " + usuario.getIdUser());
            System.out.println("Nome: " + usuario.getNmUser());
            System.out.println("Cpf: " + usuario.getCpf());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Senha: " + usuario.getNroSenha());
            System.out.println("Telefone: " + usuario.getNroFone());
            System.out.println();
        }

    }

    public static void atualizarUsuario(long idUser, String novoNroSenha, int novoNroFone, String novoEmail, float novoSaldo, double novaMetaInvestimento, int novoCpf) {

        visualizarUsuario(usuarios);

        Scanner scanner = new Scanner(System.in);
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUser() == idUser) {
                usuario.nroSenha = novoNroSenha;
                usuario.nroFone = novoNroFone;
                usuario.email = novoEmail;
                usuario.saldo = novoSaldo;
                usuario.cpf = novoCpf;
                System.out.println();
                System.out.println("Usuario atualizado com sucesso!");
                System.out.println();
                return;
            }
        }
    }

    public static void deletarUsuario(long idUser) {
        Scanner scanner = new Scanner(System.in);
        usuarios.removeIf(usuario -> usuario.getIdUser() == idUser);
        System.out.println("Usuario excluido!");
    }

    public static void visualizarNomeESaldo() {
        System.out.println("---------Seu saldo:---------");
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNmUser());
            System.out.println("Saldo: " + usuario.getSaldo());
            System.out.println();
        }
    }


}
