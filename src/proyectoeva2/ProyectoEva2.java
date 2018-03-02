/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoeva2;

import javax.swing.JOptionPane;

/**
 *
 * @author jdominguezdominguez
 */
public class ProyectoEva2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Boolean exit = false;

        Tablero tablero = new Tablero();
        Display display = new Display();

        do {

            String[] possibilities = {"Reset", "Mostar tablero"};
            String elecion = (String) JOptionPane.showInputDialog(null, "", "panel de control", JOptionPane.PLAIN_MESSAGE, null, possibilities, null);

            if (elecion == null) {
                elecion = "";
            }

            switch (elecion) {

                case "Reset":
                    tablero.reset();
                    break;

                case "Mostar tablero":
                    tablero.test();
                    break;

                case "":
                    display.basicDisplay("Gracias por jugar");
                    exit = true;
                    break;

                default:
                    break;
            }
        } while (exit == false);

    }

}
