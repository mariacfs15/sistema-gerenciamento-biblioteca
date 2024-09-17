import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Sistema de Gerenciamento Biblioteca Tia Nise");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    Livro livro = new Livro(titulo, autor);
                    biblioteca.adicionarLivro(livro);
                    break;
                case 2:
                    biblioteca.listarLivros();
                    break;
                case 3:
                    System.out.print("Digite o título do livro a ser emprestado: ");
                    String tituloEmprestar = scanner.nextLine();
                    biblioteca.emprestarLivro(tituloEmprestar);
                    break;
                case 4:
                    System.out.print("Digite o título do livro a ser devolvido: ");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverLivro(tituloDevolver);
                    break;
                case 5:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
