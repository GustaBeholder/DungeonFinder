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
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Aluno
 */
public class InfoMesas extends javax.swing.JFrame {
     
    private List<Mesa> listaMesas;
    private Jogador jogadorAtual = JogadorAtual.getJogador();
    private List<Jogador> listaJogadores;
    private Mesa mesaAtual = new Mesa("Carregando...", "Carregando...", jogadorAtual.getIdJogador() ,"Carregando...");
    /**
     * Creates new form InfoMesas
     */
    public InfoMesas() {
        initComponents();
        carregaInicio();
        atualizaTabela();
        //atualizaTabelaJogadores();
        listaMM.setSelectedIndex(0);
        //listPlayers.setSelectedIndex(0);
        atualizaInfos();
        setLocationRelativeTo(this);
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
        nomeAtual = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nomeMestre = new javax.swing.JLabel();
        sistema = new javax.swing.JLabel();
        descricaoMesa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMM = new javax.swing.JList<>();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(214, 36, 69));

        nomeAtual.setBackground(new java.awt.Color(250, 250, 250));
        nomeAtual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nomeAtual.setText("Jogador Atual");
        nomeAtual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Minhas mesas");

        nomeMestre.setText("Nome do Mestre");
        nomeMestre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        sistema.setText("Sistema");
        sistema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        descricaoMesa.setText("Descri????o da Mesa");
        descricaoMesa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listaMM.setBackground(new java.awt.Color(250, 250, 250));
        listaMM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listaMM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listaMM.setForeground(new java.awt.Color(214, 36, 69));
        listaMM.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaMM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMMMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaMM);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeAtual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descricaoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nomeMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(descricaoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaMMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMMMouseClicked
        atualizaInfos();
    }//GEN-LAST:event_listaMMMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Main next = new Main();
        this.setVisible(false);
        next.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
    
    private void atualizaInfos(){
        MesaDAO mesaDAO = new MesaDAO();
        Integer selecionada = listaMM.getSelectedIndex();
        mesaAtual = listaMesas.get(selecionada);
        jogadorAtual = mesaDAO.getMestre(mesaAtual);
        sistema.setText("Sistema: "+ mesaAtual.getSistema());
        descricaoMesa.setText(mesaAtual.getDescricao());
        nomeMestre.setText("Mestre: "+jogadorAtual.getNome());
    
    }
    
    private void carregaInicio() {
        
        nomeMestre.setText("Mestre: "+jogadorAtual.getNome());
        sistema.setText("Sistema: "+ mesaAtual.getSistema());
        descricaoMesa.setText(mesaAtual.getDescricao());
        nomeAtual.setText(jogadorAtual.getNome());
    }   
    private void atualizaTabela() {
        MesaDAO mesaDAO = new MesaDAO();
        JogadorMesaDAO jogadorMesaDAO = new JogadorMesaDAO();
        List<Mesa> mesas = new ArrayList<>();
        mesas = jogadorMesaDAO.retornaMesaJogo(jogadorAtual.getIdJogador());
        listaMesas = mesaDAO.retornaMesasMestre(jogadorAtual.getIdJogador());
        for(Mesa mesa : mesas){
            listaMesas.add(mesa);
        }
        //PARA LISTA
        DefaultListModel<String> modelo = new DefaultListModel<>();
        listaMM.setModel(modelo);

        listaMM.removeAll();

        if (listaMesas.isEmpty()) {
            return;
        }

        for (int i = 0; i < listaMesas.size(); i++) {
            modelo.addElement(listaMesas.get(i).getTitulo());
        }

    }
    
    /*private void atualizaTabelaJogadores() {
        JogadorMesaDAO jogadorMesaDAO = new JogadorMesaDAO();
        listaJogadores = jogadorMesaDAO.retornaJogadoresMesa(mesaAtual.getIdMesa());

        //PARA LISTA
        DefaultListModel<String> modelo = new DefaultListModel<>();
        listPlayers.setModel(modelo);

        listPlayers.removeAll();

        if (listaJogadores.isEmpty()) {
            return;
        }

        for (int i = 0; i < listaJogadores.size(); i++) {
            modelo.addElement(listaJogadores.get(i).getNome());
        }

    }*/
    
    
    
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
            java.util.logging.Logger.getLogger(InfoMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoMesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel descricaoMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaMM;
    private javax.swing.JLabel nomeAtual;
    private javax.swing.JLabel nomeMestre;
    private javax.swing.JLabel sistema;
    // End of variables declaration//GEN-END:variables
}
