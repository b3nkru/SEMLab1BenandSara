/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geoshapes;

import javax.swing.JOptionPane;

/**
 *
 * @author benkruseski
 */
public class TestShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String more = "y";
        while(more.equalsIgnoreCase("y")) {
            String choice;
            choice = JOptionPane.showInputDialog("Enter R for rectangle, C for circle, T for triangle, RP for rectangular prism, TP for triangular prism, S for sphere, or CY for cylinder");
            
            if(choice.equalsIgnoreCase("R")) {
                String lengthe = JOptionPane.showInputDialog("Enter length of rectangle: ");
                double length = Double.parseDouble(lengthe);
                String widthw = JOptionPane.showInputDialog("Enter width of rectangle: ");
                double width = Double.parseDouble(widthw);
                double area = length * width;
                double perimeter = (2 * length) + (2 * width);
                JOptionPane.showMessageDialog(null,"Area: " + area + " Perimeter: " + perimeter);
            }
            if(choice.equalsIgnoreCase("RP")) {
                String lengthe = JOptionPane.showInputDialog("Enter length of rectangular prism: ");
                double length = Double.parseDouble(lengthe);
                String widthw = JOptionPane.showInputDialog("Enter width of rectangular prism: ");
                double width = Double.parseDouble(widthw);
                String heighth = JOptionPane.showInputDialog("Enter height of rectangular prism: ");
                double height = Double.parseDouble(heighth);
                double perimeter = (2 * length) + (2 * width);
                double lateralarea = perimeter * height;
                double volume = length * width * height;
                double surfacearea = (length * width * 2 + length * height * 2 + height * width * 2);
                JOptionPane.showMessageDialog(null, "Volume: " + volume + " Surface Area: " + surfacearea + " Lateral Area: " + lateralarea);
            }
            if(choice.equalsIgnoreCase("C")) {
                String radiusr = JOptionPane.showInputDialog("Enter the radius of the circle: ");
                double radius = Double.parseDouble(radiusr);
                double area = Math.PI * radius * radius;
                double circumference = 2 * Math.PI * radius;
                JOptionPane.showMessageDialog(null, "Area: " + area + " Circumference: " + circumference);
            }
            if(choice.equalsIgnoreCase("CY")) {
                String radiusr = JOptionPane.showInputDialog("Enter the radius of the cylinder: ");
                double radius = Double.parseDouble(radiusr);
                String heighth = JOptionPane.showInputDialog("Enter the height of the cylinder: ");
                double height = Double.parseDouble(heighth);
                double area = Math.PI * radius * radius;
                double volume = Math.round(area * height);
                double circumference = 2 * Math.PI * radius;
                double lateralarea = Math.round(circumference * height);
                double surfacearea = Math.round(lateralarea + (2 * area));
                JOptionPane.showMessageDialog(null, "Volume: " + volume + " Lateral Area: " + lateralarea + " Surface Area: " + surfacearea);
            }
            if(choice.equalsIgnoreCase("T")) {
                String baseb = JOptionPane.showInputDialog("Enter the first side of the triangle: ");
                double side1 = Double.parseDouble(baseb);
                String heighth = JOptionPane.showInputDialog("Enter the second side of the triangle: ");
                double side2 = Double.parseDouble(heighth);
                String hypoh = JOptionPane.showInputDialog("Enter the third side of the triangle: ");
                double side3 = Double.parseDouble(hypoh);
                double sides = (side1 + side2 + side3) / 2;
                double area = Math.round(Math.sqrt(sides * (sides - side1) * (sides - side2) * (sides * side3)));
                double perimeter = Math.round(sides * 2);
                JOptionPane.showMessageDialog(null, "Area: " + area + " Perimeter: " + perimeter);
            }
            if(choice.equalsIgnoreCase("TP")) {
                String baseb = JOptionPane.showInputDialog("Enter the first side of the Triangular Prism: ");
                double side1 = Double.parseDouble(baseb);
                String heighth = JOptionPane.showInputDialog("Enter the second side of the Triangular Prism: ");
                double side2 = Double.parseDouble(heighth);
                String heightj = JOptionPane.showInputDialog("Enter the third side of the Triangular Prism: ");
                double side3 = Double.parseDouble(heightj);
                String heightr = JOptionPane.showInputDialog("Enter the height of the Triangular Prism: ");
                double height = Double.parseDouble(heightr);
                double sides = (side1 + side2 + side3)/2;
                double area = Math.round(Math.sqrt(sides * (sides - side1) * (sides - side2) * (sides - side3)));
                double volume = Math.round(area * height);
                double perimeter = Math.round(sides * 2);
                double lateralarea = perimeter * height;
                double surfacearea = (lateralarea + (2 * area));
                JOptionPane.showMessageDialog(null, "Volume: " + volume + " Lateral Area: " + lateralarea + " Surface Area: " + surfacearea);
            }
            if(choice.equalsIgnoreCase("S")){
                String radiusr = JOptionPane.showInputDialog("Enter the radius of the sphere: ");
                double radius = Double.parseDouble(radiusr);
                double area = 4 * Math.PI * radius * radius;
                double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
                JOptionPane.showMessageDialog(null, "Area: " + area + " Volume: " + volume);
            }
            more = JOptionPane.showInputDialog("Continue? - Y for Yes");
        }
    }
    
}
