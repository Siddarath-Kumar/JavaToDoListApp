/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoApp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Siddarath
 */
public class TitleHeading extends JPanel {
    
    //JLabel titleText;
    
    // Constructor
    TitleHeading()
    {
        this.setPreferredSize(new Dimension(400,80));
        //this.setBackground(Color.orange);
        
        JLabel titleText = new JLabel("My To Do List");
        titleText.setPreferredSize(new Dimension(200,80));
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 24));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        
        this.add(titleText);
    }
    
}
