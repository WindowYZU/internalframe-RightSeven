/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.internalframesamples;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class InternalFrameInDesktopPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        //create a desktoppane
        //add internalFrame to it
        //make it visible
        
           JDesktopPane desk = new JDesktopPane();
           frame.setContentPane(desk);
        
        for(int i=0 ; i<5 ; i++){
           JInternalFrame JInternalFrame = new JInternalFrame();
           frame.add(JInternalFrame);
           JInternalFrame.setSize(300, 300);
           JInternalFrame.setVisible(true);
           JInternalFrame.setMaximizable(true);
           JInternalFrame.setIconifiable(true);
           JInternalFrame.setResizable(true);
           JInternalFrame.setClosable(true);
           
           JInternalFrame.setLocation(20+i*30, 10+i*30);
        }
        
        
            /////////////////////////////////
        frame.setVisible(true);
    }
    
}
