/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package markus.ttaller;

import javax.swing.JOptionPane;

/**
 *
 * @author johan
 */
public class TotalJ implements Total {

    @Override
    public void Total() {
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios");
        System.exit(0);
    }

    int sumaServicios(int a1, int b1, int c1, int d1) {
        int e1 = a1 + b1 + c1 + d1;
        return e1;
    }

    int sumaRecaudado(int a2, int b2, int c2, int d2) {
        int e2 = a2 + b2 + c2 + d2;
        return e2;
    }

}
