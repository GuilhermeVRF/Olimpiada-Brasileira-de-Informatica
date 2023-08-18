/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fase1_obi;
import java.util.Scanner;
/**
 *
 * @author guilh
 */
public class baralho_OBI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        String baralho, naipeBaralho, tipoBaralho;
        int totalCartasBaralho, subStringNaipe0 = 2, subStringNaipe1 = 3, subStringTipo0 = 0, subStringTipo1 = 2;
        int contC = 0, contE = 0, contU = 0, contP = 0, contErroC = 0, contErroE = 0, contErroU = 0, contErroP = 0;
        int qtdeC, qtdeE, qtdeU, qtdeP;
        String[] confereDuplicadoC = new String[13];
        String[] confereDuplicadoE = new String[13];
        String[] confereDuplicadoU = new String[13];
        String[] confereDuplicadoP = new String[13];
        
        baralho = Teclado.nextLine();
        totalCartasBaralho = baralho.length();
        
        do{
            
            naipeBaralho = baralho.substring(subStringNaipe0,subStringNaipe1);
            tipoBaralho = baralho.substring(subStringTipo0,subStringTipo1);
            
            subStringTipo0 += 3;
            subStringTipo1 += 3;
            subStringNaipe0 += 3;
            subStringNaipe1 += 3;
            
            if("C".equals(naipeBaralho)){
                
                for(int i = 0;i < confereDuplicadoC.length;i++){
                    if(confereDuplicadoC[i] == null ? tipoBaralho == null : confereDuplicadoC[i].equals(tipoBaralho)){

                        contErroC++;
                        
                    }
                   
                }
                confereDuplicadoC[contC] = tipoBaralho;
                contC++;
                
            }else if("E".equals(naipeBaralho)){
                
                 for(int i = 0;i < confereDuplicadoC.length;i++){
                    if(confereDuplicadoE[i] == null ? tipoBaralho == null : confereDuplicadoE[i].equals(tipoBaralho)){

                        contErroE++;
                        
                    }   
                }
                confereDuplicadoE[contE] = tipoBaralho;
                contE++;
                
            }else if("U".equals(naipeBaralho)){
                
                
                 for(int i = 0;i < confereDuplicadoC.length;i++){
                    if(confereDuplicadoU[i] == null ? tipoBaralho == null : confereDuplicadoU[i].equals(tipoBaralho)){

                        contErroE++;
                        
                    }
                   
                }
                confereDuplicadoU[contU] = tipoBaralho;
                contU++;
                
                
            }else if("P".equals(naipeBaralho)){
                
                 for(int i = 0;i < confereDuplicadoC.length;i++){
                    if(confereDuplicadoP[i] == null ? tipoBaralho == null : confereDuplicadoP[i].equals(tipoBaralho)){

                        contErroP++;
                        
                    }
                   
                }
                confereDuplicadoP[contP] = tipoBaralho;
                contP++;
                
            }
        }while(subStringNaipe1 <= totalCartasBaralho);
        
        qtdeC = 13 - contC;
        qtdeE = 13 - contE;
        qtdeU = 13 - contU;
        qtdeP = 13 - contP;
        
        if(contErroC > 0){
            System.out.println("erro");
        }else{
            System.out.println(qtdeC);
        }
        if(contErroE > 0){
            System.out.println("erro");
        }else{
            System.out.println(qtdeE);
        }
        if(contErroU > 0){
            System.out.println("erro");
        }else{
            System.out.println(qtdeU);
        }
        if(contErroP > 0){
            System.out.println("erro");
        }else{
            System.out.println(qtdeP);
        }
    }
}
