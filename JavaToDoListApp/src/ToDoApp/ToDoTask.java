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
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

/**
 *
 * @author Siddarath
 */
public class ToDoTask extends JPanel {
    
    private JLabel taskIndex;
    private JTextField nameOfTask;
    private JButton taskDoneBtn;
    
    private boolean isTaskCompleted;
    public static boolean clearableTasks;
    
    public boolean isTickOn;
    public boolean isTickOff;
    
    Color whiteBGtaskColor = new Color(255,255,255);
    
    // Constructor
    ToDoTask()
    {
        this.setPreferredSize(new Dimension(40,20));
        this.setLayout(new BorderLayout());
        this.setBackground(whiteBGtaskColor);
        
        isTaskCompleted = false;
        
        taskIndex = new JLabel("");
        taskIndex.setPreferredSize(new Dimension(30,20));
        taskIndex.setFont(new Font("Sans-serif", Font.PLAIN, 18));
        taskIndex.setHorizontalAlignment(JLabel.CENTER);
        taskIndex.setBackground(whiteBGtaskColor);
        taskIndex.setBorder(new LineBorder(Color.RED, 1));

        nameOfTask = new JTextField(" Enter task here...");
        nameOfTask.setFont(new Font("Sans-serif", Font.PLAIN, 18));
        nameOfTask.setBorder(BorderFactory.createEmptyBorder());
        nameOfTask.setBackground(whiteBGtaskColor);
        nameOfTask.setBorder(new LineBorder(Color.BLACK, 1));
        
        taskDoneBtn = new JButton();
        changeToUntickedIcon();
        taskDoneBtn.setPreferredSize(new Dimension(40,20));
        taskDoneBtn.setBorder(BorderFactory.createEmptyBorder());
        taskDoneBtn.setToolTipText("Click this button to tick/untick in order to indicate the status of the task");
        
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
    
    public void changeTaskToComplete()
    {
        Color greenDoneBG = new Color(102,255,102); // light green background color
        
        this.setBackground(greenDoneBG);
        nameOfTask.setBackground(greenDoneBG);
        isTaskCompleted = true;
        //clearableTasks = true;
    }
    
    public void changeTaskToIncomplete()
    {
        this.setBackground(whiteBGtaskColor);
        nameOfTask.setBackground(whiteBGtaskColor);
        isTaskCompleted = false;
        //clearableTasks = false;
    }
    
    public boolean getTaskStatus()
    {
        return isTaskCompleted;
    }
    
    public void changeToTickedIcon()
    {
        ImageIcon tickedBox = new ImageIcon(getClass().getResource("/Images/tickedBox.png"));
        taskDoneBtn.setIcon(tickedBox);
        taskDoneBtn.setBackground(Color.GREEN);
        isTickOn = true;
        isTickOff = false;
        
    }
    
    public void changeToUntickedIcon()
    {
        ImageIcon untickedBox = new ImageIcon(getClass().getResource("/Images/emptyCheckBox.png"));
        taskDoneBtn.setIcon(untickedBox);
        taskDoneBtn.setBackground(Color.lightGray);
        //taskDoneBtn.setBackground(UIManager.getColor("Button.background")); // Default background color of button
        isTickOn = false;
        isTickOff = true;
    }
}
