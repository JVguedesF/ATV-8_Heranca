package Models;

public class Despesa extends Transacao {
    private static int idCounter = 1;
    private int idDespesa;


    public Despesa(double valor, String info, long idUsuario, String data) {
        super(idCounter++, valor, info, idUsuario, data);
        this.idDespesa = idCounter;
    }



    public int getIdDespesa() {
        return idDespesa;
    }


    public static void testarDespesa() {
        Despesa despesa = new Despesa(200.0d, "Compras de supermercado", 2, "08/08/2024");

        System.out.println("------Informações da Despesa------");
        System.out.println("ID da Despesa: " + despesa.getIdDespesa());
        System.out.println("Valor: " + despesa.getValor());
        System.out.println("Descrição: " + despesa.getInfo());
        System.out.println("Data: " + despesa.getData());
        System.out.println("ID do Usuário: " + despesa.getIdUsuario());
        System.out.println();
    }
}
