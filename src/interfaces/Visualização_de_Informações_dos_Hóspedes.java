/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author gponte
 */
public class Visualização_de_Informações_dos_Hóspedes extends javax.swing.JFrame {

       //carregar
   private void loadTableFromFile() {
    File file = new File("visualização.csv");
    if (!file.exists()) {
        return; // Se o arquivo não existir, não faça nada
    }
    try (Scanner scanner = new Scanner(file)) {
        DefaultTableModel model = (DefaultTableModel) tbEstoque.getModel();
        model.setRowCount(0); // Limpa a tabela antes de carregar os dados
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // Ignora a linha de cabeçalho
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(";");
            if (data.length == model.getColumnCount()) {
                model.addRow(data);
            }
        }
    } catch (IOException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar tabela: " + e.getMessage());
    }
}
    /**
     * Creates new form Estoque
     */
    public Visualização_de_Informações_dos_Hóspedes() {
        initComponents();
        loadTableFromFile();
    }
    
    //Salvar
    private void saveTableToFile() {
    File file = new File("visualização.csv");
    try (FileWriter fw = new FileWriter(file)) {
        TableModel model = tbEstoque.getModel();
        for (int i = 0; i < model.getColumnCount(); i++) {
            fw.write(model.getColumnName(i) + ";");
        }
        fw.write("\n");
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                fw.write(model.getValueAt(i, j).toString() + ";");
            }
            fw.write("\n");
        }
        fw.flush();
        javax.swing.JOptionPane.showMessageDialog(this, "Tabela salva com sucesso!");
    } catch (IOException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar tabela: " + e.getMessage());
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEstoque = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JFormattedTextField();
        txttelefone = new javax.swing.JFormattedTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        Registro = new javax.swing.JMenu();
        Close = new javax.swing.JMenu();
        Salvar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro hotel");
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        btExcluir.setBackground(new java.awt.Color(204, 204, 204));
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAlterar.setBackground(new java.awt.Color(204, 204, 204));
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btInserir.setBackground(new java.awt.Color(204, 204, 204));
        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

        txtnome.setBackground(new java.awt.Color(204, 204, 204));
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Telefone");

        txtemail.setBackground(new java.awt.Color(204, 204, 204));
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        tbEstoque.setAutoCreateRowSorter(true);
        tbEstoque.setBackground(new java.awt.Color(204, 204, 204));
        tbEstoque.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        tbEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome:", "Telefone", "Email", "CPF", "Check_In", "Check_Out"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEstoque.setAutoscrolls(false);
        tbEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbEstoque.setDragEnabled(true);
        tbEstoque.setFillsViewportHeight(true);
        tbEstoque.setFocusable(false);
        tbEstoque.setGridColor(new java.awt.Color(204, 204, 204));
        tbEstoque.setShowGrid(true);
        jScrollPane1.setViewportView(tbEstoque);
        if (tbEstoque.getColumnModel().getColumnCount() > 0) {
            tbEstoque.getColumnModel().getColumn(0).setResizable(false);
            tbEstoque.getColumnModel().getColumn(1).setResizable(false);
            tbEstoque.getColumnModel().getColumn(2).setResizable(false);
            tbEstoque.getColumnModel().getColumn(3).setResizable(false);
            tbEstoque.getColumnModel().getColumn(4).setResizable(false);
            tbEstoque.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cpf");

        txtcpf.setBackground(new java.awt.Color(204, 204, 204));
        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
            }
        });

        txttelefone.setBackground(new java.awt.Color(204, 204, 204));
        try {
            txttelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+##)###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jCheckBox1.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Fez o Check-In");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Fez o Check-Out");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btInserir)
                                    .addGap(18, 18, 18)
                                    .addComponent(btAlterar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btExcluir)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox2)
                                .addGap(155, 155, 155)))
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        jMenu1.setText("Cadastro hotel");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Hospedes");
        jMenuBar1.add(jMenu3);

        Registro.setText("Relatórios");
        Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroMouseClicked(evt);
            }
        });
        jMenuBar1.add(Registro);

        Close.setText("Close");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        jMenuBar1.add(Close);

        Salvar.setText("Salvar");
        Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalvarMouseClicked(evt);
            }
        });
        jMenuBar1.add(Salvar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Produtos = (DefaultTableModel) tbEstoque.getModel();
        
Object[] dados = {
    txtnome.getText(),
    txttelefone.getText(),
    txtemail.getText(),
    txtcpf.getText(),
    jCheckBox1.isSelected() ? "Sim" : "Não", // Adiciona "Sim" ou "Não" baseado no estado do jCheckBox1
    jCheckBox2.isSelected() ? "Sim" : "Não"  // Adiciona "Sim" ou "Não" baseado no estado do jCheckBox2
   
};

        Produtos.addRow(dados);
        txtnome.setText("");
        txtemail.setText("");
   
        txtemail.setText("");
        txtcpf.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
   
    }//GEN-LAST:event_btInserirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        // TODO add your handling code here:
       
        if(tbEstoque.getSelectedRow() != -1){
           tbEstoque.setValueAt(txtnome.getText(), tbEstoque.getSelectedRow(), 0);
           tbEstoque.setValueAt(txtemail.getText(), tbEstoque.getSelectedRow(), 1);
         
           tbEstoque.setValueAt(txtemail.getText(), tbEstoque.getSelectedRow(), 3);
           tbEstoque.setValueAt(txtcpf.getText(), tbEstoque.getSelectedRow(), 4);

           txtnome.setText("");
            txtemail.setText("");
          
            txtemail.setText("");
            txtcpf.setText("");
           jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        if(tbEstoque.getSelectedRow() != -1){
            DefaultTableModel Produto = (DefaultTableModel) tbEstoque.getModel();
            Produto.removeRow(tbEstoque.getSelectedRow());
            
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        Cadastro_hotel f = new Cadastro_hotel();
            this.dispose();
            f.setVisible(true);             
    }//GEN-LAST:event_jMenu1MouseClicked

    private void SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarMouseClicked
        // TODO add your handling code here:
        saveTableToFile();
    }//GEN-LAST:event_SalvarMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMouseClicked
        // TODO add your handling code here:
        Registro_de_Atividades_Relatórios f = new Registro_de_Atividades_Relatórios();
        this.dispose();
        f.setVisible(true);
    }//GEN-LAST:event_RegistroMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Visualização_de_Informações_dos_Hóspedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualização_de_Informações_dos_Hóspedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualização_de_Informações_dos_Hóspedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualização_de_Informações_dos_Hóspedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visualização_de_Informações_dos_Hóspedes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Close;
    private javax.swing.JMenu Registro;
    private javax.swing.JMenu Salvar;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEstoque;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnome;
    private javax.swing.JFormattedTextField txttelefone;
    // End of variables declaration//GEN-END:variables
}
