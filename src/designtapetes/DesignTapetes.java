package designtapetes;

/**
 *
 * @author eweber
 */
public class DesignTapetes extends javax.swing.JFrame {
    
    public DesignTapetes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        btnMenuCliente = new javax.swing.JButton();
        btnMenuPedido = new javax.swing.JButton();
        btnMenuPreco = new javax.swing.JButton();
        pnlClientes = new javax.swing.JPanel();
        btnBackClientes = new javax.swing.JButton();
        pnlPedidos = new javax.swing.JPanel();
        btnBackPedidos = new javax.swing.JButton();
        pnlPrecos = new javax.swing.JPanel();
        btnBackPrecos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Mirum Sans", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("DesignTapetes");
        lblTitle.setAlignmentX(0.5F);
        lblTitle.setFocusable(false);
        lblTitle.setMaximumSize(new java.awt.Dimension(159, 45));
        lblTitle.setMinimumSize(new java.awt.Dimension(159, 45));
        lblTitle.setPreferredSize(new java.awt.Dimension(159, 45));
        getContentPane().add(lblTitle, java.awt.BorderLayout.PAGE_START);

        pnlContent.setLayout(new java.awt.CardLayout());

        pnlMenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 110));

        btnMenuCliente.setText("Cadastrar Cliente");
        btnMenuCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenuCliente.setMargin(new java.awt.Insets(10, 5, 10, 5));
        btnMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuClienteActionPerformed(evt);
            }
        });
        pnlMenu.add(btnMenuCliente);

        btnMenuPedido.setText("Realizar Pedido");
        btnMenuPedido.setMargin(new java.awt.Insets(10, 5, 10, 5));
        btnMenuPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPedidoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnMenuPedido);

        btnMenuPreco.setText("Atualizar Preços");
        btnMenuPreco.setMargin(new java.awt.Insets(10, 5, 10, 5));
        btnMenuPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrecoActionPerformed(evt);
            }
        });
        pnlMenu.add(btnMenuPreco);

        pnlContent.add(pnlMenu, "card2");

        btnBackClientes.setText("← VOLTAR");
        btnBackClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackClientes)
                .addContainerGap(402, Short.MAX_VALUE))
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackClientes)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        pnlContent.add(pnlClientes, "card4");

        btnBackPedidos.setText("← VOLTAR");
        btnBackPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPedidosLayout = new javax.swing.GroupLayout(pnlPedidos);
        pnlPedidos.setLayout(pnlPedidosLayout);
        pnlPedidosLayout.setHorizontalGroup(
            pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackPedidos)
                .addContainerGap(402, Short.MAX_VALUE))
        );
        pnlPedidosLayout.setVerticalGroup(
            pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackPedidos)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        pnlContent.add(pnlPedidos, "card5");

        btnBackPrecos.setText("← VOLTAR");
        btnBackPrecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackPrecosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrecosLayout = new javax.swing.GroupLayout(pnlPrecos);
        pnlPrecos.setLayout(pnlPrecosLayout);
        pnlPrecosLayout.setHorizontalGroup(
            pnlPrecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrecosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackPrecos)
                .addContainerGap(402, Short.MAX_VALUE))
        );
        pnlPrecosLayout.setVerticalGroup(
            pnlPrecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrecosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackPrecos)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        pnlContent.add(pnlPrecos, "card3");

        getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    public void switchPanels(javax.swing.JPanel panel){
        pnlContent.removeAll();
        pnlContent.add(panel);
        pnlContent.repaint();
        pnlContent.revalidate();
    }
    
    private void btnBackClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackClientesActionPerformed
        switchPanels(pnlMenu);
    }//GEN-LAST:event_btnBackClientesActionPerformed

    private void btnBackPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackPedidosActionPerformed
        switchPanels(pnlMenu);
    }//GEN-LAST:event_btnBackPedidosActionPerformed

    private void btnBackPrecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackPrecosActionPerformed
        switchPanels(pnlMenu);
    }//GEN-LAST:event_btnBackPrecosActionPerformed

    private void btnMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuClienteActionPerformed
        switchPanels(pnlClientes);
    }//GEN-LAST:event_btnMenuClienteActionPerformed

    private void btnMenuPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPedidoActionPerformed
        switchPanels(pnlPedidos);
    }//GEN-LAST:event_btnMenuPedidoActionPerformed

    private void btnMenuPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrecoActionPerformed
        switchPanels(pnlPrecos);
    }//GEN-LAST:event_btnMenuPrecoActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesignTapetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DesignTapetes().setVisible(true);
        });
        
        //code
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackClientes;
    private javax.swing.JButton btnBackPedidos;
    private javax.swing.JButton btnBackPrecos;
    private javax.swing.JButton btnMenuCliente;
    private javax.swing.JButton btnMenuPedido;
    private javax.swing.JButton btnMenuPreco;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPedidos;
    private javax.swing.JPanel pnlPrecos;
    // End of variables declaration//GEN-END:variables
}
