/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoApp;

import javax.swing.UIManager;

/**
 *
 * @author Siddarath
 */
public class JavaToDoListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        
        String nimbusTheme = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        UIManager.setLookAndFeel(nimbusTheme);
        
        // Make a new app frame
        new ApplicationFrame();
    }
    
}
