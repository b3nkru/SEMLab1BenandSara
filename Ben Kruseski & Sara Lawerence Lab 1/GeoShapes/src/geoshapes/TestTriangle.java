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
public class TestTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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

}
