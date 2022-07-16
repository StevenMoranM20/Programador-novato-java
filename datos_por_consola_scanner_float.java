/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programador_novato;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class datos_por_consola_scanner_float {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float valor;
        System.err.println("Escribe el valor:");
        valor = entrada.nextFloat();
        System.out.println("Tu numero es:" + " " + valor);
    }

}
