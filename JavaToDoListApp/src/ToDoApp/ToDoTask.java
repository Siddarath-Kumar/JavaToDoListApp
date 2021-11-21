/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
        Color whiteBGtaskColor = new Color(255,255,255);
        
        this.setPreferredSize(new Dimension(40,20));
        this.setLayout(new BorderLayout());
        this.setBackground(whiteBGtaskColor);
        
        isTaskCompleted = false;
        
        taskIndex = new JLabel("");
        taskIndex.setPreferredSize(new Dimension(20,20));
        taskIndex.setFont(new Font("Sans-serif", Font.PLAIN, 18));
        taskIndex.setHorizontalAlignment(JLabel.CENTER);
        taskIndex.setBackground(whiteBGtaskColor);
        
        nameOfTask = new JTextField("Enter task here...");
        nameOfTask.setFont(new Font("Sans-serif", Font.PLAIN, 18));
        nameOfTask.setBorder(BorderFactory.createEmptyBorder());
        nameOfTask.setBackground(whiteBGtaskColor);
        
        taskDoneBtn = new JButton("Done");
        taskDoneBtn.setPreferredSize(new Dimension(40,20));
        taskDoneBtn.setBorder(BorderFactory.createEmptyBorder());
        
        this.add(taskIndex, BorderLayout.WEST);
        this.add(nameOfTask, BorderLayout.CENTER);
        this.add(taskDoneBtn, BorderLayout.EAST);

    }
    
    public JButton getTaskDoneBtn()
    {
        return taskDoneBtn;
    }
    
    public void changeListIndex(int indexNumber)
    {
        this.taskIndex.setText(indexNumber + "");
        this.revalidate();
    }
    
    public void changeTaskStatus()
    {
        Color greenDoneBG = new Color(102,255,102); // light green background color
        
        this.setBackground(greenDoneBG);
        nameOfTask.setBackground(greenDoneBG);
        isTaskCompleted = true;
    }
    
    public boolean getTaskStatus()
    {
        return isTaskCompleted;
    }
    
}
