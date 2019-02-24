/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L05;

import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author user
 */
public class CenterPanel extends JPanel
{
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    CenterPanel(Group grp, TopPanel topPanel)
    {
        jButton4 = new javax.swing.JButton(); 
        jButton4.addActionListener(new ActionListener()
        {
          @Override
          public void actionPerformed(ActionEvent e)
          {
            grp.member1.semesterGPA();
            jButton4.setText(grp.member1.getInfo());
            topPanel.getavgGPAButton().setText(grp.averageGPA().toString());
          }
        });
        
        jButton5 = new javax.swing.JButton();
        jButton5.addActionListener(new ActionListener()
        {
          @Override
          public void actionPerformed(ActionEvent e)
          {
            grp.member2.semesterGPA();
            jButton5.setText(grp.member2.getInfo());
            topPanel.getavgGPAButton().setText(grp.averageGPA().toString());
          }
        });
        
        jButton6 = new javax.swing.JButton();
        jButton6.addActionListener(new ActionListener()
        {
          @Override
          public void actionPerformed(ActionEvent e)
          {
            grp.member3.semesterGPA();
            jButton6.setText(grp.member3.getInfo());
            topPanel.getavgGPAButton().setText(grp.averageGPA().toString());
          }
        });
        
        jButton7 = new javax.swing.JButton();
        jButton7.addActionListener(new ActionListener()
        {
          @Override
          public void actionPerformed(ActionEvent e)
          {
            grp.member4.semesterGPA();
            jButton7.setText(grp.member4.getInfo());
            topPanel.getavgGPAButton().setText(grp.averageGPA().toString());
          }
        });

        setLayout(new java.awt.GridLayout(4, 0));
        jButton4.setText(grp.member1.getInfo());
        add(jButton4);

        jButton5.setText(grp.member2.getInfo());
        add(jButton5);

        jButton6.setText(grp.member3.getInfo());
        add(jButton6);

        jButton7.setText(grp.member4.getInfo());
        add(jButton7);
    }
}
