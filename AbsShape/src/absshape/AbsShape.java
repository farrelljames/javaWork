/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absshape;

/**
 *
 * @author jamesfarrell
 */
public class AbsShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TwoDShape ob = new Circle(76.8, "Circle", "Outline");
        
        System.out.println("The area of circle ob is: " + ob.area());
        System.out.println("iTS NAME IS: " + ob.getName());
        
        
    }
    
}

abstract class TwoDShape {
    private double width;
    private double height;
    private String name;
    
    TwoDShape() {
        width = height = 0.0;
        name = "none";
        
    }
    
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
        
    }
    
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
 
    }
    
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;   
    }
    
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    
    String getName() { return name; }
    
    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
    
    abstract double area();
}

class Circle extends TwoDShape {
    private String style;
    
    Circle(double r, String s, String st) {
        super(r, s);
        
        style = st;
    }
    
    double area() {
        double radius = getWidth();
        return Math.PI * Math.pow(radius, 2);
    }
    
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
