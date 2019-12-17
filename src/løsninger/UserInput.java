/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package løsninger;

/**
 *
 * @author Rasmus
 */
public class UserInput {
    //vi laver en metode som tager imod en int og returnere en int. Den int vi modtager kalder vi antal
    
    public int prisPåPizza(int antal) {
        //den int vi returnere kalder vi pris og sætter til at være lig med antal gange 70
        int pris = 69;
        int endeligPris = pris * antal;
        //nu returnere metoden pris
        return endeligPris;
    }
    
}
