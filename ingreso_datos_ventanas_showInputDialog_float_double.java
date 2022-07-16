/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programador_novato;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ingreso_datos_ventanas_showInputDialog_float_double {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float flotante= Float.parseFloat(JOptionPane.showInputDialog("mete un flotante"));
       JOptionPane.showMessageDialog(null,"Este es tu flotante " + flotante);
       
       double doble= Double.parseDouble(JOptionPane.showInputDialog("mete un doble"));
       JOptionPane.showMessageDialog(null,"Este es tu doble " + doble);
    }
    
}
