package br.com.cafi.salaodesktop.controle;

import br.com.cafi.salaodesktop.modelo.dao.DAO;
import br.com.cafi.salaodesktop.modelo.entidades.Produto;
import br.com.cafi.salaodesktop.visao.CadastrarProduto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControleCadastrarProduto implements ActionListener{

    private CadastrarProduto cadastrarProduto;

    public ControleCadastrarProduto(CadastrarProduto cadastrarProduto) {
        this.cadastrarProduto = cadastrarProduto;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== cadastrarProduto.getSalvarButton()){
            Produto p = new Produto();
            p.setDescricao(cadastrarProduto.getDescricaoTextField().getText());
            p.setPrecoCompra(Double.parseDouble(cadastrarProduto.getPrecoCompraFormattedTextField().getText()));
            p.setPrecoVenda(Double.parseDouble(cadastrarProduto.getPrecoVendaFormattedTextField().getText()));
            p.setQuantidadeEstoque(Double.parseDouble(cadastrarProduto.getQuantidadeEstoqueFormattedTextField().getText()));
            
            DAO<Produto> daoProduto = new DAO<>(Produto.class);
            daoProduto.abrir().create(p).fechar();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            
            cadastrarProduto.getDescricaoTextField().setText("");
            cadastrarProduto.getPrecoVendaFormattedTextField().setText("");
            cadastrarProduto.getPrecoCompraFormattedTextField().setText("");
            cadastrarProduto.getQuantidadeEstoqueFormattedTextField().setText("");
        }
    }
    
}
