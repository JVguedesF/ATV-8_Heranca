package Models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private static long idCounter = 1;
    private long idUser;
    private String nmUser;
    private String nroSenha;
    private int nroFone;
    private String email;
    private float saldo;
    private double metaInvestimento;
    private int cpf;


    public Usuario(String nmUser, String nroSenha, int nroFone, String email, float saldo, double metaInvestimento, int cpf) {
        this.cpf = cpf;
        this.idUser = idCounter++;
        this.nmUser = nmUser;
        this.nroSenha = nroSenha;
        this.nroFone = nroFone;
        this.email = email;
        this.saldo = saldo;
        this.metaInvestimento = metaInvestimento;
    }

    public static Usuario getUsuariobyID(long idUser) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUser() == idUser) {
                return usuario;
            }
        }
        return null;
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

    public double getMetaInvestimento() {
        return metaInvestimento;
    }

    public int getCpf() {
        return cpf;
    }

    public static List<Usuario> usuarios = new ArrayList<>();

    public static void cadastrarUser(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void atualizarUsuario(long idUser, String novoNroSenha, int novoNroFone, String novoEmail, float novoSaldo, double novaMetaInvestimento, int novoCpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUser() == idUser) {
                usuario.nroSenha = novoNroSenha;
                usuario.nroFone = novoNroFone;
                usuario.email = novoEmail;
                usuario.saldo = novoSaldo;
                usuario.metaInvestimento = novaMetaInvestimento;
                usuario.cpf = novoCpf;
                return;
            }
        }
    }

    public static void deletarUsuario(long idUser) {
        usuarios.removeIf(usuario -> usuario.getIdUser() == idUser);
    }

    public static void visualizarNomeESaldo() {
        System.out.println("------Nome do Usuário e Saldo------");
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNmUser());
            System.out.println("Saldo: " + usuario.getSaldo());
            System.out.println();
        }
    }

    public static void testarUsuario() {
        cadastrarUser(new Usuario("Rafael",  "1234", 759511865, "rafael@email.com", 100000.00f, 12548, 15987465));
        cadastrarUser(new Usuario("Maria",  "4321", 987654321, "maria@email.com", 200000.00f, 1234, 15987465));
        cadastrarUser(new Usuario("João",  "5678", 123456789, "joao@email.com", 50000.00f, 1343, 15987465));

        System.out.println("------Informações dos Usuários------");
        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getIdUser());
            System.out.println("Nome: " + usuario.getNmUser());
            System.out.println("Senha: " + usuario.getNroSenha());
            System.out.println("Telefone: " + usuario.getNroFone());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Saldo: " + usuario.getSaldo());
            System.out.println("Meta de Investimento: " + usuario.getMetaInvestimento());
            System.out.println("Cpf: " + usuario.getCpf());
            System.out.println();
        }
    }




}
