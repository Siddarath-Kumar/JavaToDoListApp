/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Siddarath
 */
public class ToDoTask extends JPanel {
    
    private JLabel taskIndex;
    private JTextField nameOfTask;
    private JButton taskDoneBtn;
    
    private boolean isTaskCompleted;
    
    // Constructor
    ToDoTask()
    {
        this.setPreferredSize(new Dimension(40,20));
        this.setLayout(new BorderLayout());
        
        isTaskCompleted = false;
        
        taskIndex = new JLabel("");
        taskIndex.setPreferredSize(new Dimension(20,20));
        taskIndex.setHorizontalAlignment(JLabel.CENTER);
        
        nameOfTask = new JTextField("Enter task here...");
        nameOfTask.setBorder(BorderFactory.createEmptyBorder());
        nameOfTask.setBackground(Color.yellow);
        
        taskDoneBtn = new JButton("Done");
        taskDoneBtn.setPreferredSize(new Dimension(40,20));
        taskDoneBtn.setBorder(BorderFactory.createEmptyBorder());
        
        this.add(taskIndex, BorderLayout.WEST);
        this.add(nameOfTask, BorderLayout.CENTER);
        this.add(taskDoneBtn, BorderLayout.EAST);

    }
    
    public void changeListIndex(int indexNumber)
    {
        this.taskIndex.setText(indexNumber + "");
        this.revalidate();
    }
    
}
