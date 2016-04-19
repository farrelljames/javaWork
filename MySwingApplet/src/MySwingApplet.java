import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="MySwingApplet" width=200 height=80>
</applet>
*/

public class MySwingApplet extends JApplet {
    JButton jbtnUp;
    JButton jbtnDown;
    
    JLabel jlab;

    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    makeGUI();
                }
            });
        } catch(Exception exc) {
            System.out.println("Can't create because of " + exc);
        }
    }
    
    private void makeGUI() {
        setLayout(new FlowLayout());
        
        jbtnUp = new JButton("Up");
        jbtnDown = new JButton("Down");
        
        //anonymous class
        jbtnUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("You pressed Up.");
            }
        });
        
        //lambda
        jbtnDown.addActionListener((ae) -> jlab.setText("You pressed Down"));
        
        add(jbtnUp);
        add(jbtnDown);
        
        jlab = new JLabel("Press a button");
        
        add(jlab);
    }
}
