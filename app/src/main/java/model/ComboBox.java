package model;

import javax.swing.DefaultComboBoxModel;

public class ComboBox implements ComboBoxFactory {
    @Override
    public DefaultComboBoxModel<String> criarModeloUsuarios() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        for (Usuario usuario : BibliotecaManager.getInstance().getUsuarios()) {
            modelo.addElement(usuario.getNome());
        }
        return modelo;
    }

    @Override
    public DefaultComboBoxModel<String> criarModeloLivros() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        for (Livro livro : BibliotecaManager.getInstance().getLivros()) {
            modelo.addElement(livro.getTitulo());
        }
        return modelo;
    }
}
