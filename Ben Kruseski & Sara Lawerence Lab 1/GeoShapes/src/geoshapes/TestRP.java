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
public class TestRP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
}
