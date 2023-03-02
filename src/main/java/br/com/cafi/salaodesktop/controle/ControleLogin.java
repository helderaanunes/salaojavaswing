package br.com.cafi.salaodesktop.controle;

import br.com.cafi.salaodesktop.visao.TelaInicial;
import br.com.cafi.salaodesktop.visao.TelaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControleLogin implements ActionListener {

    private TelaLogin telaLogin;

    public ControleLogin(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == telaLogin.getFecharButton()) {
            System.exit(0);
        } else if (e.getSource() == telaLogin.getEntrarButton()) {
            if (telaLogin.getLoginTextField().getText().equals("maria")
                    && new String (telaLogin.getSenhaPasswordField().getPassword()).equals("123")) {
                TelaInicial telaInicial = new TelaInicial();
                telaInicial.setVisible(true);
                telaLogin.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Senha ou Login Incorreto!");
                telaLogin.getLoginTextField().setText("");
                telaLogin.getSenhaPasswordField().setText("");
            }
        }
    }

}
