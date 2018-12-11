/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.internalframesamples;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class InternalFrameMenuBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        JDesktopPane desktopPane = new JDesktopPane();
        frame.setContentPane(desktopPane);
        //create menubar
        //add menuitem
        //create new internalframe when the item is clicked
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        JMenu menu = new JMenu("Edit");
        menuBar.add(menu);
        JMenuItem item = new JMenuItem("Add");
        menu.add(item);
        
        
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JInternalFrame InternalFrame = new JInternalFrame();
                frame.add(InternalFrame);
                InternalFrame.setSize(300, 300);
                InternalFrame.setVisible(true);
                InternalFrame.setMaximizable(true);
                InternalFrame.setIconifiable(true);
                InternalFrame.setResizable(true);
                InternalFrame.setClosable(true);
           
                InternalFrame.setLocation(desktopPane.getAllFrames().length*10, desktopPane.getAllFrames().length*10);
            }
        });
        ////////////////////////////
        frame.setVisible(true);
    }

}
