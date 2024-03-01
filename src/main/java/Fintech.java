import Repository.*;
import Models.*;
import java.util.Scanner;

public class Fintech {

    private static Usuario usuarioLogado;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("***************************************");
            System.out.println("----------------Fintech----------------");
            System.out.println("***************************************");
            System.out.println("Escolha uma das opções para prosseguir!");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastrar Usuario");
            System.out.println("3 - Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    telaLogin();
                    break;
                case 2:
                    telaCadastro();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    public static void telaLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************************");
        System.out.println("---------------Fintech---------------");
        System.out.println("**************************************");
        System.out.println("           Tela de Login            ");
        System.out.println();
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        usuarioLogado = UsuarioRepository.validarLogin(login, senha);

        if (usuarioLogado != null) {
            System.out.println("Login bem sucedido!");
            telaInicial(scanner);
        } else {
            System.out.println("Usuário ou senha inválidos. Por favor, tente novamente.");
        }
    }

    public static void telaCadastro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************************");
        System.out.println("---------------Fintech---------------");
        System.out.println("**************************************");
        System.out.println("         Tela de Cadastro           ");
        System.out.println();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        System.out.print("Telefone: ");
        int telefone = scanner.nextInt();
        scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        float saldo = scanner.nextFloat();
        System.out.print("CPF: ");
        int cpf = scanner.nextInt();
        scanner.nextLine();

        UsuarioRepository.cadastrarUser(new Usuario(nome, senha, telefone, email, saldo, cpf));

        System.out.println("Cadastro realizado com sucesso!");
    }

    public static void telaInicial(Scanner scanner) {
        System.out.println("**************************************");
        System.out.println("---------------Fintech---------------");
        System.out.println("**************************************");
        System.out.println("Escolha uma das opções para prosseguir!");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Receita");
        System.out.println("3 - Investimentos");
        System.out.println("4 - Transações");
        System.out.println("5 - Despesas");
        System.out.println("6 - Cartões");
        System.out.println("7 - Ver informações de perfil");
        System.out.println("8 - Atualizar Informações");
        System.out.println("9 - Excluir Conta");
        System.out.println();
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                UsuarioRepository.visualizarNomeESaldo();
                telaInicial(scanner);
            case 2:
                telaReceita();
                break;
            case 3:
                telaInvest();
                break;
            case 4:
                // Chamar método para lidar com transações
                break;
            case 5:
                // Chamar método para lidar com despesas
                break;
            case 6:
                // Chamar método para lidar com cartões
                break;
            case 7:
                UsuarioRepository.visualizarUsuario(UsuarioRepository.usuarios);
                telaInicial(scanner);
            case 8:

                System.out.println("Digite a nova senha:");
                scanner.nextLine();
                String novaSenha = scanner.nextLine();
                System.out.println("Digite o novo telefone:");
                int novoNroFone = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o novo email:");
                String novoEmail = scanner.nextLine();
                System.out.println("Digite o novo saldo:");
                float novoSaldo = scanner.nextFloat();
                System.out.println("Digite o novo CPF:");
                int novoCpf = scanner.nextInt();
                UsuarioRepository.atualizarUsuario(novaSenha, novoNroFone, novoEmail, novoSaldo, novoCpf);
                telaInicial(scanner);
            case 9:
                System.out.println("Digite o ID do usuário a ser excluído:");
                long idUsuarioExcluir = scanner.nextLong();
                UsuarioRepository.deletarUsuario(idUsuarioExcluir);
                break;
            case 10:
                telaLogin();
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }
    }

    public static void telaReceita() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************************");
        System.out.println("---------------Receitas---------------");
        System.out.println("**************************************");
        System.out.println("Escolha uma das opções para prosseguir!");
        System.out.println("1 - Visualizar receitas");
        System.out.println("2 - Cadastrar Receita");
        System.out.println("3 - Atualizar Receita");
        System.out.println("4 - Excluir Receita");
        System.out.println("5 - Tela Inicial");
        System.out.println();
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                ReceitaRepository.visualizarReceita(ReceitaRepository.receitas);
                telaReceita();
                break;
            case 2:
                System.out.print("Valor: ");
                double valor = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Informação: ");
                String info = scanner.nextLine();
                System.out.print("Data: ");
                String data = scanner.nextLine();
                ReceitaRepository.cadastrarReceita(valor, info, usuarioLogado, data);
                System.out.println("Receita cadastrada com sucesso!");
                telaReceita();
                break;
            case 3:
                System.out.print("Digite o ID da receita a ser atualizada: ");
                int idReceitaAtualizar = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Novo valor: ");
                double novoValor = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Nova descrição: ");
                String novaDescricao = scanner.nextLine();
                System.out.print("Nova data: ");
                String novaData = scanner.nextLine();
                ReceitaRepository.atualizarReceita(idReceitaAtualizar, novoValor, novaDescricao, novaData, usuarioLogado);
                telaReceita();
                break;
            case 4:
                System.out.print("Digite o ID da receita a ser excluída: ");
                int idReceitaExcluir = scanner.nextInt();
                ReceitaRepository.excluirReceita(idReceitaExcluir, usuarioLogado);
                telaReceita();
                break;
            case 5:
                telaInicial(scanner);
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                break;
        }
    }

    public static void telaInvest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************************");
        System.out.println("-------------Investimentos------------");
        System.out.println("**************************************");
        System.out.println("Escolha uma das opções para prosseguir!");
        System.out.println("1 - Ver investimentos");
        System.out.println("2 - Adicionar investimento");
        System.out.println("3 - Atualizar investimento");
        System.out.println("4 - Excluir investimento");
        System.out.println("5 - Valor total investido");
        System.out.println("6 - Tela Inicial");
        System.out.println();
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                InvestimentoRepository.visualizarInvest(InvestimentoRepository.investimentos);
                telaInvest();
                break;
            case 2:
                System.out.print("Valor: ");
                double valor = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Data: ");
                String data = scanner.nextLine();
                System.out.print("Informação: ");
                String tipo = scanner.nextLine();
                InvestimentoRepository.cadastrarInvest(valor, data, tipo, usuarioLogado);
                System.out.println("Investimento cadastrado com sucesso!");
                telaInvest();
                break;
            case 3:
                System.out.print("Digite o ID do investimento a ser atualizado: ");
                int idInvestimentoAtualizar = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Novo valor: ");
                double novoValor = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Nova data: ");
                String novaData = scanner.nextLine();
                System.out.print("Novo tipo: ");
                String novoTipo = scanner.nextLine();
                InvestimentoRepository.atualizarInvestimento(idInvestimentoAtualizar, 0, novoTipo, novaData, novoValor);
                telaInvest();
                break;
            case 4:
                System.out.print("Digite o ID do investimento a ser excluído: ");
                int idInvestimentoExcluir = scanner.nextInt();
                InvestimentoRepository.deletarInvestimento(idInvestimentoExcluir);
                System.out.println("Investimento excluído com sucesso!");
                telaInvest();
                break;
            case 5:
                double totalInvestido = InvestimentoRepository.somarInvestimentos();
                System.out.println("O total investido é: " + totalInvestido);
                telaInvest();
                break;
            case 6:
                telaInicial(scanner);
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                telaInvest();
                break;
        }
    }


}