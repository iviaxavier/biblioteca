package biblioteca;

import java.util.Date;

public class emprestimo {
    private livro livro;
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public emprestimo(livro livro, Usuario usuario, Date dataEmprestimo, Date dataDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public boolean estaAtrasado() {
        Date hoje = new Date();
        return hoje.after(this.dataDevolucao);
    }

    public livro getLivro() {
        return this.livro;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public Date getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return this.dataDevolucao;
    }
}
