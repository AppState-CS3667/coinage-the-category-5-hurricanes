import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.lang.InterruptedException;

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

    public CadCoinMintTest(){}

    @Test
    public void testGetInstance(){

        oneMint = null;

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

    @BeforeEach
    public void initializeMint(){
        oneMint = CadCoinMint.getInstance();
    }

    @AfterEach
    public void destroyMint(){
        oneMint = null;
    }
    
    @Test
    public void testMakeToonie() {
    	Coin tc = oneMint.makeCoin(2);

    	
    	assertTrue(tc instanceof Toonie);
    }
    
    @Test
    public void testMakeLoonie() {
    	Coin lc = oneMint.makeCoin(1);
    	
    	assertTrue(lc instanceof Loonie);
    }
    
    @Test
    public void testMakeFiftyCent() {
    	Coin fcc = oneMint.makeCoin(0.50);
    	
    	assertTrue(fcc instanceof FiftyCent);
    }
    
    @Test
    public void testMakeCadQuarter() {
    	Coin cqc = oneMint.makeCoin(0.25);
    	
    	assertTrue(cqc instanceof CadQuarter);
    }
    
    @Test
    public void testMakeCadDime() {
    	Coin cdc = oneMint.makeCoin(0.10);
    	
    	assertTrue(cdc instanceof CadDime);
    }
    
    @Test
    public void testMakeCadNickel() {
    	Coin cn = oneMint.makeCoin(0.05);
    	
    	assertTrue(cn instanceof CadNickel);
    }

}

class CadInstanceJob implements Runnable{

    public void run(){

        CadCoinMintTest.globalCounter++;

        Random rand = new Random();
        int coin = rand.nextInt(2);
        if(coin == 0)
           CadCoinMintTest.oneMint = CadCoinMint.getInstance();
        if(coin == 1)
            CadCoinMintTest.anotherMint = CadCoinMint.getInstance();
        if(CadCoinMintTest.globalCounter % 3 == 0)
            CadCoinMintTest.checkResult();

    }
}
