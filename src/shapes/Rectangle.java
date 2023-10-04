/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author paulooliveira
 */
public class Rectangle extends Shape {
    
  
    private double Height;
    private double Width;


    public double getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(int Width) {
        this.Width = Width;
    }
    
    public double getArea() { 
     return this.Height * this.Width;
    
    }
    
}
