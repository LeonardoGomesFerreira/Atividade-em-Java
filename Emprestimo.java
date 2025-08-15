public class Emprestimo {
    Cliente pessoas;
    Livros livro;
    String diaEmprestimo;
    String diaEntregaEmprestimo;

    Emprestimo(String nomeCliente, String cpfCliente, String telefoneCliente,
               String tituloLivro, String autorLivro, String anoPublicacaoLivro,
               String diaEmprestimo, String diaEntregaEmprestimo) {

        pessoas = new Cliente(nomeCliente, cpfCliente, telefoneCliente);
        livro = new Livros(tituloLivro, autorLivro, anoPublicacaoLivro);
        this.diaEmprestimo = diaEmprestimo;
        this.diaEntregaEmprestimo = diaEntregaEmprestimo;
    }
}
