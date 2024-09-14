/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularjuros;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Leonan
 */
public class JurosSimples extends javax.swing.JFrame {
    public JurosSimples() {
        initComponents();
        setLocationRelativeTo(null); 
        J.setEditable(false);
        M.setEditable(false);
    }
    int tipoJuros = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        capital = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        C = new javax.swing.JTextField();
        I = new javax.swing.JTextField();
        N = new javax.swing.JTextField();
        J = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        M = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ctaxa = new javax.swing.JComboBox<>();
        cp = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calcularjuros/icons8-sales-performance-64.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calcularjuros/icons8-sales-performance-64.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calcularjuros/icons8-receive-cash-64.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 205, 170));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculadora Financeira", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        capital.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        capital.setText("Capital Inicial:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Taxa:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Período:");

        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        J.setForeground(new java.awt.Color(0, 153, 51));
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Juros Simples:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Montante:");

        M.setForeground(new java.awt.Color(0, 153, 51));
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        calcular.setBackground(new java.awt.Color(0, 128, 128));
        calcular.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        calcular.setForeground(new java.awt.Color(255, 255, 255));
        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        Limpar.setBackground(new java.awt.Color(0, 128, 128));
        Limpar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Limpar.setForeground(new java.awt.Color(255, 255, 255));
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setText("Calcular Juros Simples");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Tipo de Taxa:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Tipo Período:");

        ctaxa.setBackground(new java.awt.Color(0, 128, 128));
        ctaxa.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        ctaxa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensal", "Bimestral", "Trimestral", "Semestral", "Anual" }));
        ctaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctaxaActionPerformed(evt);
            }
        });

        cp.setBackground(new java.awt.Color(0, 128, 128));
        cp.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        cp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês", "Bimestre", "Trimestre", "Semestre", "Ano" }));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calcularjuros/icons8-sales-performance-64.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calcularjuros/icons8-sales-performance-64.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calcularjuros/icons8-receive-cash-64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(cp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                    .addComponent(J, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(85, 85, 85))
                    .addComponent(M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(capital)
                            .addGap(75, 75, 75))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(capital)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ctaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Limpar, calcular});

        jMenuBar1.setBackground(new java.awt.Color(0, 128, 128));

        jMenu1.setText("Voltar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        // Juros simples resultado.
    }//GEN-LAST:event_JActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // Botão Limpar:
        C.setText("");
        I.setText("");
        N.setText("");
        M.setText("");
        J.setText("");
    }//GEN-LAST:event_LimparActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // Botão Calcular:
        double c = Double.parseDouble(C.getText());
        double i =Double.parseDouble(I.getText())/100;
        double n =Double.parseDouble(N.getText());
        double Js  = (c*i*n);
        double m = c*(1+i*n);
        String opcion = (String)ctaxa.getSelectedItem();
        
        if(opcion.equals("Mensal")){ // TIPO DE TAXA EX: 2% AO MES.
           //Js = (c*i*n);
           //m = c*(1+i*n);
           switch(cp.getSelectedIndex()){ // PERÍODO A SER PAGO.
               case 0:
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 1:
                  i = i*2;
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 2:
                  i = i*3;
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 3:
                  i = i*6;
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 4:
                  i = i*12;
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                default:
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                JOptionPane.showMessageDialog(null,"Você não escolheu nenhum tipo de período!/n"
                        + "Automaticamente será contado como Mês.");    
                break;
           }
        }
        else if(opcion.equals("Bimestral")){ // TIPO DE TAXA EX: 2% AO MES.
           //Js = (c*i*n);
           //m = c*(1+i*n);
           switch(cp.getSelectedIndex()){ // PERÍODO A SER PAGO.
               case 0: // AO MES
                  i = i/2;
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 1: // AO BIMESTRE
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 2: // AO TRIMESTRE
                  i = (i*1.5);
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 3: // AO SEMESTRE
                  i = (i*3);
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 4: // AO ANO
                  i = (i*6);
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                default:
                  i = i/2;
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  JOptionPane.showMessageDialog(null,"Você não escolheu nenhum tipo de período!/n"
                        + "Automaticamente será contado como Mês.");    
                break;
           }
        }if(opcion.equals("Trimestral")){ // TIPO DE TAXA EX: 2% AO MES.
           //Js = (c*i*n);
           //m = c*(1+i*n);
           switch(cp.getSelectedIndex()){ // PERÍODO A SER PAGO.
               case 0: // AO MES
                  i = i/3;
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 1: // AO BIMESTRE
                  i = (i/1.5);
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 2: // AO TRIMESTRE
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 3: // AO SEMESTRE
                  i = (i*2);
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 4: // AO ANO
                  i = (i*4);
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                default:
                  i = i/3;
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  JOptionPane.showMessageDialog(null,"Você não escolheu nenhum tipo de período!/n"
                        + "Automaticamente será contado como Mês.");    
                  break;
           }
        }else if(opcion.equals("Semestral")){ // TIPO DE TAXA EX: 2% AO MES.
           //Js = (c*i*n);
           //m = c*(1+i*n);
           switch(cp.getSelectedIndex()){ // PERÍODO A SER PAGO.
               case 0: // AO MES
                  i = i/6;
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 1: // AO BIMESTRE
                  i = (i/3);
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 2: // AO TRIMESTRE
                  i = (i/2);
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 3: // AO SEMESTRE
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 4: // AO ANO
                  i = (i*2);
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                default:
                  i = i/6;
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  JOptionPane.showMessageDialog(null,"Você não escolheu nenhum tipo de período!/n"
                        + "Automaticamente será contado como Mês.");    
                  break;
           }
        }if(opcion.equals("Anual")){ // TIPO DE TAXA EX: 2% AO MES.
           //Js = (c*i*n);
           //m = c*(1+i*n);
           switch(cp.getSelectedIndex()){ // PERÍODO A SER PAGO.
               case 0: // AO MES
                  i = i/12;
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 1: // AO BIMESTRE
                  i = (i/6);
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 2: // AO TRIMESTRE
                  i = (i/4);
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 3: // AO SEMESTRE
                  i = (i/2);
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                case 4: // AO ANO
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  break;
                default:
                  i  = i/12;
                  Js = (c*i*n);
                  m = c*(1+i*n); 
                  JOptionPane.showMessageDialog(null,"Você não escolheu nenhum tipo de período!/n"
                        + "Automaticamente será contado como Mês.");    
                  break;  
           }
        }
        J.setText("R$ "+Double.toString(Js));
        M.setText("R$ "+Double.toString(m));
    }//GEN-LAST:event_calcularActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

  
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // BOTÃO VOLTAR
        TelaInicial form = new TelaInicial( );
        form.show( );
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void ctaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctaxaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctaxaActionPerformed

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
            java.util.logging.Logger.getLogger(JurosSimples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JurosSimples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JurosSimples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JurosSimples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JurosSimples().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField C;
    private javax.swing.JTextField I;
    private javax.swing.JTextField J;
    private javax.swing.JButton Limpar;
    private javax.swing.JTextField M;
    private javax.swing.JTextField N;
    private javax.swing.JButton calcular;
    private javax.swing.JLabel capital;
    private javax.swing.JComboBox<String> cp;
    private javax.swing.JComboBox<String> ctaxa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
