/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoApp;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Siddarath
 */
public class ListOfTasks extends JPanel{
    
    ListOfTasks()
    {
       GridLayout tasksLayout = new GridLayout(10,1); // 10 rows and 1 column grid
       tasksLayout.setVgap(5); // Vertical gap of 5 
        
       this.setLayout(tasksLayout);
       
        
    }
    
    
}
