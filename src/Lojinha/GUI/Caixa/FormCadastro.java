package Lojinha.GUI.Caixa;

import Lojinha.Entidades.Caixa;
import Lojinha.RN.CaixaRN;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class FormCadastro extends javax.swing.JFrame {

    boolean tipo;

    /**
     * Creates new form FormCadastro
     *
     * @param tipo
     */
    public FormCadastro(boolean tipo) {

        this.tipo = tipo;

        initComponents();
        setLocation(500, 100);

        if (tipo) {
            jLabelTipo.setText("Novo Ganho");
            jButtonSalvar.setText("Salvar ganho");

        } else {
            jLabelTipo.setText("Novo Gasto");
            jButtonSalvar.setText("Salvar gasto");
        }

        SimpleDateFormat dataF = new SimpleDateFormat("dd/MM/yyyy");
        String data = dataF.format(new Date(System.currentTimeMillis()));

        jTextData.setText(data);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                fechar();
                new FormCaixa().setVisible(true);

            }
        });
    }

    public void fechar() {
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTipo = new javax.swing.JLabel();
        jLabelTipo1 = new javax.swing.JLabel();
        jTextDescricao = new javax.swing.JTextField();
        jTextPreco = new javax.swing.JTextField();
        jLabelTipo2 = new javax.swing.JLabel();
        jLabelTipo3 = new javax.swing.JLabel();
        jLabelTipo4 = new javax.swing.JLabel();
        jTextData = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabelTipo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelTipo.setText("Novo tipo");

        jLabelTipo1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTipo1.setText("Descrição");

        jTextDescricao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTextPreco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelTipo2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTipo2.setText("Preço");

        jLabelTipo3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTipo3.setText("R$");

        jLabelTipo4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTipo4.setText("Data");

        jTextData.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jButtonSalvar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/lapis_32x32.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTipo2)
                            .addComponent(jLabelTipo1))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTipo4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // Salvar tipo
        float preco;

        if (!"".equals(jTextDescricao.getText())
                && !"".equals(jTextPreco.getText())
                && !"".equals(jTextData.getText())) {

            try {
                preco = Float.parseFloat(jTextPreco.getText().replaceAll(",", "."));

            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null,
                        "O preço deve ser um numero. Ex 1,99", "Erro ao salvar", 2);
                preco = 0;
            }
            Caixa caixa = new Caixa();
            caixa.setDescricao(jTextDescricao.getText());
            caixa.setStatus(true);
            caixa.setPreco(preco);
            caixa.setTipo(tipo);
            caixa.setDataCaixa(jTextData.getText());

            CaixaRN caixaRN = new CaixaRN();
            caixaRN.salvar(caixa);
            this.dispose();
            new FormCaixa().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos vazios.", "Erro ao salvar", 2);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*
         java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new FormCadastro().setVisible(true);
         }
         });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTipo1;
    private javax.swing.JLabel jLabelTipo2;
    private javax.swing.JLabel jLabelTipo3;
    private javax.swing.JLabel jLabelTipo4;
    private javax.swing.JTextField jTextData;
    private javax.swing.JTextField jTextDescricao;
    private javax.swing.JTextField jTextPreco;
    // End of variables declaration//GEN-END:variables
}
