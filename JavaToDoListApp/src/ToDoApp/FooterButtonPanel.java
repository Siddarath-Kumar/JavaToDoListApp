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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Siddarath
 */
public class FooterButtonPanel extends JPanel{
    
    private JButton addTaskBtn;
    private JButton clearTaskBtn;
        
    // Constructor
    FooterButtonPanel()
    {
        this.setPreferredSize(new Dimension(400,100));
        this.setBackground(Color.LIGHT_GRAY);
        
        ImageIcon addTasksIcon = new ImageIcon(getClass().getResource("/Images/addTaskIcon.png"));
        ImageIcon removeTasksIcon = new ImageIcon(getClass().getResource("/Images/removeTaskIcon.png"));

        addTaskBtn = new JButton("Add Task", addTasksIcon);
        addTaskBtn.setFont(new Font("Sans Serif", Font.BOLD, 18));
        addTaskBtn.setPreferredSize(new Dimension(170,48));
        addTaskBtn.setBackground(Color.orange);
        
        clearTaskBtn = new JButton("Clear Tasks", removeTasksIcon);
        clearTaskBtn.setFont(new Font("Sans Serif", Font.BOLD, 18));
        clearTaskBtn.setPreferredSize(new Dimension(200, 48));
        clearTaskBtn.setBackground(Color.PINK);


        this.add(Box.createVerticalStrut(90));
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
