/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geoshapes;

import javax.swing.JOptionPane;

/**
 *
 * @author sara
 */
public class TestTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
}
