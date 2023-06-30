/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OBI;

import java.util.Scanner;

/**
 *
 * @author 0057113
 */
public class carteiro_OBI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Scanner Teclado1 = new Scanner(System.in);
        int cont = 0;
        int M = Teclado.nextInt();
        int N = Teclado.nextInt();
        
        String numeroCasas[] = new String[M];
        String encomendasCasas[] = new String[N];
        
        for(int i = 0; i < numeroCasas.length; i++){
            numeroCasas[i] = Teclado1.nextLine();
        }
        for(int i = 0; i < encomendasCasas.length; i++){
            System.out.println(i);
            encomendasCasas[i] = Teclado1.nextLine();
        }
        for(int i = 0; i < numeroCasas.length; i++){
            for(int j = 0; j < encomendasCasas.length; j++){
                if(numeroCasas[i].equals(encomendasCasas[j])){
                    
                }else{
                    cont++;
                }
            }
        }
        System.out.println(cont);
    }
    
}
