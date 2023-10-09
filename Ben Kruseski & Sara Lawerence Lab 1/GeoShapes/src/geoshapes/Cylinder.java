/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geoshapes;

/**
 *
 * @author benkruseski
 */
public class Cylinder extends Circle {
    
    private double height;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
    public double getVolume() {
        return Math.round(super.getArea() * height);
    }
    
    public double getLateralArea() {
        return Math.round(super.getPerimeter() * height);
    }
    
    public double getSurfaceArea() {
        return Math.round(super.getRadius() * height) + (2 * super.getArea());
    }
    
}
