package model;

import java.util.ArrayList;
import java.util.List;

public interface Observer {
    void atualizarListaLivros(List<Livro> livros);
    void atualizarListaEmprestimos(List<Emprestimo> emprestimos);
}
