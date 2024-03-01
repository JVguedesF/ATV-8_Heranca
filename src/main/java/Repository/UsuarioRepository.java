package Repository;

import Models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioRepository {

    public static List<Usuario> usuarios = new ArrayList<>();

    public static void cadastrarUser(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static Usuario validarLogin(String login, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNmUser().equals(login) && usuario.getNroSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
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


    public static void atualizarUsuario(String novoNroSenha, int novoNroFone, String novoEmail, float novoSaldo, int novoCpf) {

        Scanner scanner = new Scanner(System.in);
        for (Usuario usuario : usuarios) {

                usuario.setNroSenha(novoNroSenha);
                usuario.setNroFone(novoNroFone);
                usuario.setEmail(novoEmail);
                usuario.setSaldo(novoSaldo);
                usuario.setCpf(novoCpf);
                System.out.println();
                System.out.println("Usuario atualizado com sucesso!");
                System.out.println();
                return;
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

    public static Usuario getUsuariobyID(long idUser) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUser() == idUser) {
                return usuario;
            }
        }
        return null;
    }


}
