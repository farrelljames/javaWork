import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="CH157" width=300 height=50>
</applet>
*/

public class CH157 extends Applet implements MouseListener, MouseMotionListener {
    
    int smouseX, smouseY = 0;
    int emouseX, emouseY = 0;
    
    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    
    public void mouseClicked(MouseEvent me) {

    }
    
    public void mouseEntered(MouseEvent me) {

    }
    
    public void mouseExited(MouseEvent me) {

    }
    
    public void mousePressed(MouseEvent me) {
        smouseX = me.getX();
        smouseY = me.getY();
    }
    
    public void mouseReleased(MouseEvent me) {
        emouseX = emouseY = smouseX = smouseY = 0;
        repaint();
    }
    
    public void mouseDragged(MouseEvent me) {
        emouseX = me.getX();
        emouseY = me.getY();
        
        repaint();

    }
    
    public void mouseMoved(MouseEvent me) {

    }
    
    public void paint(Graphics g) {
        g.drawLine(smouseX, smouseY, emouseX, emouseY);
    }
    
}
