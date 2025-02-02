/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author aluno
 */
public class Clicar extends javax.swing.JFrame {

    int dinheiro = 0, mouse = 1;
    private int geracaoS;
    
    Timer tm;
    boolean rodando = false;
    private long lastTime = System.currentTimeMillis(); 
    private final Runnable gameCycle;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    
    
    ArrayList<Item> processadoresTem;
    ArrayList<Item> placaVideoTem;
    ArrayList<Item> placaMaeTem;
    ArrayList<Item> ramTem;
    Item[] processadoresLoja;
    Item[] placaVideoLoja;
    Item[] placaMaeLoja;
    Item[] ramLoja;
    
    
    public Clicar() {
        // Cria o invetário das peças
        processadoresTem = new ArrayList<>();
        placaVideoTem = new ArrayList<>();
        placaMaeTem = new ArrayList<>();
        ramTem = new ArrayList<>();
        
        // Geração inicial
        geracaoS = 0;
        
        // Inicia os componentes gráficos
        initComponents();
        
        // Define os itens da loja
        ramLoja = new Item[3];
        ramLoja[0] = ConstrutorPecasPadrao.RAM("DDR3 2GB", 10, 1, btRAM1);
        ramLoja[1] = ConstrutorPecasPadrao.RAM("DDR3 4GB", 20, 2, btRAM2);
        ramLoja[2] = ConstrutorPecasPadrao.RAM("DDR3 8GB", 50, 4, btRAM3);
        
        // Define o ciclo do jogo
        lastTime = System.currentTimeMillis();
        this.gameCycle = new Runnable() {
            @Override
            public void run() {
                atualizarDinheiro();
 
                // Calcula deltaT
                long currentTime = System.currentTimeMillis();
                long deltaT = currentTime - lastTime;
                long deltaTSegundos = (long) (deltaT / 1000.0);
                int milisegundosSobrando = (int) (deltaT % 1000);
 
 
                long geracao =  geracaoS * deltaTSegundos;
 
                dinheiro += geracao;
 
                lastTime = System.currentTimeMillis() - milisegundosSobrando;
            }
        };
        scheduler.scheduleAtFixedRate(gameCycle, 0, 16, TimeUnit.MILLISECONDS);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Trabalho = new javax.swing.JPanel();
        botaoDinheiro = new javax.swing.JButton();
        txtDinheiro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Loja = new javax.swing.JPanel();
        txtDinheiroLoja = new javax.swing.JLabel();
        AbasPecas = new javax.swing.JTabbedPane();
        AbaProcessador = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        btProcessadori5 = new javax.swing.JButton();
        AbaPlacaDeVideo = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btPlacaDeVideo = new javax.swing.JButton();
        AbaPlacaMae = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        AbaRam = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        btRAM1 = new javax.swing.JButton();
        btRAM2 = new javax.swing.JButton();
        btRAM3 = new javax.swing.JButton();
        btRAM4 = new javax.swing.JButton();
        btRAM5 = new javax.swing.JButton();
        btRAM6 = new javax.swing.JButton();
        AbaMouse = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        btMouseGamer = new javax.swing.JButton();
        AbaTeclado = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        btTeclado1 = new javax.swing.JButton();
        PC = new javax.swing.JPanel();
        labelMonitor = new javax.swing.JLabel();
        labelTeclado = new javax.swing.JLabel();
        btGabinete = new javax.swing.JButton();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoDinheiro.setBackground(new java.awt.Color(153, 255, 51));
        botaoDinheiro.setText("DIN DIN");
        botaoDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDinheiroActionPerformed(evt);
            }
        });
        botaoDinheiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoDinheiroKeyPressed(evt);
            }
        });

        txtDinheiro.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 14)); // NOI18N
        txtDinheiro.setText("Dinheiro: 0");
        txtDinheiro.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtDinheiroPropertyChange(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout TrabalhoLayout = new javax.swing.GroupLayout(Trabalho);
        Trabalho.setLayout(TrabalhoLayout);
        TrabalhoLayout.setHorizontalGroup(
            TrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrabalhoLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addGroup(TrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDinheiro))
                .addGap(277, 277, 277))
            .addGroup(TrabalhoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(TrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TrabalhoLayout.setVerticalGroup(
            TrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrabalhoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(64, 64, 64)
                .addComponent(botaoDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(119, 119, 119))
        );

        jTabbedPane1.addTab("TRABALHO", Trabalho);

        txtDinheiroLoja.setFont(new java.awt.Font("DejaVu Serif Condensed", 0, 14)); // NOI18N
        txtDinheiroLoja.setText("Dinheiro: 0");
        txtDinheiroLoja.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtDinheiroLojaPropertyChange(evt);
            }
        });

        btProcessadori5.setText("PROCESSADOR I5 R$200");
        btProcessadori5.setToolTipText("Aumenta o valor do Click em +1!");
        btProcessadori5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btProcessadori5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProcessadori5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btProcessadori5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btProcessadori5)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        AbaProcessador.setViewportView(jPanel2);

        AbasPecas.addTab("PROCESSADOR", AbaProcessador);

        btPlacaDeVideo.setText("PLACA DE VIDEO R$10");
        btPlacaDeVideo.setToolTipText("Gera R$1 por segundo!");
        btPlacaDeVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlacaDeVideoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btPlacaDeVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btPlacaDeVideo)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        AbaPlacaDeVideo.setViewportView(jPanel1);

        AbasPecas.addTab("PLACA DE VIDEO", AbaPlacaDeVideo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );

        AbaPlacaMae.setViewportView(jPanel3);

        AbasPecas.addTab("PLACA MÃE", AbaPlacaMae);

        btRAM1.setText("btRam1");
        btRAM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRAM1ActionPerformed(evt);
            }
        });

        btRAM2.setText("jButton1");
        btRAM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRAM2ActionPerformed(evt);
            }
        });

        btRAM3.setText("btRam1");
        btRAM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRAM3ActionPerformed(evt);
            }
        });

        btRAM4.setText("btRam1");
        btRAM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRAM4ActionPerformed(evt);
            }
        });

        btRAM5.setText("btRam1");
        btRAM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRAM5ActionPerformed(evt);
            }
        });

        btRAM6.setText("btRam1");
        btRAM6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRAM6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btRAM1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(btRAM2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btRAM3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRAM4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btRAM5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRAM6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRAM1)
                    .addComponent(btRAM2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRAM3)
                    .addComponent(btRAM4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRAM5)
                    .addComponent(btRAM6))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        AbaRam.setViewportView(jPanel4);

        AbasPecas.addTab("RAM", AbaRam);

        btMouseGamer.setText("MOUSE GAMER R$50");
        btMouseGamer.setToolTipText("Aumenta o valor do Click em +1!");
        btMouseGamer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMouseGamerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btMouseGamer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(340, 340, 340))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btMouseGamer)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        AbaMouse.setViewportView(jPanel5);

        AbasPecas.addTab("MOUSE", AbaMouse);

        btTeclado1.setText("TECLADO R$100");
        btTeclado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTeclado1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btTeclado1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btTeclado1)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        AbaTeclado.setViewportView(jPanel6);

        AbasPecas.addTab("TECLADO", AbaTeclado);

        javax.swing.GroupLayout LojaLayout = new javax.swing.GroupLayout(Loja);
        Loja.setLayout(LojaLayout);
        LojaLayout.setHorizontalGroup(
            LojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LojaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AbasPecas)
                .addContainerGap())
            .addGroup(LojaLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(txtDinheiroLoja)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LojaLayout.setVerticalGroup(
            LojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LojaLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(txtDinheiroLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AbasPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("LOJA", Loja);

        labelMonitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogo/imagens/monitor.png"))); // NOI18N

        labelTeclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogo/imagens/teclado.png"))); // NOI18N

        btGabinete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogo/imagens/Gabinete.png"))); // NOI18N
        btGabinete.setToolTipText("Clique para abrir o pc");
        btGabinete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGabineteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PCLayout = new javax.swing.GroupLayout(PC);
        PC.setLayout(PCLayout);
        PCLayout.setHorizontalGroup(
            PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(labelMonitor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGabinete)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(PCLayout.createSequentialGroup()
                .addComponent(labelTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PCLayout.setVerticalGroup(
            PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGabinete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("PC", PC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGabineteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGabineteActionPerformed
        new Gabinete(this, processadoresTem, placaVideoTem, placaMaeTem, ramTem).setVisible(true);
    }//GEN-LAST:event_btGabineteActionPerformed

    private void btTeclado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTeclado1ActionPerformed
        // TODO add your handling code here:
        if (dinheiro >= 10){
            dinheiro = dinheiro - 10;
            JOptionPane.showMessageDialog(rootPane, "compra realizada");
            btTeclado1.setVisible(false);

        }
    }//GEN-LAST:event_btTeclado1ActionPerformed

    private void btPlacaDeVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlacaDeVideoActionPerformed
        
    }//GEN-LAST:event_btPlacaDeVideoActionPerformed

    private void txtDinheiroLojaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtDinheiroLojaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDinheiroLojaPropertyChange

    private void btMouseGamerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMouseGamerActionPerformed
        if (dinheiro >= 50){
            mouse = 2;
            dinheiro = dinheiro - 50;
            JOptionPane.showMessageDialog(rootPane, "compra realizada");
            btMouseGamer.setVisible(false);
        }
    }//GEN-LAST:event_btMouseGamerActionPerformed

    private void txtDinheiroPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtDinheiroPropertyChange

    }//GEN-LAST:event_txtDinheiroPropertyChange

    private void botaoDinheiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoDinheiroKeyPressed
        // TODO add your handling code here:
        botaoDinheiro.doClick();
    }//GEN-LAST:event_botaoDinheiroKeyPressed

    private void botaoDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDinheiroActionPerformed

        dinheiro = dinheiro + mouse;

        String labelText = String.format("Dinheiro: R$%d", dinheiro);
        txtDinheiro.setText(labelText);
        txtDinheiroLoja.setText(labelText);
    }//GEN-LAST:event_botaoDinheiroActionPerformed

    private void btProcessadori5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcessadori5ActionPerformed
        // TODO add your handling code here:
        if (dinheiro >= 200){
            dinheiro = dinheiro - 200;
            JOptionPane.showMessageDialog(rootPane, "compra realizada");
            btProcessadori5.setVisible(false);
        }
    }//GEN-LAST:event_btProcessadori5ActionPerformed

    private void btRAM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRAM1ActionPerformed
        comprar(ramLoja[0], ramTem, btRAM1);
    }//GEN-LAST:event_btRAM1ActionPerformed

    private void btRAM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRAM2ActionPerformed
        comprar(ramLoja[1], ramTem, btRAM2);
    }//GEN-LAST:event_btRAM2ActionPerformed

    private void btRAM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRAM3ActionPerformed
        comprar(ramLoja[1], ramTem, btRAM3);
    }//GEN-LAST:event_btRAM3ActionPerformed

    private void btRAM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRAM4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRAM4ActionPerformed

    private void btRAM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRAM5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRAM5ActionPerformed

    private void btRAM6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRAM6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRAM6ActionPerformed

    public void atualizarDinheiro(){
        String labelText = String.format("Dinheiro: R$%d", dinheiro);
        txtDinheiro.setText(labelText);
        txtDinheiroLoja.setText(labelText);
        
    }

    public void setGeracaoS(int geracaoS) {
        this.geracaoS = geracaoS;
    }
    
    private void comprar(Item item, ArrayList lista, javax.swing.JButton botao) {
        if (dinheiro >= item.getCusto()){
            dinheiro -= item.getCusto();
            botao.setVisible(false);
            lista.add(item);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Clicar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clicar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clicar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clicar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clicar().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AbaMouse;
    private javax.swing.JScrollPane AbaPlacaDeVideo;
    private javax.swing.JScrollPane AbaPlacaMae;
    private javax.swing.JScrollPane AbaProcessador;
    private javax.swing.JScrollPane AbaRam;
    private javax.swing.JScrollPane AbaTeclado;
    private javax.swing.JTabbedPane AbasPecas;
    private javax.swing.JPanel Loja;
    private javax.swing.JPanel PC;
    private javax.swing.JPanel Trabalho;
    private javax.swing.JButton botaoDinheiro;
    private javax.swing.JButton btGabinete;
    private javax.swing.JButton btMouseGamer;
    private javax.swing.JButton btPlacaDeVideo;
    private javax.swing.JButton btProcessadori5;
    private javax.swing.JButton btRAM1;
    private javax.swing.JButton btRAM2;
    private javax.swing.JButton btRAM3;
    private javax.swing.JButton btRAM4;
    private javax.swing.JButton btRAM5;
    private javax.swing.JButton btRAM6;
    private javax.swing.JButton btTeclado1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelMonitor;
    private javax.swing.JLabel labelTeclado;
    private javax.swing.JLabel txtDinheiro;
    private javax.swing.JLabel txtDinheiroLoja;
    // End of variables declaration//GEN-END:variables
}
