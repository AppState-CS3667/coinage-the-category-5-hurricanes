
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class UsdCoinTest{

    public static Quarter quarter;
    public static Nickel nickel;
    public static Dime dime;
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
	dime = null;

    }


    @Test
    public static void testQuarter(){
        quarter = testMint.makeCoin(QUARTER);
        assertEquals(quarter.getDenom(), 0.25);
        assertTrue(quarter.getCommonName().equals("Quarter"));
        assertTrue(quarter.getCountryCode().equals("USD"));
        assertTrue(quarter.getSmelt().equals("Unknown"));
    }

}
