import java.lang.String;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;



public class CoinMintTest{

    private static CoinMint testMint;
    private static String expectedOutput;
    private static String actualOutput;
    private static String process;
    private static String prefix;

    private static final PrintStream originalOut = System.out;
    private static ByteArrayOutputStream baos;
    private static PrintStream newOut;

    @BeforeEach
    public static void setUp(){
        testMint = new DummyCoinMint();
        originalOut = System.out;

    }

    @AfterEach
    public static void cleanUp(){
        checkResult();
        System.setOut(originalOut);
    } 

    public static void checkResult(){ // this silly little function means you only need one 
        String temp = actualOutput;
        System.out.flush();
        if ((actualOutput = baos.toString()) == null 
        || actualOutput == ""){
            actualOutput = temp;
	}
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public static void testManufacture(){

    }

    @Test 
    public static void testInspect(){
        prefix = "Inspecting the coin...\n";
        Processes process = Processes.INSPECT;
        for (int i = 0; i < 1000; i++){
            testMint.inspect();
            if (testMint.getFail()){
                String suffix = String.format("Oh no! The %s process failed!", process.toString());
                expectedOutput = prefix + suffix;
                testMint.resetFail();
            }else{
                expectedOutput = prefix;
            }
            checkResult();
        }
    }
    
    @Test
    public static void testBuff(){
        prefix = "Buffing the metal. This won't remain shiny for long.";
        Processes process = Processes.BUFF;
        for (int i = 0; i < 1000; i++){
            testMint.inspect();
            if (testMint.getFail()){
                String suffix = String.format("Oh no! The %s process failed!", process.toString());
                expectedOutput = prefix + suffix;
                testMint.resetFail();
            }else{
                expectedOutput = prefix;
            }
            checkResult();
        }
    }

    @Test
    public static void testSmoothe(){
        prefix = "Buffing the metal. This won't remain shiny for long.";
        Processes process = Processes.SMOOTHE;
        for (int i = 0; i < 1000; i++){
            testMint.inspect();
            if (testMint.getFail()){
                String suffix = String.format("Oh no! The %s process failed!", process.toString());
                expectedOutput = prefix + suffix;
                testMint.resetFail();
            }else{
                expectedOutput = prefix;
            }
            checkResult();
        }
    }

}
