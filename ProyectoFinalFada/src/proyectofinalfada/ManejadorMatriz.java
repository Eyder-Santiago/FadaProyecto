/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalfada;
import java.util.Random;
/**
 *
 * @author usuario
 */
public class ManejadorMatriz {
    public static int[][] matriz = new int [9][9];
    
    public static void cargarMatriz(){
        Random r = new Random();
        
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                int num = 1 + r.nextInt(10 - 1);
                matriz[i][j] = num;
            }
        }
    }
}
