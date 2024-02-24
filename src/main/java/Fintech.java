import Controller.UsuarioController;
import Models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Fintech {

    public static List<Usuario> usuarios = new ArrayList<>();

    public static void cadastrarUser(String nmUser, short nroSenha, int nroFone, String email, float saldo){
        Usuario usuario = new Usuario(nmUser, nroSenha, nroFone, email, saldo);
        usuarios.add(usuario);
    }
    public static float visualizarSaldo(Usuario usuario){
        return usuario.getSaldo();
    }


    public static void main(String[] args) {
        cadastrarUser("Rafael", (short) 1234, 759511865, "rafael@outlook.com", 100000.00f);
        float saldo = visualizarSaldo(usuarios.get(0));

        System.out.println(saldo);

    }

}
