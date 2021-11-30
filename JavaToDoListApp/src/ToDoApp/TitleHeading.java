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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Siddarath
 */
public class TitleHeading extends JPanel {
    
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    
    JLabel titleText;
    JLabel mainDateTexts;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String currentTime;
    String currentDay;
    String currentDate;
    
    // Constructor
    TitleHeading()
    {
        this.setPreferredSize(new Dimension(400,150));
        //this.setBackground(Color.orange);
        
        ImageIcon titleLogo = new ImageIcon(getClass().getResource("/Images/appLogo.png"));

        
        titleText = new JLabel();
        titleText.setPreferredSize(new Dimension(400,100));
        titleText.setIcon(titleLogo);
        titleText.setHorizontalAlignment(JLabel.CENTER);

        timeFormat = new SimpleDateFormat("hh:mm:ss a"); // set format of time 
        dayFormat = new SimpleDateFormat("EEEE"); // set day of the week using the "E" format specifier
        dateFormat = new SimpleDateFormat("dd MMMMM, yyyy"); // set day of the week using the "E" format specifier

        
        timeLabel = new JLabel(); 
        timeLabel.setFont(new Font("Verdana", Font.BOLD, 16));
        
        
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Verdana", Font.BOLD, 16));

        
        dateLabel = new JLabel(); 
        dateLabel.setFont(new Font("Verdana", Font.BOLD, 16));

        
        this.add(titleText);
        //this.add(Box.createHorizontalStrut(100));
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        
        
        //this.setVisible(true);
        setTime();
        

    }
    
    public void setTime()
    {
        Thread clock = new Thread(){
            public void run(){
                while (true) {
                    

                    currentTime = timeFormat.format(Calendar.getInstance().getTime()); // get current time and store it in string variable in time format
                    timeLabel.setText(currentTime + " ");

                    currentDay = dayFormat.format(Calendar.getInstance().getTime()); // get current time and store it in string variable in time format
                    dayLabel.setText("Date: " +currentDay);

                    currentDate = dateFormat.format(Calendar.getInstance().getTime()); // get current time and store it in string variable in time format
                    dateLabel.setText(currentDate);

                    try {

                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                        ex.printStackTrace();
                    }
                } 
            }
        };
        
        clock.start();
        
    }
    
    /*public void setTime()
    {
        while (true) {

            System.out.println("Reachable and gui should be shown");
            currentTime = timeFormat.format(Calendar.getInstance().getTime()); // get current time and store it in string variable in time format
            timeLabel.setText(currentTime);

            currentDay = dayFormat.format(Calendar.getInstance().getTime()); // get current time and store it in string variable in time format
            dayLabel.setText(currentDay);

            currentDate = dateFormat.format(Calendar.getInstance().getTime()); // get current time and store it in string variable in time format
            dateLabel.setText(currentDate);

            try {

                Thread.sleep(1000);
            } catch (InterruptedException ex) {

                ex.printStackTrace();
            }
        }
    }*/
}
