/*
 * Nick Dernovsek
 * Area of a Circle
 * This code finds the area of a circle
 */

package areaofacircle;

/**
 *
 * @author nider6687
 */
public class AreaOfACircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pi = 3.14159;
        double radius = 15;
        double area = 0.0;
        area = radius*radius*pi;
        
        System.out.println("The area of this circle is " + area);
    }
    
}
