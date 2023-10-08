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
public class TestCylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String radiusr = JOptionPane.showInputDialog("Enter the radius of the cylinder: ");
        double radius = Double.parseDouble(radiusr);
        String heighth = JOptionPane.showInputDialog("Enter the height of the cylinder: ");
        double height = Double.parseDouble(heighth);
        double area = Math.PI * radius * radius;
        double volume = Math.round(area * height);
        double circumference = 2 * Math.PI * radius;
        double lateralarea = Math.round(circumference * height);
        double surfacearea = Math.round(lateralarea + (2 * area));
        JOptionPane.showMessageDialog(null, "Volume: " + volume + " Lateral Area: " + lateralarea + " Surface Area: " + surfacearea);// TODO code application logic here
    }

}
