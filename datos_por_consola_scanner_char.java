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
public class datos_por_consola_scanner_char {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        char caracter;
        System.out.println("Escriba un caracter");
        caracter=entrada.next().charAt(2);
        System.out.println("Su caracter es:" + "" + caracter );    }
    
}
