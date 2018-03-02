/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoeva2;

import java.util.*;

/**
 *
 * @author jdominguezdominguez
 */
public class Tablero {

    int[][] tablero = new int[7][7];

    public void reset() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    public void test() {
        int cont = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                cont++;
                if (cont == 7) {
                    System.out.println(tablero[i][j]);
                    cont = 0;
                } else {
                    System.out.print(tablero[i][j]);
                }
            }
        }
    }
    
    

}
