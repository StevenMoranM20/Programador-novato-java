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
public class ingreso_datos_ventanas_showInputDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String cadena= JOptionPane.showInputDialog("mete una cadena");
       JOptionPane.showMessageDialog(null,"Este es nu cadena " + cadena);
       
       int entero= Integer.parseInt(JOptionPane.showInputDialog("mete una cadena"));
       JOptionPane.showMessageDialog(null,"Este es nu entero " + entero);
       
       
    }
    
}
