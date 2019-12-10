/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package løsninger;

import java.util.Scanner;

/**
 *
 * @author Rasmus
 */
public class Løsninger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //fjern // for at køre opgave 1 eller 2
        //Opgave1();
        //Opgave2();
        
        
    }
    //static pga. vi ikke skal bruge flere "Opgave1" objekter
    public static void Opgave1() {
        // Lav en scanner
        Scanner in = new Scanner(System.in);
        //lav en variable der tager det næste int input
        int input = in.nextInt();
        //valider brugerinput
        System.out.println("Input: " + input);
        //lav et nyt objekt ud fra klassen UserInput
        UserInput test = new UserInput();
        //kald metoden og indsæt user input variablen
        test.prisPåPizza(input);
        //system out print hele metoden med input og den printer det som metoden Returner
        System.out.println(test.prisPåPizza(input));
    }
    
    public static void Opgave2() {
        Scanner in = new Scanner(System.in);
        
        int input = in.nextInt();
        
        exceptions test = new exceptions();
        
        test.testSætning(input);
        
        
    }
    
    
}
