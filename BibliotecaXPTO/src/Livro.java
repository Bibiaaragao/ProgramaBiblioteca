public class Livro extends Publicacao {
    private String edicao;
    private String isbn;

    public Livro(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantDisponivel, String edicao, String isbn) {
        super(titulo, autor, anoPublicacao, genero, editora, quantDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public String getEdicao() {
        return edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void imprimirDados(){
        System.out.println("Titulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nAno de Publicação: "
                + getAnoPublicacao() + "\nGênero: " + getGenero() + "\nEditora: " + getEditora() +
                "\nQuantidade Disponível: " + getQuantDisponivel() + "\nEdição: " + edicao + "\nISBN: " + isbn);
    }

}

