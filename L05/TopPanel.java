/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L05;

import javax.swing.JPanel;
/**
 *
 * @author user
 */
public class TopPanel extends JPanel
{
    // Variables declaration - do not modify  
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    
    public javax.swing.JButton getavgGPAButton() 
    {
       return this.jButton3;
    }
    TopPanel(Group grp)
    {
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1.setText(grp.name);
        jButton2.setText("Group Average GPA is ");
        jButton3.setText(grp.averageGPA().toString());
        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(this);
        setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButton1)
                .addGap(113, 113, 113)
                .addComponent(jButton2)
                .addGap(72, 72, 72)
                .addComponent(jButton3)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );
    }
}
