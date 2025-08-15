import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistema de Gerenciamento de Biblioteca");
            System.out.println("1. Adicionar Empréstimo");
            System.out.println("2. Listar Empréstimos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = ler.nextInt();
            ler.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do cliente: ");
                String nome = ler.nextLine();
                System.out.print("CPF do cliente: ");
                String cpf = ler.nextLine();
                System.out.print("Telefone do cliente: ");
                String telefone = ler.nextLine();
                System.out.print("Título do livro: ");
                String titulo = ler.nextLine();
                System.out.print("Autor do livro: ");
                String autor = ler.nextLine();
                System.out.print("Ano de publicação: ");
                String ano = ler.nextLine();
                System.out.print("Data de empréstimo: ");
                String dataEmprestimo = ler.nextLine();
                System.out.print("Data de entrega: ");
                String dataEntrega = ler.nextLine();

                Emprestimo emprestimo = new Emprestimo(nome, cpf, telefone, titulo, autor, ano, dataEmprestimo, dataEntrega);
                emprestimos.add(emprestimo);
                System.out.println("Empréstimo registrado com sucesso!");
            } else if (opcao == 2) {
                if (emprestimos.isEmpty()) {
                    System.out.println("Nenhum empréstimo registrado.");
                } else {
                    System.out.println("\nLista de Empréstimos:");
                    for (int i = 0; i < emprestimos.size(); i++) {
                        Emprestimo e = emprestimos.get(i);
                        System.out.println("Empréstimo " + (i + 1) + ":");
                        System.out.println("Cliente: " + e.pessoas.nome + " (CPF: " + e.pessoas.cpf + ", Telefone: " + e.pessoas.telefone + ")");
                        System.out.println("Livro: " + e.livro.titulo + " (Autor: " + e.livro.autor + ", Ano: " + e.livro.anoPublicacao + ")");
                        System.out.println("Data de Empréstimo: " + e.diaEmprestimo);
                        System.out.println("Data de Entrega: " + e.diaEntregaEmprestimo);
                        System.out.println("------------------------");
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        ler.close();
    }
}
