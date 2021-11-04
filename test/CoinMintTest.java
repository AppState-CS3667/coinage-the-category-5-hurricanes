import java.lang.String;

private final PrintStream originalOut = System.out;
private static ByteArrayOutputStream baos;
private static PrintStream newOut;


public class CoinMintTest{

    private static CoinMint testMint;
    private static String expectedOutput;
    private static String actualOutput;
    private static String process;
    private String prefix;

    @BeforeEach
    public static void setUp(){
        testMint = CoinMint.new DummyCoinMint();
        private final PrintStream originalOut = System.out;
        private static ByteArrayOutputStream baos;
        private static PrintStream newOut;

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
        || actualOutput == "")
            actualOutput = temp;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public static void testManufacture(){
        prefix = "Smelting some amount of metal...\n";
        testMint.manufacture();
    }

    @Test 
    public static void testInspectPass(){
        prefix = "Inspecting the coin...\n";
        Processes process = Processes.INSPECT;
        for (int i = 0; i < 1000; i+=){
            testMint.inspect();
            if (testMint.getFail()){
                String suffix = String.format(("Oh no! The %s process failed!", process.toString()));
                expectedOutput = prefix + suffix;
            }else{
                expectedOutput = prefix;
            }
            checkResult();
        }
    }
    

}
