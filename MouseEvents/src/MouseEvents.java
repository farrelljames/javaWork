import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="MouseEvents" width=300 height=100>
</applet>
*/

public class MouseEvents extends Applet implements
        MouseListener, MouseMotionListener, MouseWheelListener {
    
    String msg = "";
    int mouseX = 0, mouseY = 0;
    
    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
    }
    
    public void mouseWheelMoved(MouseWheelEvent mwe) {
        showStatus("Yeah you used the mouse wheel");
    }
    
    public void mouseClicked(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse clicked.";
        repaint();
    }
    
    public void mouseEntered(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse entered.";
        repaint();
    }
    
    public void mouseExited(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse exited.";
        repaint();
    }
    
    public void mousePressed(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Down";
        repaint();
    }
    
    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        repaint();
    }
    
    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*";
        showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
        repaint();
    }
    
    public void mouseMoved(MouseEvent me) {
        showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
    }
    
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
}
