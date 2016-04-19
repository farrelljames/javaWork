import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class SwingFC implements ActionListener {
    
    JTextField jtfFirst;
    JTextField jtfSecond;

    JButton jbtnComp;
    
    JLabel jlabFirst, jlabSecond;
    JLabel jlabResult;
    JLabel jlabMismatch;
    
    JCheckBox jcb;
    
    boolean mismatchBool = false;
    
    SwingFC() {
        JFrame jfrm = new JFrame("Compare Files");
        
        jfrm.setLayout(new FlowLayout());
        
        jfrm.setSize(200, 190);
        
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);
        
        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");
        
        jbtnComp = new JButton("Compare");
        
        jbtnComp.addActionListener(this);
        
        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: ");
        jlabResult = new JLabel("");
        jlabMismatch = new JLabel("");
        
        jcb = new JCheckBox("Show position of mismatch");
        
        jcb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                JCheckBox cb = (JCheckBox) ie.getItem();
                
                if(cb.isSelected())
                    mismatchBool = true;
                else
                    mismatchBool = false;
            }
        });
        
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jcb);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);
        jfrm.add(jlabMismatch);
        
        jfrm.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        int i=0, j=0;
        
        jlabMismatch.setText("");
        
        if(jtfFirst.getText().equals("")) {
            jlabResult.setText("First file name missing.");
            return;
        }
        if(jtfSecond.getText().equals("")) {
            jlabResult.setText("Second file name missing.");
            return;
        }
        
        try(FileInputStream f1 = new FileInputStream(jtfFirst.getText());
            FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
            
            int count = 0;
            
            do {
                i = f1.read();
                j = f2.read();
                count++;
                if(i != j) break;
            } while(i != -1 && j != -1);
            
            if(i != j) {
                jlabResult.setText("Files are not the same");
                if(mismatchBool)
                    jlabMismatch.setText("The files were mismatched at postion: " + count);
            }               
            else
                jlabResult.setText("File compare equal");
        } catch(IOException exc) {
            jlabResult.setText("Fle Error");
        }
    }
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingFC();
            }
        });
    }


}
