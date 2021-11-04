public class USDCoinTest{

    public QuarterCoin quarter;
    public NickelCoin nickel;
    public DimeCoin dime;
    public static UsdCoinMint testMint;
   
    @BeforeEach
    public static void setUp(){
        testMint = UsdCoinMint.getInstance();
    }

}