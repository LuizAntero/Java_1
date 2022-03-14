/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner idade = new Scanner (System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int nasc = idade.nextInt();
        int id = 2022 - nasc;
        System.out.println("Sua idade é " + id + " anos.");
        if (id>=18){
            System.out.println("Você é maior de idade: ");
        } else {
            System.out.println("Você é menor de idade: ");
        }
    }
    
}
