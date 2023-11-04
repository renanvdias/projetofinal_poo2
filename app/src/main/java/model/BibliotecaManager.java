package model;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaManager {
    private static BibliotecaManager instance;
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;
    private List<Usuario> usuarios;
    private List<Observer> observadores = new ArrayList<>();

    private BibliotecaManager() {
        livros = new ArrayList<>();
        emprestimos = new ArrayList<>();
        usuarios = new ArrayList<>();
    }
    
    public void registrarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizarListaLivros(livros);
            observador.atualizarListaEmprestimos(emprestimos);
        }
    }

    public static BibliotecaManager getInstance() {
        if (instance == null) {
            instance = new BibliotecaManager();
        }
        return instance;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }
}
