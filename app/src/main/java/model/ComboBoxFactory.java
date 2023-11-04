package model;

import javax.swing.DefaultComboBoxModel;

public interface ComboBoxFactory {
    DefaultComboBoxModel<String> criarModeloUsuarios();
    DefaultComboBoxModel<String> criarModeloLivros();
}
