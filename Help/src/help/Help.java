/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help;

/**
 *
 * @author jamesfarrell
 */
public class Help {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException {
        
        char choice, ignore;
        
        for(;;) {
            do {
            System.out.println("Help on:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while");
            System.out.println(" 6. break");
            System.out.println(" 7. continue");
            System.out.println("Choose one: (q to quit): ");
            
            choice = (char) System.in.read();
            
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');
        } while( choice < '1' | choice > '7' & choice != 'q');
        
        if(choice == 'q') break;
        
        System.out.println("\n");
        
        switch(choice) {
            case '1':
                System.out.println("The if\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch statement:\n");
                System.out.println("switch(expression) {");
                System.out.println(" case constant:");
                System.out.println("  statement sequence");
                System.out.println("  break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for:\n");
                System.out.println("for(init; condition; iteration)");
                System.out.println(" statement");
                break;
            case '4':
                System.out.println("The while:\n");
                System.out.println("while(condtion) statement;");
            case '5':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println(" statement;");
                System.out.println("} while (condtion);");
                break;
            case '6':
                System.out.println("The break:\n");
                System.out.println("break; or break label;");
                break;
            case '7':
                System.out.println("The continue:\n");
                System.out.println("continue; or continue label;");
                break;
        }
        System.out.println();
        }
        
    }
    
}
