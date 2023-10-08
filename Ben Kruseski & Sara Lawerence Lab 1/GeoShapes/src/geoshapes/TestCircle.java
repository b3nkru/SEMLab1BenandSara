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
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String radiusr = JOptionPane.showInputDialog("Enter the radius of the circle: ");
        double radius = Double.parseDouble(radiusr);
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        JOptionPane.showMessageDialog(null, "Area: " + area + " Circumference: " + circumference);
    }

}
