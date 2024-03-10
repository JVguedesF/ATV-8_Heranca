package Models;

import java.time.LocalDate;
import java.util.List;

public class Usuario {
    private static int idCounter = 1;
    private int idUser;
    private String nome;
    private String senha;
    private String telefone;
    private String email;
    private double saldo = 0.0;
    private String cpf;

    private List<Investimento> investimentos;
    private List<Cartao> cartoes;


    public Usuario(String nome, String senha, String telefone, String email,  String cpf) {
        this.idUser = idCounter++;
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

    public int getIdUser() {
        return idUser;
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

    //Falta criar getInvestimentos e getCartoes
}
