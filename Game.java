
package cross_and_knots;
import javax.swing.ImageIcon;

public class Game extends javax.swing.JFrame {

    ImageIcon X = new ImageIcon(this.getClass().getResource("X.png"));
    ImageIcon O = new ImageIcon(this.getClass().getResource("O.png"));
    private int turn = 1;
    private int[] flag = {10,11,12,13,14,15,16,17,18};
    
    public Game() {
        initComponents();
        disable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("New Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Player 1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("Player 2");

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel1.setText("Winner");

        jButton11.setText("Start");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel2.setText("Turn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    turn++;
    jLabel2.setText(""+turn);
    jButton5.setEnabled(false);
    if(turn%2==0)
    {
        flag[1]=1;
        jButton5.setIcon(X);
    }
    else
    {
        flag[1]=0;
        jButton5.setIcon(O);
    }
    if(turn>9)
    {
        disable();
    }
    victory();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    turn++;
    jLabel2.setText(""+turn);
    jButton6.setEnabled(false);
    if(turn%2==0)
    {
        jButton6.setIcon(X);
        flag[4]=1;
    }
    else
    {
        flag[4]=0;
        jButton6.setIcon(O);
    }
    if(turn>9)
    {
        disable();
    }
    victory();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    turn++;
    jLabel2.setText(""+turn);
    jButton9.setEnabled(false);
    if(turn%2==0)
    {
        jButton9.setIcon(X);
        flag[5]=1;
    }
    else
    {
        flag[5]=0;
        jButton9.setIcon(O);
    }
    if(turn>9)
    {
        disable();
    }
    victory();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        turn=1;
        jLabel1.setText("Winner");
        flag[0]=10;
        flag[1]=11;
        flag[2]=12;
        flag[3]=13;
        flag[4]=14;
        flag[5]=15;
        flag[6]=16;
        flag[7]=17;
        flag[8]=18;
        jButton2.setEnabled(true);
        jButton2.setIcon(null);
        jButton5.setEnabled(true);
        jButton5.setIcon(null);
        jButton8.setEnabled(true);
        jButton8.setIcon(null);
        jButton3.setEnabled(true);
        jButton3.setIcon(null);
        jButton6.setEnabled(true);
        jButton6.setIcon(null);
        jButton9.setEnabled(true);
        jButton9.setIcon(null);
        jButton4.setEnabled(true);
        jButton4.setIcon(null);
        jButton7.setEnabled(true);
        jButton7.setIcon(null);
        jButton10.setEnabled(true);
        jButton10.setIcon(null);
        disable();
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
        jTextField1.setText("Player 1");
        jTextField2.setText("Player 2");
        jButton11.setEnabled(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    jButton11.setEnabled(false);
    jTextField1.setEnabled(false);
    jTextField2.setEnabled(false);
    jButton2.setEnabled(true);
    jButton3.setEnabled(true);
    jButton4.setEnabled(true);        
    jButton5.setEnabled(true);
    jButton6.setEnabled(true);
    jButton7.setEnabled(true);
    jButton8.setEnabled(true);
    jButton9.setEnabled(true);
    jButton10.setEnabled(true);
    jLabel2.setEnabled(true);
    jLabel2.setText(""+turn);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    turn++;
    jLabel2.setText(""+turn);
    jButton2.setEnabled(false);
    if(turn%2==0)
    {
        flag[0]=1;
        jButton2.setIcon(X);
    }
    else
    {
        flag[0]=0;
        jButton2.setIcon(O);
    }
    if(turn>9)
    {
        disable();
    }
    victory();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    turn++;
    jLabel2.setText(""+turn);
    jButton8.setEnabled(false);
    if(turn%2==0)
    {
        jButton8.setIcon(X);
        flag[2]=1;
    }
    else
    {
        flag[2]=0;
        jButton8.setIcon(O);
    }
    if(turn>9)
    {
        disable();
    }
    victory();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    turn++;
    jLabel2.setText(""+turn);
    jButton3.setEnabled(false);
    if(turn%2==0)
    {
        jButton3.setIcon(X);
        flag[3]=1;
    }
    else
    {
        flag[3]=0;
        jButton3.setIcon(O);
    }
    if(turn>9)
    {
        disable();
    }
    victory();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    turn++;
    jLabel2.setText(""+turn);
    jButton4.setEnabled(false);
    if(turn%2==0)
    {
        jButton4.setIcon(X);
        flag[6]=1;
    }
    else
    {
        flag[6]=0;
        jButton4.setIcon(O);
    }
    if(turn>9)
    {
        disable();
    }
    victory();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    turn++;
    jLabel2.setText(""+turn);
    jButton7.setEnabled(false);
    if(turn%2==0)
    {
        jButton7.setIcon(X);
        flag[7]=1;
    }
    else
    {
        flag[7]=0;
        jButton7.setIcon(O);
    }
    if(turn>9)
    {
        disable();
    }        
    victory();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    turn++;
    jLabel2.setText(""+turn);
    jButton10.setEnabled(false);
    if(turn%2==0)
    {
        flag[8]=1;
        jButton10.setIcon(X);
    }
    else
    {
        flag[8]=0;
        jButton10.setIcon(O);
    }
    if(turn>9)
    {
        disable();
    }
    victory();
    }//GEN-LAST:event_jButton10ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }
    public void disable()
    {
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jLabel1.setEnabled(false);
        jLabel2.setEnabled(false);
        
     }
    public void victory()
    {
        jLabel1.setEnabled(true);
        
        if(flag[0]==flag[1]&&flag[0]==flag[2])
        {
            if(flag[0]==0)
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField2.getText());
                disable();
                jLabel1.setEnabled(true);
            }
            else
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField1.getText());
                disable();
                jLabel1.setEnabled(true);
            }
        }
        if(flag[3]==flag[4]&&flag[3]==flag[5])
        {
            if(flag[3]==0)
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField2.getText());
                disable();
                jLabel1.setEnabled(true);
            }
            else
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField1.getText());
                disable();
                jLabel1.setEnabled(true);
            }
        }
        if(flag[6]==flag[7]&&flag[6]==flag[8])
        {
            if(flag[6]==0)
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField2.getText());
                disable();
                jLabel1.setEnabled(true);
            }
            else
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField1.getText());
                disable();
                jLabel1.setEnabled(true);
            }
        }
        if(flag[0]==flag[3]&&flag[0]==flag[6])
        {
            if(flag[0]==0)
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField2.getText());
                disable();
                jLabel1.setEnabled(true);
            }
            else
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField1.getText());
                disable();
                jLabel1.setEnabled(true);
            }
        }
        if(flag[1]==flag[4]&&flag[1]==flag[7])
        {
            if(flag[1]==0)
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField2.getText());
                disable();
                jLabel1.setEnabled(true);
            }
            else
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField1.getText());
                disable();
                jLabel1.setEnabled(true);
            }
        }
        if(flag[2]==flag[5]&&flag[2]==flag[8])
        {
            if(flag[2]==0)
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField2.getText());
                disable();
                jLabel1.setEnabled(true);
            }
            else
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField1.getText());
                disable();
                jLabel1.setEnabled(true);
            }
        }
        if(flag[0]==flag[4]&&flag[0]==flag[8])
        {
            if(flag[0]==0)
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField2.getText());
                disable();
                jLabel1.setEnabled(true);
            }
            else
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField1.getText());
                disable();
                jLabel1.setEnabled(true);
            }
        }
        if(flag[2]==flag[4]&&flag[2]==flag[6])
        {
            if(flag[2]==0)
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField2.getText());
                disable();
                jLabel1.setEnabled(true);
            }
            else
            {
                jLabel1.setEnabled(true);
                jLabel1.setText(jTextField1.getText());
                disable();
                jLabel1.setEnabled(true);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
