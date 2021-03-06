package designtapetes;

import java.util.ArrayList;
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

        btnClienteCadastrar.setText("Salvar");
        btnClienteCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteCadastrarActionPerformed(evt);
            }
        });

        btnClienteEditar.setText("Editar");
        btnClienteEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteEditarActionPerformed(evt);
            }
        });

        btnClienteExcluir.setText("Excluir");
        btnClienteExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteExcluirActionPerformed(evt);
            }
        });

        tblClienteLista.setModel(clienteModel);
        tblClienteLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteListaMouseClicked(evt);
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
        cboxPedidoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPedidoCPFActionPerformed(evt);
            }
        });

        lblPedidoForma.setText("Forma Tapete: ");

        cboxPedidoForma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione a Forma>", "Circulo", "Triangulo", "Retangulo" }));
        cboxPedidoForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPedidoFormaActionPerformed(evt);
            }
        });

        lblPedidoDim1.setText("Dimensão 1 (m) : ");

        txtPedidoDim1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPedidoDim1KeyReleased(evt);
            }
        });

        lblPedidoDim2.setText("Dimensão 2 (m) : ");

        txtPedidoDim2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPedidoDim2KeyReleased(evt);
            }
        });

        lblPedidoArea.setText("Area (m²) :  ");

        txtPedidoArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPedidoAreaKeyReleased(evt);
            }
        });

        lblPedidoMaterial.setText("Material Tapete: ");

        cboxPedidoMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Material>", "Comum", "Luxo", "Premium" }));
        cboxPedidoMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPedidoMaterialActionPerformed(evt);
            }
        });

        btnPedidoAdicionar.setText("Adicionar Item");
        btnPedidoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoAdicionarActionPerformed(evt);
            }
        });

        btnPedidoEditar.setText("Editar Item");
        btnPedidoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoEditarActionPerformed(evt);
            }
        });

        btnPedidoExcluir.setText("Remover Item");

        tblPedidoLista.setModel(pedidoModel);
        tblPedidoLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPedidoListaMouseClicked(evt);
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
    
    public Pedido[] pedidos;
    public Cliente[] clientes;
    public Tapete[] tapetes;
    
    public Cliente clientePedido;
    public Material materialPedido;
    public Forma selectedForma;
    public Pedido pedidoPedido;
    
    public Material comum = new Material(2.0, "Comum");
    public Material luxo = new Material(3.0, "Luxo");
    public Material premium = new Material(4.0, "Premium");
    public Material selectedMaterial;
    
    TabelaCliente clienteModel = new TabelaCliente();
    TabelaPedido pedidoModel = new TabelaPedido();
    
    public int selectedRow = -1;
    
    public void switchPanels(javax.swing.JPanel panel){
        pnlContent.removeAll();
        pnlContent.add(panel);
        pnlContent.repaint();
        pnlContent.revalidate();
    }
    
    public void calcArea(javax.swing.JTextField txtFieldTyped){
        if(!(txtFieldTyped.getText()).isEmpty()){
            double dim1, dim2;
            if((txtPedidoDim1.getText()).isEmpty()){
                dim1 = 0.0;
            } else {
                dim1 = Double.parseDouble(txtPedidoDim1.getText());
            }
            if((txtPedidoDim2.getText()).isEmpty()){
                dim2 = 0.0;
            } else {
                dim2 = Double.parseDouble(txtPedidoDim2.getText());
            }
            txtPedidoArea.setText(Double.toString(selectedForma.calcArea(dim1, dim2)));
        } else {
            txtPedidoArea.setText("");
        }
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
        
        clienteModel.adicionaContato(novoCliente);
        
        tblClienteLista.setModel(clienteModel);
        
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

    private void tblClienteListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteListaMouseClicked
        selectedRow = tblClienteLista.getSelectedRow();
        txtClienteCPF.setText(clientes[selectedRow].getCpf());
        txtClienteNome.setText(clientes[selectedRow].getNome());
        txtClienteSobrenome.setText(clientes[selectedRow].getSobrenome());
    }//GEN-LAST:event_tblClienteListaMouseClicked

    private void btnClienteEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteEditarActionPerformed
        clientes[selectedRow].setCpf(txtClienteCPF.getText());
        clientes[selectedRow].setNome(txtClienteNome.getText());
        clientes[selectedRow].setSobrenome(txtClienteSobrenome.getText());
        
        ArrayList<Cliente> list = new ArrayList(Arrays.asList(clientes));
        clienteModel.atualizarTabela(list);
        tblClienteLista.setModel(clienteModel);
        
        txtClienteNome.setText("");
        txtClienteSobrenome.setText("");
        txtClienteCPF.setText("");
        selectedRow = -1;
    }//GEN-LAST:event_btnClienteEditarActionPerformed

    private void btnClienteExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteExcluirActionPerformed
        if(selectedRow == -1){
            return;
        }
        for(int i = selectedRow; i < (clientes.length - 1); i++){
            clientes[i].setCpf(clientes[i+1].getCpf());
            clientes[i].setNome(clientes[i+1].getNome());
            clientes[i].setSobrenome(clientes[i+1].getSobrenome());
        }
        
        Cliente[] aux = Arrays.copyOf(clientes, clientes.length-1);
        clientes = aux.clone();
            
        ArrayList<Cliente> list = new ArrayList(Arrays.asList(clientes));
        clienteModel.atualizarTabela(list);
        tblClienteLista.setModel(clienteModel);
        
        txtClienteNome.setText("");
        txtClienteSobrenome.setText("");
        txtClienteCPF.setText("");
        selectedRow = -1;
    }//GEN-LAST:event_btnClienteExcluirActionPerformed

    private void cboxPedidoFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPedidoFormaActionPerformed
        String forma = (String)cboxPedidoForma.getSelectedItem();
        switch(forma){
            case "Circulo" :
                selectedForma = new FCirculo();
                lblPedidoDim1.setText("Raio (m) :");
                txtPedidoDim2.setText("0.0");
                break;
            case "Triangulo" :
                selectedForma = new FTriangulo();
                lblPedidoDim1.setText("Base (m) :");
                lblPedidoDim2.setText("Altura (m) :");
                break;
            case "Retangulo" :
                selectedForma = new FRetangulo();
                lblPedidoDim1.setText("Largura (m) :");
                lblPedidoDim2.setText("Altura (m) :");
                break;
            default :
                selectedForma = null;
                lblPedidoDim1.setText("Dimensão 1 (m) :");
                lblPedidoDim2.setText("Dimensão 2 (m) :");
        }
        txtPedidoDim1.setText("");
        txtPedidoDim2.setText("");
        txtPedidoArea.setText("");        
    }//GEN-LAST:event_cboxPedidoFormaActionPerformed

    private void txtPedidoDim1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoDim1KeyReleased
        calcArea(txtPedidoDim1);
    }//GEN-LAST:event_txtPedidoDim1KeyReleased

    private void txtPedidoDim2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoDim2KeyReleased
        calcArea(txtPedidoDim2);
    }//GEN-LAST:event_txtPedidoDim2KeyReleased

    private void txtPedidoAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoAreaKeyReleased
        double area, dim;
        if (!txtPedidoArea.getText().isEmpty()){
            area = Double.parseDouble(txtPedidoArea.getText());
            dim = selectedForma.calcDimensions(area);
            txtPedidoDim1.setText(Double.toString(dim));
            if(!"Circulo".equals(selectedForma.getNome())){
                txtPedidoDim2.setText(Double.toString(dim));
            }
        } else {
            txtPedidoDim1.setText("");
            txtPedidoDim2.setText("");
        }
    }//GEN-LAST:event_txtPedidoAreaKeyReleased

    private void btnPedidoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoAdicionarActionPerformed
        Tapete tapetePedido = new Tapete(materialPedido, selectedForma);
        tapetePedido.getForma().setArea(tapetePedido.getForma().calcArea(Double.parseDouble(txtPedidoDim1.getText()), Double.parseDouble(txtPedidoDim2.getText())));
        tapetePedido.setPreco(tapetePedido.calcPreco());
        
        Tapete[] aux = null;
        if (tapetes != null){
            aux = tapetes.clone();
            tapetes = new Tapete[tapetes.length + 1];
        } else {
            tapetes = new Tapete[1];
        }        
        if (aux != null ){
            System.arraycopy(aux, 0, tapetes, 0, aux.length);
        }
        tapetes[tapetes.length - 1] = new Tapete (tapetePedido.getMaterial(), tapetePedido.getForma());
        
        pedidoPedido.setTapetes(tapetes);
        
        ArrayList<Tapete> list = new ArrayList(Arrays.asList(pedidoPedido.getTapetes()));
        pedidoModel.atualizarTabela(list);
        tblPedidoLista.setModel(pedidoModel);
        
        double total = 0;
        for(Tapete tapete : tapetes){
            total += tapete.getPreco();
        }
        
        lblPedidoValor.setText("R$ " + total);
        
        cboxPedidoMaterial.setSelectedIndex(0);
        cboxPedidoForma.setSelectedIndex(0);
        txtPedidoDim1.setText("");
        txtPedidoDim2.setText("");
        txtPedidoArea.setText("");
    }//GEN-LAST:event_btnPedidoAdicionarActionPerformed

    private void cboxPedidoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPedidoCPFActionPerformed
        String cpf = (String)cboxPedidoCPF.getSelectedItem();
        int indexCliente = -1, indexPedido = -1;
        if(!cpf.isEmpty()){
            for (int i = 0; i < clientes.length; i++){
                if(clientes[i].getCpf().equals(cpf)){
                    indexCliente = i;
                }
            }
            if (indexCliente >= 0){
                clientePedido = new Cliente(clientes[indexCliente].getNome(), clientes[indexCliente].getSobrenome(), clientes[indexCliente].getCpf());
            } else {
                clientePedido = null;
            }
        } else {
            clientePedido = null;
        }
        if (clientePedido != null){
            if(pedidos != null) {
                for (int i = 0; i < pedidos.length; i++){
                    if(pedidos[i].getCliente().getCpf().equals(clientePedido.getCpf())){
                        indexPedido = i;
                    }
                }
            }
        }
        if (indexPedido >= 0){
            pedidoPedido = pedidos[indexPedido];
            ArrayList<Tapete> list = new ArrayList(Arrays.asList(pedidoPedido.getTapetes()));
            pedidoModel.atualizarTabela(list);
            tblPedidoLista.setModel(pedidoModel);
        } else {
            pedidoPedido = new Pedido(clientePedido);
            ArrayList<Tapete> list = new ArrayList();
            pedidoModel.atualizarTabela(list);
            tblPedidoLista.setModel(pedidoModel);
        }
    }//GEN-LAST:event_cboxPedidoCPFActionPerformed

    private void cboxPedidoMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPedidoMaterialActionPerformed
        String material = (String)cboxPedidoMaterial.getSelectedItem();
        switch (material){
            case "Comum" :
                materialPedido = new Material(comum.getPrecoPorArea(), comum.getTipoMaterial());
                break;
            case "Luxo":
                materialPedido = new Material(luxo.getPrecoPorArea(), luxo.getTipoMaterial());
                break;
            case "Premium" :
                materialPedido = new Material(premium.getPrecoPorArea(), premium.getTipoMaterial());
                break;
            default :
                materialPedido = null;
        }
    }//GEN-LAST:event_cboxPedidoMaterialActionPerformed

    private void tblPedidoListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPedidoListaMouseClicked
        selectedRow = tblPedidoLista.getSelectedRow();
        cboxPedidoMaterial.setSelectedItem(tapetes[selectedRow].getMaterial().getTipoMaterial());
        cboxPedidoForma.setSelectedItem(tapetes[selectedRow].getForma().getNome());
        txtPedidoDim1.setText(Double.toString(tapetes[selectedRow].getForma().calcDimensions(tapetes[selectedRow].getForma().getArea())));
        txtPedidoDim2.setText(Double.toString(tapetes[selectedRow].getForma().calcDimensions(tapetes[selectedRow].getForma().getArea())));
        txtPedidoArea.setText(Double.toString(tapetes[selectedRow].getForma().getArea()));
    }//GEN-LAST:event_tblPedidoListaMouseClicked

    private void btnPedidoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoEditarActionPerformed
        tapetes[selectedRow] = new Tapete(materialPedido, selectedForma);
        tapetes[selectedRow].getForma().setArea(tapetes[selectedRow].getForma().calcArea(Double.parseDouble(txtPedidoDim1.getText()), Double.parseDouble(txtPedidoDim2.getText())));
        tapetes[selectedRow].setPreco(tapetes[selectedRow].calcPreco());
        
        ArrayList<Cliente> list = new ArrayList(Arrays.asList(clientes));
        clienteModel.atualizarTabela(list);
        tblClienteLista.setModel(clienteModel);
        
        txtClienteNome.setText("");
        txtClienteSobrenome.setText("");
        txtClienteCPF.setText("");
        selectedRow = -1;
    }//GEN-LAST:event_btnPedidoEditarActionPerformed

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
