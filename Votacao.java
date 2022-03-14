/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votacao;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Votacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2022 - nasc;
        
        if (i<16){
            System.out.println("Não vota");
        } else {
            if ((i>=16 && i<18) || (i>70)) {
                System.out.println("Opcional");
            } else {
                System.out.println("Obrigatório");
            }
        }
        
    }
    
}
