/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cadastroclienteswing;

import dao.ClienteMapDAO;
import dao.IClienteDAO;
import domain.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cliente
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel();
    private IClienteDAO clienteDAO = new ClienteMapDAO();
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setText("Nome:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblCpf.setText("CPF:");

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaCliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaClienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblTelefone.setText("Telefone:");

        jLabel1.setText("Cidade:");

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jMenu1.setText("Op????es");

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(14, 14, 14)
                        .addComponent(btnAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNome)
                                .addComponent(lblCpf))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNome)
                                .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                            .addGap(69, 69, 69)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelefone)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTelefone)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCpf)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefone))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Deseja sair da aplica????o?", "Sair", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        String telefone = txtTelefone.getText();
        String cidade = txtCidade.getText();
        
        if (!isCamposValidos(nome, cpf)) {
            JOptionPane.showMessageDialog(null, "Existem campos a serem preenchidos", "Sucesso!", 
                JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Cliente cliente = new Cliente(nome, cpf, telefone, null, cpf, cidade, null);
        
        Boolean isCadastrado = this.clienteDAO.cadastrar(cliente);
        
        if(isCadastrado) {
            modelo.addRow(new Object[]{cliente.getNome(), cliente.getCpf(), cliente.getTel(), cliente.getCidade()});
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Existem campos a serem preenchidos", "Sucesso!", 
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso!", 
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tabelaClienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaClienteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaClienteAncestorAdded

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        int linhaSelecionada = tabelaCliente.getSelectedRow();
        Long cpf = (Long) tabelaCliente.getValueAt(linhaSelecionada, 1);
        
        Cliente cliente = this.clienteDAO.consultar(cpf);
        
        txtNome.setText(cliente.getNome());
        txtCpf.setText(cliente.getCpf().toString());
        txtTelefone.setText(cliente.getTel().toString());
        txtCidade.setText(cliente.getCidade());
    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       int linhaSelecionada = tabelaCliente.getSelectedRow();
       
       if (linhaSelecionada >= 0) {
           int result = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir esse cliente?", "Exclus??o",
                   JOptionPane.YES_NO_OPTION,
                   JOptionPane.QUESTION_MESSAGE);
           
           if (result == JOptionPane.YES_OPTION) {
               
               Long cpf = (Long) tabelaCliente.getValueAt(linhaSelecionada, 1);
               this.clienteDAO.excluir(cpf);
               modelo.removeRow(linhaSelecionada);
               
               JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!", "sucesso!", 
                       JOptionPane.INFORMATION_MESSAGE);
               
               limparCampos();
           } else {
               JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado", "erro",
                       JOptionPane.INFORMATION_MESSAGE);
               
           }
           
       }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
       int linhaSelecionada = tabelaCliente.getSelectedRow();
       
       if (linhaSelecionada >= 0) {
           Long cpf = (Long) tabelaCliente.getValueAt(linhaSelecionada, 1);
           String nome = txtNome.getText();
           String telefone = txtTelefone.getText();
           String cidade = txtCidade.getText();
           
           
           
            if (!isCamposValidos(nome, cpf.toString())) {
                JOptionPane.showMessageDialog(this, "Falta preencher os campos obrigat??rios");
                return;
            }
            
            Cliente clienteAtt = new Cliente(nome, cpf.toString(), telefone.toString(), null, cpf.toString(), cidade, null);
            this.clienteDAO.alterar(clienteAtt);
            
            modelo.removeRow(linhaSelecionada);
            modelo.addRow(new Object[]{clienteAtt.getNome(), clienteAtt.getCpf(), clienteAtt.getTel(), clienteAtt.getCidade()});
            
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
       } else {
           JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado", "Erroc", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private boolean isCamposValidos(String ...campos) {
        for (String campo : campos) {
            if (campos == null || !"".equals(campo)) {
                return true;
            }
        }
        return false;
    }

    private void initCustomComponents() {
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Telefone");
        modelo.addColumn("Cidade");
        
        tabelaCliente.setModel(modelo);
    }

    private void limparCampos() {
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtCidade.setText("");
    }
}
