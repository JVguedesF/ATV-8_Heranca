package Repositorio;

import Models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio {

    public static List<Usuario> usuarios = new ArrayList<>();

    public static void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void visualizarUsuario(List<Usuario> usuarios) {
        System.out.println("------ Informação de Perfil ------");
        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getIdUsuario());
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Cpf: " + usuario.getCpf());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Senha: " + usuario.getSenha());
            System.out.println("Telefone: " + usuario.getTelefone());
            System.out.println("Saldo: R$" + usuario.getSaldo() + "\n");
        }

    }


    public static void atualizarUsuario(String novaSenha, String novoTelefone, String novoEmail, double novoSaldo) {
        for (Usuario usuario : usuarios) {
            usuario.setSenha(novaSenha);
            usuario.setTelefone(novoTelefone);
            usuario.setEmail(novoEmail);
            usuario.setSaldo(novoSaldo);
            System.out.println("\nUsuario atualizado com sucesso!\n");
            return;
        }

    }

    public static void deletarUsuario(int idUser) {
        usuarios.removeIf(usuario -> usuario.getIdUsuario() == idUser);
        System.out.println("Usuario excluido!");
    }


    public static Usuario getUsuariobyID(int idUser) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario() == idUser) {
                System.out.println("ID: " + usuario.getIdUsuario());
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("Cpf: " + usuario.getCpf());
                System.out.println("Email: " + usuario.getEmail());
                System.out.println("Senha: " + usuario.getSenha());
                System.out.println("Telefone: " + usuario.getTelefone());
                System.out.println("Saldo: R$" + usuario.getSaldo() + "\n");
            }
        }

        return null;
    }


}