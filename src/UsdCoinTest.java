
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class UsdCoinTest{

    public static Coin quarter;
    public static Coin nickel;
    public static Coin dime;
    public static Coin dollar;
    public static Coin halfy;
    public static Coin penny;
    public static UsdCoinMint testMint;

    public static final double QUARTER = .25d;
    public static final double DIME = .1d;
    public static final double NICKEL =.05d;
    public static final double PENNY = .01d;
    public static final double DOLLAR = 1d;
    public static final double HALFY = .5d;

   
    @BeforeEach
    public void setUp(){
        testMint = UsdCoinMint.getInstance();
    }

    @AfterEach
    public void afterEach(){
        testMint = null;
        quarter = null;
        dime = null;
        penny = null;
        nickel = null;

    }


    @Test
    public void testQuarter(){
        quarter = testMint.makeCoin(QUARTER);
        assertEquals(quarter.getDenom(), 0.25);
        assertTrue(quarter.getCommonName().equals("Quarter"));
        assertTrue(quarter.getCountryCode().equals("USD"));
        assertTrue(quarter.getSmelt().equals("91.67% Cu 8.33% Ni"));
    }

    @Test
    public void testNickel(){
        nickel = testMint.makeCoin(NICKEL);
        assertEquals(nickel.getDenom(), .05);
        assertTrue(nickel.getCommonName().equals("Nickel"));
        assertTrue(nickel.getCountryCode().equals("USD"));
        assertTrue(nickel.getSmelt().equals("75% Cu 25% Ni"));
    }

    @Test
    public void testPenny(){
        penny = testMint.makeCoin(PENNY);
        assertEquals(penny.getDenom(), .01);
        assertTrue(penny.getCountryCode().equals("USD"));
        assertTrue(penny.getCommonName().equals("Penny"));
        assertTrue(penny.getSmelt().equals("2.5% Cu 97.5% Zi"));
    }

    @Test 
    public void testDime(){
        dime = testMint.makeCoin(DIME);
        assertEquals(dime.getDenom(), .1);
        assertTrue(dime.getCountryCode().equals("USD"));
        assertTrue(dime.getCommonName().equals("Dime"));
        assertTrue(dime.getSmelt().equals("91.67% Cu 8.33% Ni"));
    }

    @Test
    public void testHalfy(){
        halfy = testMint.makeCoin(HALFY);
        assertEquals(halfy.getDenom(), .5);
        assertTrue(halfy.getCountryCode().equals("USD"));
        assertTrue(halfy.getCommonName().equals("Half Dollar"));
        assertTrue(halfy.getSmelt().equals("91.67% Cu 8.33% Ni"));
    }

    @Test
    public void testDollar(){
        dollar = testMint.makeCoin(DOLLAR);
        assertEquals(dollar.getDenom(), 1.0);
        assertTrue(dollar.getCountryCode().equals("USD"));
        assertTrue(dollar.getSmelt().equals("88.5% Cu 6% Zi 3.5% Mn 2% Ni"));
        assertTrue(dollar.getCommonName().equals("Dollar"));
    }

}
