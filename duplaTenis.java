/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fase2_obi;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class duplaTenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int vetorNivel[] = new int[4];
        int vetorSomaNivel[] = new int[2];
        int menorDiferenca[] = new int[1];
        
       for(int i = 0;i < vetorNivel.length;i++){
           
           vetorNivel[i] = Teclado.nextInt();
           
       }
       
        for(int j = 0;j < vetorSomaNivel.length;){
             for(int i = 0;i < vetorNivel.length;i++){
        
                vetorSomaNivel[j] = vetorNivel[i] + vetorNivel[++i];
                System.out.println(j+"-"+vetorSomaNivel[j]);
                j++;
                
             }                    
        }   
        
    }
    
}
