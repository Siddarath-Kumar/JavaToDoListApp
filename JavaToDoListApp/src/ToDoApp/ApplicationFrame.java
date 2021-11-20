/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoApp;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

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
    
    // Constructor
    ApplicationFrame()
    {
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        titleBar = new TitleHeading();
        list = new ListOfTasks();
        buttonPanel = new FooterButtonPanel();
        
        addTasksBtn = buttonPanel.getAddTask();
        clearTasksBtn = buttonPanel.getClearTask();
        
        addListeners();
        
        this.add(titleBar, BorderLayout.NORTH);
        this.add(list, BorderLayout.CENTER);
        this.add(buttonPanel,BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
    
    public void addListeners()
    {
        addTasksBtn.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                ToDoTask task = new ToDoTask();
                list.add(task);
                list.updateListIndex();
                
                task.getTaskDoneBtn().addMouseListener(new MouseAdapter()
                {
                    @Override
                    public void mousePressed(MouseEvent e)
                    {
                        task.changeTaskStatus();
                        revalidate();
                    }
                });
                revalidate();
            }
        });
        
        clearTasksBtn.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent e)
            {
                
                list.removeDoneTasks();
                repaint();

               
            }
        });
    }
}
