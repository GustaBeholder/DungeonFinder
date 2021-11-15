/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.gustalemillion.View;

import br.com.gustavolemillion.DAO.JogadorDAO;
import br.com.gustavolemillion.DAO.JogadorMesaDAO;
import br.com.gustavolemillion.DAO.MesaDAO;
import br.com.gustavolemillion.Entity.Jogador;
import br.com.gustavolemillion.Entity.JogadorAtual;
import br.com.gustavolemillion.Entity.Mesa;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */  



public class Main extends javax.swing.JFrame {

    
    private Jogador jogadorAtual;
    private Jogador mestre;
    private Mesa mesaAtual;
    private List<Jogador> listaJogadores;
    private List<Mesa> listaMesas;
    
    public Main() {
        
        initComponents();
        teste();
        atualizaTabela();
        listaM.setSelectedIndex(0);
        atualizaInfos();
        setLocationRelativeTo(this);
    }
    
    private void teste() {
        JogadorDAO jogadorDAO = new JogadorDAO();
        MesaDAO mesaDAO = new MesaDAO();
        listaMesas = mesaDAO.retornaMesas("");
        listaJogadores = jogadorDAO.retornaJogador();
        for(Jogador jogador : listaJogadores){
            if(jogador.getIdJogador() == 41){
                mestre = jogador;
            }
        }
        for(Mesa mesa : listaMesas){
            mesaAtual = mesa ;
        }
        nomeMestre.setText("Mestre: "+mestre.getNome());
        sistema.setText("Sistema: "+ mesaAtual.getSistema());
        descricaoMesa.setText(mesaAtual.getDescricao());
        jogadorAtual = JogadorAtual.getJogador();
        nomeAtual.setText(jogadorAtual.getNome());
    }
    
    private void atualizaTabela() {
        MesaDAO mesaDAO = new MesaDAO();
        listaMesas = mesaDAO.retornaMesas("");

        //PARA LISTA
        DefaultListModel<String> modelo = new DefaultListModel<>();
        listaM.setModel(modelo);

        listaM.removeAll();

        if (listaMesas.isEmpty()) {
            return;
        }

        for (int i = 0; i < listaMesas.size(); i++) {
            modelo.addElement(listaMesas.get(i).getTitulo());
        }

    }
    
    private void atualizaInfos(){
        MesaDAO mesaDAO = new MesaDAO();
        Integer selecionada = listaM.getSelectedIndex();
        mesaAtual = listaMesas.get(selecionada);
        mestre = mesaDAO.getMestre(mesaAtual);
        sistema.setText("Sistema: "+ mesaAtual.getSistema());
        descricaoMesa.setText(mesaAtual.getDescricao());
        nomeMestre.setText("Mestre: "+mestre.getNome());
    
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
        nomeMestre = new javax.swing.JLabel();
        descricaoMesa = new javax.swing.JLabel();
        sistema = new javax.swing.JLabel();
        participar = new javax.swing.JButton();
        nomeAtual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaM = new javax.swing.JList<>();
        criaMesabtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(214, 36, 69));

        jPanel1.setBackground(new java.awt.Color(214, 36, 69));

        nomeMestre.setText("Nome do Mestre");
        nomeMestre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        descricaoMesa.setText("Descrição da Mesa");
        descricaoMesa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        sistema.setText("Sistema");
        sistema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        participar.setText("Participar");
        participar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                participarMouseClicked(evt);
            }
        });
        participar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participarActionPerformed(evt);
            }
        });

        nomeAtual.setBackground(new java.awt.Color(250, 250, 250));
        nomeAtual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nomeAtual.setText("Jogador Atual");
        nomeAtual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listaM.setBackground(new java.awt.Color(250, 250, 250));
        listaM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listaM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listaM.setForeground(new java.awt.Color(214, 36, 69));
        listaM.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaM);

        criaMesabtn.setText("Criar Mesa");
        criaMesabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criaMesabtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mesas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomeMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(criaMesabtn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel1)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(descricaoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addComponent(participar)))))
                        .addContainerGap(72, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(descricaoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(participar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(criaMesabtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criaMesabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criaMesabtnActionPerformed
        CriarMesa next = new CriarMesa();
        this.setVisible(false);
        next.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_criaMesabtnActionPerformed

    private void listaMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMMouseClicked
        atualizaInfos();
    }//GEN-LAST:event_listaMMouseClicked

    private void participarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participarActionPerformed

    }//GEN-LAST:event_participarActionPerformed

    private void participarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_participarMouseClicked
        JogadorMesaDAO adcionaDAO = new JogadorMesaDAO();
        adcionaDAO.adicionaJogadorMesa(jogadorAtual, mesaAtual);
        JOptionPane.showMessageDialog(this, "Você entrou na mesa!", "Mesa", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_participarMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton criaMesabtn;
    private javax.swing.JLabel descricaoMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaM;
    private javax.swing.JLabel nomeAtual;
    private javax.swing.JLabel nomeMestre;
    private javax.swing.JButton participar;
    private javax.swing.JLabel sistema;
    // End of variables declaration//GEN-END:variables
}
