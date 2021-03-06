/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Siddarath
 */
public class ApplicationFrame extends JFrame{
    
    private TitleHeading titleBar;
    private ListOfTasks list;
    private FooterButtonPanel buttonPanel;
    
    private JButton addTasksBtn;
    private JButton clearTasksBtn;
    
    public static int tasksAdded = 0;
    
    // Constructor
    ApplicationFrame()
    {
        this.setSize(500,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        titleBar = new TitleHeading();
        list = new ListOfTasks();
        buttonPanel = new FooterButtonPanel();
        
        addTasksBtn = buttonPanel.getAddTask();
        clearTasksBtn = buttonPanel.getClearTask();
        
        Color lightYellowBg = new Color(255,255,153);
        
        titleBar.setBackground(lightYellowBg);
        list.setBackground(lightYellowBg);
        buttonPanel.setBackground(lightYellowBg);
        
        addListeners();
        
        this.add(titleBar, BorderLayout.NORTH);
        this.add(list, BorderLayout.CENTER);
        this.add(buttonPanel,BorderLayout.SOUTH);
        
        setIconImage(new ImageIcon(getClass().getResource("/Images/checklistWindowLogo.png")).getImage());
        
        this.setVisible(true);
    }
    
    public void addListeners()
    {
        addTasksBtn.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                
                if (tasksAdded <10)
                {
                    ToDoTask task = new ToDoTask();
                    list.add(task);
                    tasksAdded++;
                    list.updateListIndex();

                    task.getTaskDoneBtn().addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mousePressed(MouseEvent e)
                        {
                            if(task.isTickOff == true) // want to tick task
                            {
                                task.changeTaskToComplete();
                                task.changeToTickedIcon();
                                //revalidate();
                            }
                            else if(task.isTickOn == true) // want to untick task
                            {
                                task.changeToUntickedIcon();
                                task.changeTaskToIncomplete();
                                //revalidate();
                            }
                        }
                    });
                    revalidate(); 
                }
                else
                {
                    JOptionPane.showMessageDialog(new JFrame(), "Cannot add more than 10 tasks at a time!", "Selection Warning", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Cannot add more than 10 tasks");
                }  
            }
        }); 
        
        clearTasksBtn.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent e)
            {   
                list.checkForDoneTasks(); // call method which will go through to check if there is any tasks which can be cleared
                
                if (ToDoTask.clearableTasks == true)
                {
                    System.out.println("Tasks can be cleared!");
                    
                    int userConfirmation = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to remove these tasks?");
                    
                    if (userConfirmation == JOptionPane.YES_OPTION)
                    {
                        System.out.println("As confirmed by the user, the clearable tasks will be removed");
                        list.removeDoneTasks();
                        repaint(); 
                    }
                    else
                    {
                        System.out.println("The user has selected no, the tasks will not be deleted!");
                    }  
                }
                else
                {
                    // add pop gui box stating user cannot clear tasks as none are selected as done
                    JOptionPane.showMessageDialog(new JFrame(), "Cannot clear tasks since there is no done tasks!", "Selection Warning", JOptionPane.WARNING_MESSAGE);
                    System.out.println("Cannot clear tasks since there is no done tasks!");
                }
                
                ToDoTask.clearableTasks = false; // After clearing done tasks if any set clearableTasks boolean back to false            
            }
        });
    }
}
