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
public class TestSphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String radiusr = JOptionPane.showInputDialog("Enter the radius of the sphere: ");
        double radius = Double.parseDouble(radiusr);
        double area = 4 * Math.PI * radius * radius;
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        JOptionPane.showMessageDialog(null, "Area: " + area + " Volume: " + volume);
    }
    
}
