package Models;

import java.time.LocalDate;
import java.util.List;

public class Usuario {
    private static int idCounter = 1;
    private int idUsuario;
    private String nome;
    private String senha;
    private String telefone;
    private String email;
    private double saldo = 0.0;
    private String cpf;

    private List<Investimento> investimentos;
    private List<Cartao> cartoes;


    public Usuario(String nome, String senha, String telefone, String email,  String cpf) {
        this.idUsuario = idCounter++;
        this.nome = nome;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public void atualizarTodasInformacoes(String senha, String telefone, String email) {
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void adicionarInvestimento(double valor, String nome, double metaValor, LocalDate dataResgate, double mediaJurosMensal) {
        Investimento invest = new Investimento(valor, nome, metaValor, dataResgate, mediaJurosMensal);
        this.investimentos.add(invest);
    }

    public void adicionarCartao(String numeroCartao) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate vencimento = dataAtual.plusYears(5);
        Cartao cartao = new Cartao(numeroCartao, vencimento);
        this.cartoes.add(cartao);
    }

    public void getCartoes() {
        System.out.println("------ Lista de Cartões ------");
        for (Cartao cartao : cartoes) {
            System.out.println("Cartão " + cartao.getIdCartao() + ":");
            System.out.println("Número do Cartão: " + cartao.getNumeroCartao());
            System.out.println("Vencimento do Cartão: " + cartao.getVencimentoCartao());
            System.out.println();
        }
    }

    public void atualizarCartao(int idCartao, String numeroCartao,  LocalDate vencimentoCartao) {
        System.out.println("Atualizando cartão com ID " + idCartao + "...");
        for (Cartao cartao : cartoes) {
            if (cartao.getIdCartao() == idCartao) {
                cartao.setNumeroCartao(numeroCartao);
                cartao.setVencimentoCartao(vencimentoCartao);
                System.out.println("Cartão atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Cartão com ID " + idCartao + " não encontrado. Nenhuma atualização realizada.");
    }

    public void deletarCartao(int idCartao) {
        System.out.println("Excluindo cartão com ID " + idCartao + "...");
        cartoes.removeIf(cartao -> cartao.getIdCartao() == idCartao);
        System.out.println("Cartão excluído com sucesso!");
    }

    public static void getInvestimentos(List<Investimento> investimentos) {
        System.out.println("------ Lista de Investimentos ------");
        for (Investimento investimento : investimentos) {
            System.out.println("Investimento " + investimento.getIdInvestimento() + ":");
            System.out.println("Total do Investimento: " + investimento.getTotalInvestimento());
            System.out.println("Tipo: " + investimento.getTipo());
            System.out.println("Meta: " + investimento.getMetaInvestimento());
            System.out.println("Data de Resgate: " + investimento.getDataResgate());
            System.out.println("Taxa Mensal: " + investimento.getTaxaMensal());
            System.out.println();
        }
    }

    public void atualizarInvestimento(int idInvestimento, double totalInvestimento, String tipo, double metaInvestimento, LocalDate dataResgate, double mediaJurosMensal) {
        System.out.println("Atualizando investimento com ID " + idInvestimento + "...");
        for (Investimento investimento : investimentos) {
            if (investimento.getIdInvestimento() == idInvestimento) {
                investimento.setTotalInvestimento(totalInvestimento);
                investimento.setTipo(tipo);
                investimento.setMetaInvestimento(metaInvestimento);
                investimento.setMetaData(dataResgate);
                investimento.setMediaJurosMensal(mediaJurosMensal);
                System.out.println("Investimento atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Investimento com ID " + idInvestimento + " não encontrado. Nenhuma atualização realizada.");
    }

    public void deletarInvestimento(int idInvestimento) {
        System.out.println("Excluindo investimento com ID " + idInvestimento + "...");
        investimentos.removeIf(investimento -> investimento.getIdInvestimento() == idInvestimento);
        System.out.println("Investimento excluído com sucesso!");
    }

    public double somarInvestimentos() {
        double totalInvestido = 0;
        for (Investimento investimento : investimentos) {
            totalInvestido += investimento.getTotalInvestimento();
        }
        return totalInvestido;
    }
}
