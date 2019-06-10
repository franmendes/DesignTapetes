package designtapetes;

import java.util.Arrays;

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
        lblClienteCPF = new javax.swing.JLabel();
        txtClienteCPF = new javax.swing.JTextField();
        lblClienteNome = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        lblClienteSobrenome = new javax.swing.JLabel();
        txtClienteSobrenome = new javax.swing.JTextField();
        btnClienteCadastrar = new javax.swing.JButton();
        btnClienteEditar = new javax.swing.JButton();
        btnClienteExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClienteLista = new javax.swing.JTable();
        pnlPedidos = new javax.swing.JPanel();
        btnBackPedidos = new javax.swing.JButton();
        lblPedidoCPF = new javax.swing.JLabel();
        cboxPedidoCPF = new javax.swing.JComboBox<>();
        lblPedidoForma = new javax.swing.JLabel();
        cboxPedidoForma = new javax.swing.JComboBox<>();
        lblPedidoDim1 = new javax.swing.JLabel();
        txtPedidoDim1 = new javax.swing.JTextField();
        lblPedidoDim2 = new javax.swing.JLabel();
        txtPedidoDim2 = new javax.swing.JTextField();
        lblPedidoArea = new javax.swing.JLabel();
        txtPedidoArea = new javax.swing.JTextField();
        lblPedidoMaterial = new javax.swing.JLabel();
        cboxPedidoMaterial = new javax.swing.JComboBox<>();
        btnPedidoAdicionar = new javax.swing.JButton();
        btnPedidoEditar = new javax.swing.JButton();
        btnPedidoExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPedidoLista = new javax.swing.JTable();
        lblPedidoTotal = new javax.swing.JLabel();
        lblPedidoValor = new javax.swing.JLabel();
        pnlPrecos = new javax.swing.JPanel();
        btnBackPrecos = new javax.swing.JButton();
        cboxMaterialTipo = new javax.swing.JComboBox<>();
        lblMaterialTipo = new javax.swing.JLabel();
        lblMaterialPreco = new javax.swing.JLabel();
        txtMaterialPreco = new javax.swing.JTextField();
        lblMaterialPrecoUnit = new javax.swing.JLabel();
        btnMaterialPrecoAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setLocationByPlatform(true);
        setName("frameDesignTapetes"); // NOI18N

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

        pnlMenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 200));

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

        lblClienteCPF.setLabelFor(txtClienteCPF);
        lblClienteCPF.setText("CPF: ");

        lblClienteNome.setLabelFor(txtClienteNome);
        lblClienteNome.setText("Nome: ");

        lblClienteSobrenome.setLabelFor(txtClienteSobrenome);
        lblClienteSobrenome.setText("Sobrenome: ");

        btnClienteCadastrar.setText("Cadastrar");
        btnClienteCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteCadastrarActionPerformed(evt);
            }
        });

        btnClienteEditar.setText("Editar");

        btnClienteExcluir.setText("Excluir");

        tblClienteLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Sobrenome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClienteLista);

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClienteCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnClienteEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnClienteExcluir))
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBackClientes)
                            .addGroup(pnlClientesLayout.createSequentialGroup()
                                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblClienteSobrenome)
                                    .addComponent(lblClienteNome)
                                    .addComponent(lblClienteCPF))
                                .addGap(59, 59, 59)
                                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtClienteCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                    .addComponent(txtClienteSobrenome)
                                    .addComponent(txtClienteNome, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackClientes)
                .addGap(18, 18, 18)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteCPF)
                    .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteNome)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteSobrenome)
                    .addComponent(txtClienteSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClienteCadastrar)
                    .addComponent(btnClienteEditar)
                    .addComponent(btnClienteExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlContent.add(pnlClientes, "card4");

        btnBackPedidos.setText("← VOLTAR");
        btnBackPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackPedidosActionPerformed(evt);
            }
        });

        lblPedidoCPF.setText("CPF Cliente: ");

        cboxPedidoCPF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Cliente>" }));

        lblPedidoForma.setText("Forma Tapete: ");

        cboxPedidoForma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione a Forma>", "Circulo", "Triangulo", "Retangulo" }));

        lblPedidoDim1.setText("Dimensão 1: ");

        lblPedidoDim2.setText("Dimensão 2: ");

        lblPedidoArea.setText("Area: ");

        lblPedidoMaterial.setText("Material Tapete: ");

        cboxPedidoMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Material>", "Comum", "Luxo", "Premium" }));

        btnPedidoAdicionar.setText("Adicionar Item");

        btnPedidoEditar.setText("Editar Item");

        btnPedidoExcluir.setText("Remover Item");

        tblPedidoLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Forma", "Material", "Tamanho", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPedidoLista);

        lblPedidoTotal.setFont(new java.awt.Font("Mirum Sans", 0, 24)); // NOI18N
        lblPedidoTotal.setText("Total do pedido: ");

        lblPedidoValor.setFont(new java.awt.Font("Mirum Sans", 0, 24)); // NOI18N
        lblPedidoValor.setText("R$ 0,00");

        javax.swing.GroupLayout pnlPedidosLayout = new javax.swing.GroupLayout(pnlPedidos);
        pnlPedidos.setLayout(pnlPedidosLayout);
        pnlPedidosLayout.setHorizontalGroup(
            pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPedidosLayout.createSequentialGroup()
                        .addComponent(lblPedidoCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboxPedidoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPedidosLayout.createSequentialGroup()
                        .addComponent(lblPedidoForma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboxPedidoForma, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPedidosLayout.createSequentialGroup()
                        .addComponent(lblPedidoDim1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPedidoDim1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPedidosLayout.createSequentialGroup()
                        .addComponent(lblPedidoDim2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPedidoDim2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPedidosLayout.createSequentialGroup()
                        .addComponent(lblPedidoArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPedidoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPedidosLayout.createSequentialGroup()
                        .addComponent(lblPedidoMaterial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboxPedidoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPedidosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPedidoAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPedidoEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPedidoExcluir))
                    .addGroup(pnlPedidosLayout.createSequentialGroup()
                        .addComponent(btnBackPedidos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlPedidosLayout.createSequentialGroup()
                        .addComponent(lblPedidoTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPedidoValor)))
                .addContainerGap())
        );
        pnlPedidosLayout.setVerticalGroup(
            pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackPedidos)
                .addGap(18, 18, 18)
                .addGroup(pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedidoCPF)
                    .addComponent(cboxPedidoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedidoMaterial)
                    .addComponent(cboxPedidoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedidoForma)
                    .addComponent(cboxPedidoForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedidoDim1)
                    .addComponent(txtPedidoDim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedidoDim2)
                    .addComponent(txtPedidoDim2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedidoArea)
                    .addComponent(txtPedidoArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPedidoExcluir)
                    .addComponent(btnPedidoEditar)
                    .addComponent(btnPedidoAdicionar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedidoTotal)
                    .addComponent(lblPedidoValor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlContent.add(pnlPedidos, "card5");

        btnBackPrecos.setText("← VOLTAR");
        btnBackPrecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackPrecosActionPerformed(evt);
            }
        });

        cboxMaterialTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Material>", "Comum", "Luxo", "Premium" }));
        cboxMaterialTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMaterialTipoActionPerformed(evt);
            }
        });

        lblMaterialTipo.setText("Material: ");

        lblMaterialPreco.setText("Preço");

        lblMaterialPrecoUnit.setText("R$");

        btnMaterialPrecoAtualizar.setText("Atualizar");
        btnMaterialPrecoAtualizar.setAlignmentX(0.5F);
        btnMaterialPrecoAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaterialPrecoAtualizar.setMargin(new java.awt.Insets(10, 15, 10, 15));
        btnMaterialPrecoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaterialPrecoAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrecosLayout = new javax.swing.GroupLayout(pnlPrecos);
        pnlPrecos.setLayout(pnlPrecosLayout);
        pnlPrecosLayout.setHorizontalGroup(
            pnlPrecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrecosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrecosLayout.createSequentialGroup()
                        .addComponent(lblMaterialTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboxMaterialTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrecosLayout.createSequentialGroup()
                        .addComponent(btnBackPrecos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrecosLayout.createSequentialGroup()
                        .addComponent(lblMaterialPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(lblMaterialPrecoUnit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaterialPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMaterialPrecoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlPrecosLayout.setVerticalGroup(
            pnlPrecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrecosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackPrecos)
                .addGap(18, 18, 18)
                .addGroup(pnlPrecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxMaterialTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaterialTipo))
                .addGap(18, 18, 18)
                .addGroup(pnlPrecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaterialPreco)
                    .addComponent(txtMaterialPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaterialPrecoUnit))
                .addGap(138, 138, 138)
                .addComponent(btnMaterialPrecoAtualizar)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pnlContent.add(pnlPrecos, "card3");

        getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public Cliente[] clientes;
    
    public Material comum = new Material(2.0, "Comum");
    public Material luxo = new Material(3.0, "Luxo");
    public Material premium = new Material(4.0, "Premium");
    public Material selectedMaterial;
    
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

    private void cboxMaterialTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMaterialTipoActionPerformed
        String material = (String)cboxMaterialTipo.getSelectedItem();
        switch(material){
            case "Comum" :
                selectedMaterial = comum;
                break;
            case "Luxo" :
                selectedMaterial = luxo;
                break;
            case "Premium" :
                selectedMaterial = premium;
                break;
            default :
                selectedMaterial = null;
        }
        if (selectedMaterial != null){
            txtMaterialPreco.setText(Double.toString(selectedMaterial.getPrecoPorArea()));
        } else {
            txtMaterialPreco.setText("");
        }
    }//GEN-LAST:event_cboxMaterialTipoActionPerformed

    private void btnMaterialPrecoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaterialPrecoAtualizarActionPerformed
        double novoPreco = Double.parseDouble(txtMaterialPreco.getText());
        selectedMaterial.setPrecoPorArea(novoPreco);
    }//GEN-LAST:event_btnMaterialPrecoAtualizarActionPerformed

    private void btnClienteCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteCadastrarActionPerformed
        Cliente novoCliente = new Cliente(txtClienteNome.getText(), txtClienteSobrenome.getText(), txtClienteCPF.getText());
        Cliente[] aux = null;
        if (clientes != null){
            aux = clientes.clone();
            clientes = new Cliente[clientes.length + 1];
        } else {
            clientes = new Cliente[1];
        }        
        if (aux != null ){
            System.arraycopy(aux, 0, clientes, 0, aux.length);
        }
        clientes[clientes.length - 1] = new Cliente (novoCliente.getNome(), novoCliente.getSobrenome(), novoCliente.getCpf());
        
        String[] rows = {"CPF", "Nome", "Sobrenome"};
        javax.swing.table.DefaultTableModel tableClientes = new javax.swing.table.DefaultTableModel(rows, 0);
        for (Cliente cliente : clientes) {
            Object[] clientesAux = {cliente.getCpf(), cliente.getNome(), cliente.getSobrenome()};
            tableClientes.addRow(clientesAux);
        }
        tblClienteLista = new javax.swing.JTable(tableClientes);
        
        String[] cpfs = new String[clientes.length + 1];
        cpfs[0] = "<Selecione o Cliente>";
        for (int j = 0; j < clientes.length; j++){            
            cpfs[(j + 1)] = clientes[j].getCpf();
        }
        cboxPedidoCPF.setModel(new javax.swing.DefaultComboBoxModel(cpfs));
        
        txtClienteNome.setText("");
        txtClienteSobrenome.setText("");
        txtClienteCPF.setText("");
        
    }//GEN-LAST:event_btnClienteCadastrarActionPerformed

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
    private javax.swing.JButton btnClienteCadastrar;
    private javax.swing.JButton btnClienteEditar;
    private javax.swing.JButton btnClienteExcluir;
    private javax.swing.JButton btnMaterialPrecoAtualizar;
    private javax.swing.JButton btnMenuCliente;
    private javax.swing.JButton btnMenuPedido;
    private javax.swing.JButton btnMenuPreco;
    private javax.swing.JButton btnPedidoAdicionar;
    private javax.swing.JButton btnPedidoEditar;
    private javax.swing.JButton btnPedidoExcluir;
    private javax.swing.JComboBox<String> cboxMaterialTipo;
    private javax.swing.JComboBox<String> cboxPedidoCPF;
    private javax.swing.JComboBox<String> cboxPedidoForma;
    private javax.swing.JComboBox<String> cboxPedidoMaterial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClienteCPF;
    private javax.swing.JLabel lblClienteNome;
    private javax.swing.JLabel lblClienteSobrenome;
    private javax.swing.JLabel lblMaterialPreco;
    private javax.swing.JLabel lblMaterialPrecoUnit;
    private javax.swing.JLabel lblMaterialTipo;
    private javax.swing.JLabel lblPedidoArea;
    private javax.swing.JLabel lblPedidoCPF;
    private javax.swing.JLabel lblPedidoDim1;
    private javax.swing.JLabel lblPedidoDim2;
    private javax.swing.JLabel lblPedidoForma;
    private javax.swing.JLabel lblPedidoMaterial;
    private javax.swing.JLabel lblPedidoTotal;
    private javax.swing.JLabel lblPedidoValor;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPedidos;
    private javax.swing.JPanel pnlPrecos;
    private javax.swing.JTable tblClienteLista;
    private javax.swing.JTable tblPedidoLista;
    private javax.swing.JTextField txtClienteCPF;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JTextField txtClienteSobrenome;
    private javax.swing.JTextField txtMaterialPreco;
    private javax.swing.JTextField txtPedidoArea;
    private javax.swing.JTextField txtPedidoDim1;
    private javax.swing.JTextField txtPedidoDim2;
    // End of variables declaration//GEN-END:variables
}
