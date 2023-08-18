/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fase1_obi;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class subsequencia_OBI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner (new BufferedInputStream(System.in));
        int qtdeSequencia = Teclado.nextInt();
        int qtdeSubSequencia = Teclado.nextInt();
        int contIgualdade = 0;
        
        int[] vetorSequencia = new int[qtdeSequencia];
        int[] vetorSubSequencia = new int[qtdeSubSequencia];
        
        for(int i = 0; i < vetorSequencia.length; i++){
            vetorSequencia[i] = Teclado.nextInt();
        }
        for(int i = 0; i < vetorSubSequencia.length; i++){
            vetorSubSequencia[i] = Teclado.nextInt();
        }
        
        for(int i = 0;i < vetorSequencia.length; i++){
            for(int j = 0;j< vetorSubSequencia.length; j++){
                if(vetorSequencia[i] == vetorSubSequencia[j]){
                    contIgualdade++;
                }
            }
        }
        if(contIgualdade == qtdeSubSequencia){
            System.out.print("S");
        }else{
             System.out.print("N");
        }
    }  
}
