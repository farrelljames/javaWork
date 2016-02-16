/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errinfo;

/**
 *
 * @author jamesfarrell
 */
public class ErrInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;
        
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);
        
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " severity: " + e.severity);
    }
    
}

class Err {
    String msg;
    int severity;
    
    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String msgs[] = {
        "Output Error",
        "Input Error",
        "Disk Full",
        "Index Out-Of-Bounds"
    };
    int howBad[] = {3,3,2,4};
    
    Err getErrorInfo(int i) {
        if(i >= 0 & i < msgs.length)
            return new Err(msgs[i], howBad[i]);
        else
            return new Err("Invalid Error Code", 0);
    }
}
