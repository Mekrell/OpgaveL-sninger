/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package løsninger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rasmus
 */
public class UserInputTest {
    
    
    /**
     * når du laver en test står der først en linje kode i bunden som sætter den til at fail slet den
     * derefter har du int antal = 0 det er den parameter metoden normalt får den sætter du til et bestemt antal fx 2
     * så har du expResult = 0 den sætter du til at være det som det normalt ville være hvis antallet var 2 69 * 2 = 138
     * så tager den antallet køre gennem metoden får 138 ud og sammenligner det i assertEquals med expResult og hvis de passer går testen i gennem. 
     */
    @Test
    public void testPrisPåPizza() {
        System.out.println("prisP\u00e5Pizza");
        int antal = 2;
        UserInput instance = new UserInput();
        int expResult = 138;
        int result = instance.prisPåPizza(antal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
