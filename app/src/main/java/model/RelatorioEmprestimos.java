package model;
import java.text.SimpleDateFormat;
import java.util.List;

public class RelatorioEmprestimos extends RelatorioTemplate {
    BibliotecaManager bibliotecaManager = BibliotecaManager.getInstance();
    List<Emprestimo> emprestimos = bibliotecaManager.getEmprestimos();

    public RelatorioEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    @Override
    protected String gerarCabecalho() {
        return "Relatório de Empréstimos Cadastrados\n";
    }

    @Override
    protected String gerarConteudo() {
        StringBuilder conteudo = new StringBuilder("Emprestimos realizados:\n");
        for (Emprestimo emprestimo : emprestimos) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = dateFormat.format(emprestimo.getDataDevolucao());
            conteudo.append("Nome do usuário: ").append(emprestimo.getUsuario())
                    .append(", Livro: ").append(emprestimo.getLivro())
                    .append(", Data de devolução: ").append(dataFormatada).append("\n");
        }
        return conteudo.toString();
    }

    @Override
    protected String gerarRodape() {
        return getRodapeComum();
    }
}
