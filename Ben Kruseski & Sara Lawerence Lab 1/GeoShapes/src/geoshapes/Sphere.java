/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geoshapes;

/**
 *
 * @author benkruseski
 */
public class Sphere {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Sphere(double radius) {
        this.radius = radius;
    }
    
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
    
    public double getVolume() {
        return (4/3) * Math.PI * radius * radius * radius; 
    }
}
