import java.util.Calendar;
import java.awt.*;
import java.applet.*;
import java.text.SimpleDateFormat;

/*
<applet code="CH154" height=50 width=300>
</applet>
*/

public class CH154 extends Applet implements Runnable {
    
    Calendar rightNow;
    SimpleDateFormat sdf;
    Thread t;
    
    public void init() {
        sdf = new SimpleDateFormat("HH:mm:ss");
    }
    
    public void start() {
        t = new Thread(this);
        t.start();
    }
    
    public void run() {
        for(;;) {
            try {
                repaint();
                Thread.sleep(1000);
            } catch(InterruptedException exc) {}
        }
    }
    
    public void paint(Graphics g) {
        rightNow = Calendar.getInstance();
        g.drawString(sdf.format(rightNow.getTime()), 50, 30);
    }
    
}
