/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.cafi.salaodesktop.visao;

import bo.ProdutoBO;
import br.com.cafi.salaodesktop.controle.ControleCadastrarProduto;
import br.com.cafi.salaodesktop.modelo.entidades.Produto;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class CadastrarProduto extends javax.swing.JPanel {

    /**
     * Creates new form CadastrarProduto
     */
    public CadastrarProduto(JInternalFrame jif) {
        initComponents();
        produto=new Produto();
    }

    private Produto produto;

    public CadastrarProduto(JInternalFrame jif, Produto produto) {
        initComponents();
        this.produto=produto;
        this.descricaoTextField.setText(produto.getDescricao());
        this.precoVendaFormattedTextField.setText(produto.getPrecoVenda()+"");
        this.precoCompraFormattedTextField.setText(produto.getPrecoCompra()+"");
        this.quantidadeEstoqueFormattedTextField.setText(produto.getQuantidadeEstoque()+"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        descricaoTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        precoCompraFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        precoVendaFormattedTextField = new javax.swing.JFormattedTextField();
        salvarButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        quantidadeEstoqueFormattedTextField = new javax.swing.JFormattedTextField();

        jLabel1.setText("Descricao");

        jLabel2.setText("Preço Compra");

        precoCompraFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        jLabel3.setText("Preço Venda");

        precoVendaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jLabel4.setText("Qnt Estoque");

        quantidadeEstoqueFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precoCompraFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precoVendaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(salvarButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantidadeEstoqueFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(precoCompraFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(precoVendaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(quantidadeEstoqueFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarButton)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        if (validado()){
            
            produto.setDescricao(descricaoTextField.getText());
            System.out.println("a bronca está em: "+precoCompraFormattedTextField.getText());
            produto.setPrecoCompra(Double.parseDouble(precoCompraFormattedTextField.getText().replace(",",".")));
            produto.setPrecoVenda(Double.parseDouble(precoVendaFormattedTextField.getText().replace(",",".")));
            produto.setQuantidadeEstoque(Integer.parseInt(quantidadeEstoqueFormattedTextField.getText()));
            
            ProdutoBO bo = new ProdutoBO();
            if(produto.getId()==null){
                bo.save(produto);
            }
            else{
                bo.update(produto);
            }
            limparFormulario();
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    public boolean validado(){
        return true;
    }
    
    public JTextField getDescricaoTextField() {
        return descricaoTextField;
    }

    public JFormattedTextField getPrecoCompraFormattedTextField() {
        return precoCompraFormattedTextField;
    }

    public JFormattedTextField getPrecoVendaFormattedTextField() {
        return precoVendaFormattedTextField;
    }

    public JFormattedTextField getQuantidadeEstoqueFormattedTextField() {
        return quantidadeEstoqueFormattedTextField;
    }

    public JButton getSalvarButton() {
        return salvarButton;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JFormattedTextField precoCompraFormattedTextField;
    private javax.swing.JFormattedTextField precoVendaFormattedTextField;
    private javax.swing.JFormattedTextField quantidadeEstoqueFormattedTextField;
    private javax.swing.JButton salvarButton;
    // End of variables declaration//GEN-END:variables

    private void limparFormulario() {
        descricaoTextField.setText("");
        precoCompraFormattedTextField.setText("");
        precoVendaFormattedTextField.setText("");
        quantidadeEstoqueFormattedTextField.setText("");
    }
}
