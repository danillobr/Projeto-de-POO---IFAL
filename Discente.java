
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author paulo
 */
public class Discente extends javax.swing.JFrame {

    /**
     * Creates new form Discente
     */
    public Discente() {
        initComponents();
        //getContentPane().setBackground(Color.green); 
        senha.setText("");
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
        jLabel3 = new javax.swing.JLabel();
        pg = new javax.swing.JButton();
        notas = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        cadastrarAluno = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logar = new javax.swing.JButton();
        rodape = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sistema - cabecalho dis.png"))); // NOI18N

        pg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/b1.png"))); // NOI18N
        pg.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        pg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgActionPerformed(evt);
            }
        });

        notas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/discente-b2.png"))); // NOI18N
        notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notasActionPerformed(evt);
            }
        });

        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/b4.png"))); // NOI18N
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        cadastrarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/doscente-b3.png"))); // NOI18N
        cadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAlunoActionPerformed(evt);
            }
        });

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Usuario :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Senha   :");

        logar.setText("Logar");
        logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarActionPerformed(evt);
            }
        });

        rodape.setFont(new java.awt.Font("Monotype Corsiva", 0, 14)); // NOI18N
        rodape.setForeground(new java.awt.Color(255, 255, 255));
        rodape.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rodape.png"))); // NOI18N
        rodape.setAlignmentX(20.0F);
        rodape.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                rodapeAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        senha.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(senha))
                .addGap(153, 153, 153))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(logar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rodape)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(logar)
                .addGap(18, 18, 18)
                .addComponent(rodape, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rodapeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_rodapeAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_rodapeAncestorAdded

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarActionPerformed
        String login = usuario.getText();
        String Senha = senha.getText();
        AlunoDB a = new AlunoDB();
        this.logado = a.logado(login, Senha);
        usuario.setText("");
        senha.setText("");
        if (logado) {
            JOptionPane.showMessageDialog(null, "Login Realizado com Sucesso!");
            DiscenteLogado dl = new DiscenteLogado();
            dl.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Senha ou Usuario Incorreto! Verifique sua Conta e Tente de Novo!");
        }

    }//GEN-LAST:event_logarActionPerformed

    private void pgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgActionPerformed
        PInicial p = new PInicial();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pgActionPerformed

    private void notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notasActionPerformed
        JOptionPane.showMessageDialog(null, "Faça login para ter acesso!");
    }//GEN-LAST:event_notasActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void cadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAlunoActionPerformed
        CasdatroAlunoAluno a = new CasdatroAlunoAluno();
        a.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_cadastrarAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(Discente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Discente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Discente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Discente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Discente().setVisible(true);
            }
        });
    }

    private boolean logado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logar;
    private javax.swing.JButton notas;
    private javax.swing.JButton pg;
    private javax.swing.JLabel rodape;
    private javax.swing.JButton sair;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
