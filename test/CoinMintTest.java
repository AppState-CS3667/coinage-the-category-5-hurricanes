public class CoinMintTest{

    private static CoinMint testMint;
    private static String expectedOutput;
    private static String actualOutput;

    @BeforeEach
    public static void setUp(){
        testMint = CointMint.new DummyCoinMint();

    }

    @AfterEach
    public static void cleanUp(){
        checkResult();
    } 

    public static void checkResult(){
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public static testManufacture(){
        expectedOutput = "Smelting some amount of metal...";
        actualOutput = testMint.manufacture();
    }

}
