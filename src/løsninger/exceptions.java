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
public class exceptions {
    
    /**
     *
     * @param tal
     * @throws IllegalArgumentException
     */
    public void testSætning(int tal) throws IllegalArgumentException {
        int test = 0;
        switch(tal) {
            
        case 1:
            test = 1;
            break;    
        default:
            throw new IllegalArgumentException();
        }
        
        System.out.println(test);
    }
    //løsning findes på linje 100
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Løsning 
    public void testSætningLøsning(int tal) throws IllegalArgumentException {
        try {
        int test = 0;
        switch(tal) {
            
        case 1:
            test = 1;
            break;    
        default:
            throw new IllegalArgumentException();
        }
        
        System.out.println(test);
        }
        catch (IllegalArgumentException e) {
            System.out.println("forkert tal");
        }
    }
}
