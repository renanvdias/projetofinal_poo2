package model;
import java.util.List;

public class RelatorioLivros extends RelatorioTemplate {
    private List<Livro> livros;

    public RelatorioLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    protected String gerarCabecalho() {
        return "Relatório de Livros\n";
    }

    @Override
    protected String gerarConteudo() {
        StringBuilder conteudo = new StringBuilder("Livros cadastrados: \n");
        for (Livro livro : livros) {
            conteudo.append("Título: ").append(livro.getTitulo()).append(", Autor: ").append(livro.getAutor()).append("\n");
        }
        return conteudo.toString();
    }

    @Override
    protected String gerarRodape() {
        return "Uberlandia/MG\n" + getRodapeComum();
    }
}

