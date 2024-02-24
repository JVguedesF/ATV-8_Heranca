package Controller;

import Models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {

    List<Usuario> usuarios = new ArrayList<>();

    public void casdastrarUser(String nmUser, short nroSenha, int nroFone, String email, float saldo){
        Usuario usuario = new Usuario(nmUser, nroSenha, nroFone, email, saldo);
        usuarios.add(usuario);
    }

   public float visualizarSaldo(Usuario usuario){
       return usuario.getSaldo();
   }
}
