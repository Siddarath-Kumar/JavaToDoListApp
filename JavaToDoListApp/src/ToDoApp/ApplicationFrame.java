/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoApp;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Siddarath
 */
public class ApplicationFrame extends JFrame{
    
    private TitleHeading titleBar;
    private ListOfTasks list;
    private FooterButtonPanel buttonPanel;
    
    
    // Constructor
    ApplicationFrame()
    {
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        titleBar = new TitleHeading();
        list = new ListOfTasks();
        buttonPanel = new FooterButtonPanel();
        
        this.add(titleBar, BorderLayout.NORTH);
        this.add(buttonPanel,BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
    
}
