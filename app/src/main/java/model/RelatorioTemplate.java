package model;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public abstract class RelatorioTemplate {
        protected abstract String gerarCabecalho();

    protected abstract String gerarConteudo();

    protected abstract String gerarRodape();

    public final String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append(gerarCabecalho());
        relatorio.append(gerarConteudo());
        relatorio.append(gerarRodape());
        return relatorio.toString();
    }

    protected String getRodapeComum() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Data do Relatório: " + sdf.format(new Date());
    }
}
