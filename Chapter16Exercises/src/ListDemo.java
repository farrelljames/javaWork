import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo implements ListSelectionListener {
    
    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;
    
    String names[] = {"Megan", "James", "Rosie",
                      "Tom", "April", "Aaron",
                      "Mary", "Joseph", "Rico",
                      "Estaban", "Esmarelda", "Pablo"};
    
    ListDemo() {
        JFrame jfrm = new JFrame("JList Demo");
        
        jfrm.setLayout(new FlowLayout());
        
        jfrm.setSize(200, 160);
        
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jlst = new JList<String>(names);
        
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        jscrlp = new JScrollPane(jlst);
        
        jscrlp.setPreferredSize(new Dimension(120, 90));
        
        jlab = new JLabel("Please choose a name");
        
        jlst.addListSelectionListener(this);
        
        jfrm.add(jscrlp);
        jfrm.add(jlab);
        
        jfrm.setVisible(true);
        
        
    }
    
    public void valueChanged(ListSelectionEvent le) {
        int idx = jlst.getSelectedIndex();
        
        if(idx != -1)
            jlab.setText("Current selection: " + names[idx]);
        else
            jlab.setText("Please choose a name");
    }
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ListDemo();
            }
        });
    }
}
