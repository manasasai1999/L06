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
public class ControlPanel extends JPanel 
{
    private TopPanel topPanel;
    private CenterPanel centerPanel;
    ControlPanel(Group grp)
    {
        setLayout(new java.awt.BorderLayout(1, 1));
        topPanel = new TopPanel(grp);
        topPanel.setBackground(new java.awt.Color(0, 0, 204));
        topPanel.setPreferredSize(new java.awt.Dimension(590, 45));
        centerPanel = new CenterPanel(grp,topPanel);
        centerPanel.setLayout(new java.awt.GridLayout(4, 0));
        add(topPanel, java.awt.BorderLayout.PAGE_START);
        add(centerPanel, java.awt.BorderLayout.CENTER);
    
    }
    
}
