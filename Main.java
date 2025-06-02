package biblioteca;

public class Main {
    public static void main (String[]args) {
        Biblioteca minhaBiblioteca = new Biblioteca();

        livro livro1 = new livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "9788532511010", true);
        livro livro2 = new livro("Jogos Vorazes", "Suzanne Collins", "9788579800245", true);
        livro livro3 = new livro("A Culpa é das Estrelas", "John Green", "9788580572261", true);
        livro livro4 = new livro("O Hobbit", "J.R.R. Tolkien", "9788533613372", true);

        Aluno aluno1 = new Aluno("Eduarda", 1);
        Professor professor1 = new Professor("Ivia", 2);

        minhaBiblioteca.cadastrarLivro(livro1);
        minhaBiblioteca.cadastrarLivro(livro2);
        minhaBiblioteca.cadastrarLivro(livro3);
        minhaBiblioteca.cadastrarLivro(livro4);

        minhaBiblioteca.cadastrarUsuario(aluno1);
        minhaBiblioteca.cadastrarUsuario(professor1);

        minhaBiblioteca.emprestarLivro(aluno1, livro1);
        minhaBiblioteca.emprestarLivro(professor1, livro2);

        minhaBiblioteca.devolverLivro(aluno1, livro1);
        minhaBiblioteca.devolverLivro(professor1, livro2);

        minhaBiblioteca.emprestarLivro(aluno1, livro3);
        minhaBiblioteca.emprestarLivro(professor1, livro4);
    }
}
