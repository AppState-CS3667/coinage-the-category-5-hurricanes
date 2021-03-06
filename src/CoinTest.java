import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.util.concurrent.Executors; 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.lang.String;
import java.lang.InterruptedException;
import java.util.concurrent.ExecutionException;

public class CoinTest {
    private static Coin testCoin;
    private static String expectedOutput;
    private static String actualOutput;
    private static final String nullOutput = "";

    public CoinTest(){}

    @BeforeEach
    public void setUp(){
        testCoin = NullCoin.getInstance();
    }

    @AfterEach
    public void cleanUp(){
        checkResult();
        testCoin = null;
    }

    public void checkResult(){
        assertTrue(actualOutput.equals(expectedOutput));
    }
    
    @Test
    public void testGetInstance(){
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

            try{
                assertTrue(oneResult.get() == anotherResult.get());
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }catch(ExecutionException ee){
                ee.printStackTrace();
            }

        }
    }

    @Test
	public void testGetSmelt() { 
        expectedOutput = nullOutput;
        actualOutput = testCoin.getSmelt();

    }

    @Test
	public void testGetCommonName() {
        actualOutput = testCoin.getCommonName();
        expectedOutput = nullOutput;
    }

    @Test
	public void testGetDenom() {
        actualOutput = String.valueOf(testCoin.getDenom());
        expectedOutput = String.valueOf(0.0d);;
    }

    @Test
	public void testGetCountryCode() {
        actualOutput = testCoin.getCountryCode();
        expectedOutput = nullOutput;
    }

}
