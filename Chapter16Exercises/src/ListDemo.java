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
        
        jlst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        jscrlp = new JScrollPane(jlst);
        
        jscrlp.setPreferredSize(new Dimension(120, 90));
        
        jlab = new JLabel("Please choose a name");
        
        jlst.addListSelectionListener(this);
        
        jfrm.add(jscrlp);
        jfrm.add(jlab);
        
        jfrm.setVisible(true);
        
        
    }
    
    public void valueChanged(ListSelectionEvent le) {
        int idxs[] = jlst.getSelectedIndices();
        String str = "";
        int idxLength = idxs.length;
        
        if(idxLength > 0) {
            for(int i = 0; i < idxLength; i++) str += names[idxs[i]] + " ";
            jlab.setText("Current selection: " + str);
        } else
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
