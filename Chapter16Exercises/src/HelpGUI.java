import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class HelpGUI {
    
    JLabel jInfoTitle;
    JLabel jInfo;
    
    JScrollPane jsrlp;
    
    JList<String> jKeyWords;
    
    String keywords[] = {"if","switch","for","while","do-while","break","continue            "};
    String kwrdsInfo[] = {
        "<html><pre>if(condition) statement;<br>else statement;</pre></html>",
        "<html><pre>switch(expression) {<br> case constant:<br>  statement sequence<br>  break;<br> // ...<br>}</pre></html>",
        "<html><pre>for(init; condition; iteration)<br> statement</pre></html>",
        "<html><pre>while(condtion) statement;</pre></html>",
        "<html><pre>do {<br> statement;<br>} while (condtion);</pre></html>",
        "<html><pre>break; or break label;</pre></html>",
        "<html><pre>continue; or continue label;</pre></html>"
    };
    
    HelpGUI() {
        JFrame jfrm = new JFrame("Java Keyword Help System");
        
        jfrm.setLayout(new FlowLayout());
        
        jfrm.setSize(200, 190);
        
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jInfoTitle = new JLabel("");
        jInfo = new JLabel("");
        
        jKeyWords = new JList<>(keywords);
        
        jKeyWords.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        jsrlp = new JScrollPane(jKeyWords);
        
        jsrlp.setPreferredSize(new Dimension(100, 100));
        
        jKeyWords.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent le) {
                int idx = jKeyWords.getSelectedIndex();
                
                if(idx != -1) {
                    jInfoTitle.setText("Keyword: " + keywords[idx]);
                    jInfo.setText(kwrdsInfo[idx]);
                } else {
                    jInfoTitle.setText("Please choose a keyword");
                }
                    
            }
        });
        
        jfrm.add(jsrlp);
        jfrm.add(jInfoTitle);
        jfrm.add(jInfo);
        
        jfrm.setVisible(true);
        
    }
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HelpGUI();
            }
        });
    }
}
