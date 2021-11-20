/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoApp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Siddarath
 */
public class FooterButtonPanel extends JPanel{
    
    private JButton addTaskBtn;
    private JButton clearTaskBtn;
    
    //Border emptyBorder = BorderFactory.createEmptyBorder();
    
    // Constructor
    FooterButtonPanel()
    {
        this.setPreferredSize(new Dimension(400,60));
        this.setBackground(Color.LIGHT_GRAY);
        
        addTaskBtn = new JButton("Add Task");
        //addTaskBtn.setBorder(emptyBorder);
        addTaskBtn.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        
        clearTaskBtn = new JButton("Clear Done Tasks");
        //addTaskBtn.setBorder(emptyBorder);
        clearTaskBtn.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        
        this.add(addTaskBtn);
        this.add(Box.createHorizontalStrut(20));
        this.add(clearTaskBtn);
    }
    
    public JButton getAddTask()
    {
        return addTaskBtn;
    }
    
    public JButton getClearTask()
    {
        return clearTaskBtn;
    }
    
    
}
