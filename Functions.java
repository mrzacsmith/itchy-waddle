/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author Zac
 */
public class Functions {
    
    private final double PI = 3.141592;
    int length;
    int width;
    int height;
    int radius;
    
    public void areaLength() {
       int area;
       area = length * width;
       System.out.println("The area of your square is " + area);     
    
    }
    
    public void areaTriangle() {
        double area;
        area =  ((height * width) / 2);
        System.out.println("The area of your triangle is " + area);
        
    }
    
    public void areaCircle() {
        double area;
        area = radius * radius * PI;
        System.out.println("The area of your circle is " + area);
        
    }
    
    public void volumeCube() {
        double volume;
        volume = length * width * height;
        System.out.println("The volume of your cube is " + volume);
    }

  
}
