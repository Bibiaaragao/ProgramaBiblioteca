public abstract class Publicacao {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private String editora;
    private int quantDisponivel;

    public Publicacao(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantDisponivel) {
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.quantDisponivel = quantDisponivel;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditora() {
        return editora;
    }

    public int getQuantDisponivel() {
        return quantDisponivel;
    }

    public abstract void imprimirDados();
}
