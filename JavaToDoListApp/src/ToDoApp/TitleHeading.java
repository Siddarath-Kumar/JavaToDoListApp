/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoApp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.ImageIcon;
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
        this.setPreferredSize(new Dimension(400,100));
        //this.setBackground(Color.orange);
        
        ImageIcon titleLogo = new ImageIcon(getClass().getResource("/Images/appLogo.png"));

        
        JLabel titleText = new JLabel();
        titleText.setIcon(titleLogo);
        
        JLabel clock = new JLabel("Time, Date will go here");
        
        //titleText.setHorizontalAlignment(JLabel.CENTER);

        /*titleText.setPreferredSize(new Dimension(200,80));
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 24));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        
        Font font = titleText.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        titleText.setFont(font.deriveFont(attributes));*/
        
        this.add(titleText);
        this.add(clock);

    }
    
}
