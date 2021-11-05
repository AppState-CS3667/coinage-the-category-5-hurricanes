import java.util.Random;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class CadCoinMintTest {

    public volatile static int globalCounter = 0; //this is to keep track
                                    // of how many attempts to access
                                    // getinstance have been made,
                                    // i don't particularly care
                                    // whether this variable is strictly threadsafe
                                    // since the point is just to check the 
                                    // instance every few accesses

    public static CadCoinMint oneMint;
    public static CadCoinMint anotherMint;

    @Test
    public static void testGetInstance(){

        Thread[] tpool = new Thread[100];
        for(int i = 0; i < 100; i ++){
            tpool[i] = new Thread(new CadInstanceJob());
        }

        for (Thread t : tpool){
            t.start();
        }


    }

    public static void checkResult(){
        assertTrue(oneMint == anotherMint);
    }
    
    @Test
    public static void testMakeToonieCoin() {
    	Coin tc = oneMint.makeCoin(2);
    	
    	assertTrue(tc.instanceOf(Toonie));
    }
    
    @Test
    public static void testMakeLoonieCoin() {
    	Coin lc = oneMint.makeCoin(1);
    	
    	assertTrue(lc.instanceOf(Loonie));
    }
    
    @Test
    public static void testMakeFiftyCent() {
    	Coin fcc = oneMint.makeCoin(0.50);
    	
    	assertTrue(fcc.instanceOf(FiftyCent));
    }
    
    @Test
    public static void testMakeCadQuarterCoin() {
    	Coin cqc = oneMint.makeCoin(0.25);
    	
    	assertTrue(cqc.instanceOf(CadQuarter));
    }
    
    @Test
    public static void testMakeCadDimeCoin() {
    	Coin cdc = oneMint.makeCoin(0.10);
    	
    	assertTrue(cdc.instanceOf(CadDimeCoin));
    }
    
    @Test
    public static void testMakeCadNickel() {
    	Coin cn = oneMint.makeCoin(0.05);
    	
    	assertTrue(cn.instanceOf(CadNickelCoin));
    }
}

class CadInstanceJob implements Runnable{

    public void run(){

        CadCointMintTest.globalCounter++;

        Random rand = new Random();
        int coin = rand.nextInt(2);
        if(coin == 0)
            oneMint = CadCoinMint.getInstance();
        if(coin == 1)
            anotherMint = CadCoinMint.getInstance();
        if(CadCoinMintTest.globalCounter % 3 == 0)
            CadCoinMintTest.checkResult();

    }
}
