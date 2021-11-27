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
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String currentTime;
    String currentDay;
    String currentDate;
    
    // Constructor
    TitleHeading()
    {
        this.setPreferredSize(new Dimension(400,100));
        //this.setBackground(Color.orange);
        
        ImageIcon titleLogo = new ImageIcon(getClass().getResource("/Images/appLogo.png"));

        
        JLabel titleText = new JLabel();
        titleText.setIcon(titleLogo);
        
        JLabel clock = new JLabel("Time, Date will go here");
        
        timeFormat = new SimpleDateFormat("hh:mm:ss a"); // set format of time 
        dayFormat = new SimpleDateFormat("EEEE"); // set day of the week using the "E" format specifier
        dateFormat = new SimpleDateFormat("dd MMMMM, yyyy"); // set day of the week using the "E" format specifier

        
        timeLabel = new JLabel(); 
        dayLabel = new JLabel(); 
        dateLabel = new JLabel(); 

        /*currentTime = timeFormat.format(Calendar.getInstance().getTime()); // get current time and store it in string variable in time format
        timeLabel.setText(currentTime);
        
        currentDay = dayFormat.format(Calendar.getInstance().getTime()); // get current time and store it in string variable in time format
        dayLabel.setText(currentDay);
        
        currentDate = dateFormat.format(Calendar.getInstance().getTime()); // get current time and store it in string variable in time format
        dateLabel.setText(currentDate);*/
        
        //titleText.setHorizontalAlignment(JLabel.CENTER);

        /*titleText.setPreferredSize(new Dimension(200,80));
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 24));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        
        Font font = titleText.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        titleText.setFont(font.deriveFont(attributes));*/
        
        this.add(titleText);
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
