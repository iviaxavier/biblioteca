package biblioteca;

public class livro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public livro(String titulo, String autor, String isbn, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("O livro \"" + this.titulo + "\" foi emprestado.");
        } else {
            System.out.println("O livro \"" + this.titulo + "\" não está disponível para empréstimo.");
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("O livro \"" + this.titulo + "\" foi devolvido.");
        } else {
            System.out.println("O livro \"" + this.titulo + "\" já está disponível na biblioteca.");
        }
    }

    public boolean estaDisponivel() {
        return this.disponivel;
    }
}
