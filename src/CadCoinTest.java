

import java.util.Random;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class CadCoinTest{

    public static Coin quarter;
    public static Coin nickel;
    public static Coin dime;
    public static Coin loonie;
    public static Coin toonie;
    public static CadCoinMint testMint;

    public static final double QUARTER = .25d;
    public static final double DIME = .1d;
    public static final double NICKEL =.05d;
    public static final double LOONIE = 1.0d;
    public static final double TOONIE = 2.0d;
    public static final double DELTA = .01d;

   
    @BeforeEach
    public void setUp(){
        testMint = CadCoinMint.getInstance();
    }

    @AfterEach
    public void cleanUp(){
        quarter = null;
        nickel = null;
        loonie = null;
        toonie = null;
        testMint = null;

    }


    @Test
    public void testQuarter(){
        quarter = testMint.makeCoin(QUARTER);
        assertEquals(quarter.getDenom(), QUARTER, DELTA);
        assertTrue(quarter.getCountryCode().equals("CAD"));
        assertTrue(quarter.getCommonName().equals("Quarter"));
        assertTrue(quarter.getSmelt().equals("Unknown"));
    }

    @Test
    public void testNickel(){
        nickel = testMint.makeCoin(NICKEL);
        assertEquals(nickel.getDenom(),NICKEL, DELTA);
        assertTrue(nickel.getCountryCode().equals("CAD"));
        assertTrue(nickel.getCommonName().equals("Nickel"));
        assertTrue(nickel.getSmelt().equals("Unknown"));
    }

    @Test
    public void testDime(){
        dime = testMint.makeCoin(DIME);
        assertEquals(dime.getDenom(), DIME, DELTA);
        assertTrue(dime.getCountryCode().equals("CAD"));
        assertTrue(dime.getCommonName().equals("Dime"));
        assertTrue(dime.getSmelt().equals("Unknown"));
    }

    @Test
    public void testLoonie(){
        loonie = testMint.makeCoin(LOONIE);
        assertEquals(loonie.getDenom(), LOONIE, DELTA);
        assertTrue(loonie.getCountryCode().equals("CAD"));
        assertTrue(loonie.getSmelt().equals("Unknown"));
        assertTrue(loonie.getCommonName().equals("Loonie"));
    }
    
    @Test
    public void testToonie(){
        toonie = testMint.makeCoin(TOONIE);
        assertEquals(toonie.getDenom(), TOONIE, DELTA);
        assertTrue(toonie.getCommonName().equals("Toonie"));
        assertTrue(toonie.getSmelt().equals("Unknown"));
        assertTrue(toonie.getCountryCode().equals("CAD"));
    }


}
