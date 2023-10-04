/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

import static java.lang.Math.PI;

/**
 *
 * @author paulooliveira
 */
public class Circle extends Shape {
    
    private int radius; 

    public int getRadius() {
        return radius;
    }
    
    public double getArea() { 
        
        return PI * radius * radius;
    }
    
}
