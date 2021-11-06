import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.util.concurrent.Executors; 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class CoinTest {
    private static Coin testCoin;
    private static String expectedOutput;
    private static String actualOutput;
    private static final String nullOutput = "";

    @BeforeEach
    public static void setUp(){
        testCoin = NullCoin.getInstance();
    }

    @AfterEach
    public static void cleanUp(){
        checkResult();
        testCoin = null;
    }

    public static void checkResult(){
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public static void testGetInstance(){
        ExecutorService tpool = Executors.newFixedThreadPool(100);
        for(int i = 0; i < 100; ++i){
            Future<Coin> oneResult = tpool.submit(()->{
                Thread.sleep(10);
                return NullCoin.getInstance();
            });

            Future<Coin> anotherResult = tpool.submit(()->{
                Thread.sleep(10);
                return NullCoin.getInstance();
            });

            assertTrue(oneResult.get() == anotherResult.get());

        }
    }


	public static void testGetSmelt() { 
        expectedOutput = nullOutput;
        actualOutput = testCoin.getSmelt();

    }
	public static void testGetCommonName() {
        actualOutput = testCoin.getCommonName();
        expectedOutput = nullOutput;
    }
	public static void testGetDenom() {
        actualOutput = testCoin.getDenom();
        expectedOutput = nullOutput;
    }


	public static void testGetCountryCode() {
        actualOutput = testCoin.getCountryCode();
        expectedOutput = nullOutput;
    }

}
