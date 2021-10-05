/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inchtometer;

/**
 *
 * @author Abdul Moiz Chishti
 */
import java.util.Scanner;
public class Inchtometer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner obj=new Scanner(System.in);
    
        System.out.print("Enter a value for inch: ");
    double inch=obj.nextDouble();
    double meter=inch*0.0254;
        System.out.println(inch+" inch is "+meter+" meters");
    }
}
