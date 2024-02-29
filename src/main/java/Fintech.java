import Models.*;

import java.util.Scanner;

public class Fintech {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("**************************************");
            System.out.println("---------------Receitas---------------");
            System.out.println("**************************************");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Visualizar todas as receitas");
            System.out.println("2 - Cadastrar uma nova receita");
            System.out.println("3 - Atualizar uma receita existente");
            System.out.println("4 - Excluir uma receita");
            System.out.println("5 - Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Receita.visualizarReceita(Receita.receitas);
                    break;
                case 2:
                    System.out.println("-----------Cadastro de Receita-----------");
                    System.out.println("Digite o valor da receita:");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite uma breve descrição da receita:");
                    String descricao = scanner.nextLine();
                    System.out.println("Digite a data da receita (formato: dd/mm/aaaa):");
                    String data = scanner.nextLine();
                    Receita.cadastrarReceita(valor, descricao, 1, data);
                    System.out.println();
                    System.out.println("Receita cadastrada com sucesso!");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("-----------Atualização de Receita-----------");
                    System.out.println("Por favor, selecione a receita que deseja atualizar e forneça as novas informações:");
                    System.out.println("Digite o ID da receita a ser atualizada:");
                    int idAtualizacao = scanner.nextInt();
                    System.out.println("Digite o novo valor da receita:");
                    double novoValor = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite a nova descrição da receita:");
                    String novaDescricao = scanner.nextLine();
                    System.out.println("Digite a nova data da receita (formato: dd/mm/aaaa):");
                    String novaData = scanner.nextLine();
                    Receita.atualizarReceita(idAtualizacao, novoValor, novaDescricao, novaData);
                    break;
                case 4:
                    System.out.println("-----------Exclusão de Receita-----------");
                    System.out.println("Por favor, selecione a receita que deseja excluir:");
                    System.out.println("Digite o ID da receita a ser excluída:");
                    int idExclusao = scanner.nextInt();
                    Receita.excluirReceita(idExclusao);
                    System.out.println();
                    System.out.println("Receita excluída com sucesso!");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
    }
}
