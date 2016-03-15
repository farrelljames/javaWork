import java.awt.*;
import java.applet.*;

/* 
<applet code="Banner" width=300 height=50>
<param name=str value="Hello World!">
<param name=delay value=50>
</applet>
*/

public class Banner extends Applet implements Runnable {
    String msg = " Java Rules the Web ";
    Thread t;
    boolean stopFlag;
    String str;
    int delay;
    
    public void init() {
        t = null;
    }
    
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
        String temp;
        
        str = getParameter("str");
        if(str == null) str = "not found";
        
        temp = getParameter("delay");
        try {
            if(temp != null)
                delay = Integer.parseInt(temp);
            else
                delay = 0;
        } catch(NumberFormatException exc) {
            delay = -1;
        }
    }
    
    public void run() {
        for(;;) {
            try {
                repaint();
                Thread.sleep(delay);
                if(stopFlag)
                    break;
            } catch(InterruptedException exc) {}
        }
    }
    
    public void stop() {
        stopFlag = true;
        t = null;
    }
    
    public void paint(Graphics g) {
        char ch;
        
        ch = str.charAt(0);
        str = str.substring(1, str.length());
        str += ch;
        g.drawString(str, 50, 30);
    }
}
