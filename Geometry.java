/*
 * This is a practice project working with classes.
 * Second function of this program is learning Git and GitHub
 * Enjoy learning!
 */
package geometry;

import java.util.Scanner;

/**
 *
 * @author zrsmith
 */
public class Geometry {

    public static void main(String[] args) {
    
        // Declare classes 
        Functions functions = new Functions();
        Scanner keyboard = new Scanner(System.in);
        
        // Input data from keyboard
        System.out.print("Enter length: ");
        functions.length = keyboard.nextInt();
        
        System.out.print("Enter width: ");
        functions.width = keyboard.nextInt();
        
        System.out.print("Enter height: ");
        functions.height = keyboard.nextInt();
        
        System.out.print("Enter radius: ");
        functions.radius = keyboard.nextInt();
        
        // Call the Functions class
        functions.areaLength();
        functions.areaTriangle();
        functions.areaCircle();
        functions.volumeCube();
        
    }
    
}
