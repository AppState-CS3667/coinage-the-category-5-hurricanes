import java.beans.Transient;

import src.UsdCoinMint;

public class USDCoinTest{

    public Quarter quarter;
    public Nickel nickel;
    public Dime dime;
    public Dollar dollar;
    public HalfDollar halfy;
    public static UsdCoinMint testMint;

    public static final double QUARTER = .25d;
    public static final double DIME = .1d;
    public static final double NICKEL =.05d;
    public static final double PENNY = .01d;
    public static final double DOLLAR = 1d;
    public static final double HALFY = .5d;

   
    @BeforeEach
    public static void setUp(){
        testMint = UsdCoinMint.getInstance();
    }

    @AfterEach
    public static void cleanUp(){
        testMint = null;
        quarter = null;
        nickel = null;
        dime = null;
        dollar = null;
        halfy = null;
    }

    @Test
    public static void testQuarter(){
        quarter = testMint.makeCoin(QUARTER);
        assertEquals(quarter.getDenom(), .25);
        assertTrue(quarter.getCommonName().equals("quarter"));
        assertTrue(quarter.getCountryCode().equals("USD"));
        assertTrue(quarter.getSmelt().equals("Unknown"));
    }

    @Test 
    public static void testNickel(){
        nickel = testMint.makeCoin(NICKEL);
        assertEquals(nickel.getDenom(), NICKEL);
        assertTrue(nickel.getCommonName().equals("nickel"));
        assertTrue(nickel.getCountryCode().equals("USD"));
        assertTrue(nickel.getSmelt().equals("75% Cu 25% Ni"));
    }

    @Test
    public static void testDime(){
        dime = testMint.makeCoin(DIME);
        assertEquals(dime.getDenom(), DIME);
        assertTrue(dime.getCommonName().equals("dime"));
        assertTrue(dime.getCountryCode().equals("USD"));
        assertTrue(dime.getSmelt().equals("91.67% Cu 8.33% Ni"));
    }

    @Test
    public static void testPenny(){
        penny = testMint.makeCoin(PENNY);
        assertEquals(penny.getDenom(), PENNY);
        assertTrue(penny.getCommonName().equals("penny"));
        assertTrue(penny.getCountryCode().equals("USD"));
        assertTrue(penny.getSmelt().equals("91.67% Cu 8.33% Ni"));
    }

    @Test
    public static void testDollar(){
        dollar = testMint.makeCoin(DOLLAR);
        assertEquals(dollar.getDenom(),DOLLAR);
        assertTrue(dollar.getCommonName().equals("dollar"));
        assertTrue(dollar.getCountryCode().equals("USD"));
        assertTrue(dollar.getSmelt().equals("91.67% Cu 8.33% Ni"));
    }

    @Test
    public static void testHalfy(){
        halfy = testMint.makeCoin(HALFY);        
        assertEquals(half.getCommonName(),HALFY);
        assertTrue(halfy.getCommonName().equals("91.67% Cu 8.33% Ni"));
        assertTrue(halfy.getCountryCode().equals("USD"));
        asserTrue(halfy.getSmelt().equals("91.67% Cu 8.33% Ni"));
    }
}