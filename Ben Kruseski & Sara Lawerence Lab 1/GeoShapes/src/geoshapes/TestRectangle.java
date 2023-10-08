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
public class TestRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lengthe = JOptionPane.showInputDialog("Enter length of rectangle: ");
        double length = Double.parseDouble(lengthe);
        String widthw = JOptionPane.showInputDialog("Enter width of rectangle: ");
        double width = Double.parseDouble(widthw);
        double area = length * width;
        double perimeter = (2 * length) + (2 * width);
        JOptionPane.showMessageDialog(null, "Area: " + area + " Perimeter: " + perimeter);
    }

}
