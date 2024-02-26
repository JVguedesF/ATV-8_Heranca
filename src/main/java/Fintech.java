import Models.Despesa;
import Models.Receita;
import Models.Usuario;


public class Fintech {

    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "João", (short)1234, 123456789, "joao@example.com", 1000.0f);


        System.out.println("Saldo inicial: " + usuario.visualizarSaldo());

        Receita receita = new Receita(1, (short) 1, 20240226, 500, 1);
        usuario.setSaldo(usuario.getSaldo() + receita.getValorTransacao());

        System.out.println("Saldo após receita: " + usuario.visualizarSaldo());


        Despesa despesa = new Despesa(1, (short) 2, 20240226, 200, 2);
        usuario.setSaldo(usuario.getSaldo() - despesa.getValorTransacao());

        System.out.println("Saldo após despesa: " + usuario.visualizarSaldo());
    }

}
