import java.util.Random;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class UsdCoinMintTest{

    public volatile static int globalCounter = 0; //this is to keep track
                                    // of how many attempts to access
                                    // getinstance have been made,
                                    // i don't particularly care
                                    // whether this variable is strictly threadsafe
                                    // since the point is just to check the 
                                    // instance every few accesses

    public static UsdCoinMint oneMint;
    public static UsdCoinMint anotherMint;

    @Test
    public static void testGetInstance(){

        Thread[] tpool = new Thread[1000];
        for(int i = 0; i < 1000; i ++){
            tpool[i] = new Thread(new UsdInstanceJob());
        }

        for (Thread t : tpool){
            t.start();
        }


    }

    public static void checkResult(){
        assertTrue(oneMint == anotherMint);
    }

}

class UsdInstanceJob implements Runnable{

    public void run(){

        UsdCoinMintTest.globalCounter++;

        Random rand = new Random();
        int coin = rand.nextInt(2);
        if(coin == 0)
            UsdCoinMintTest.oneMint = UsdCoinMint.getInstance();
        if(coin == 1)
            UsdCoinMintTest.anotherMint = UsdCoinMint.getInstance();
        if(UsdCoinMintTest.globalCounter % 3 == 0)
            UsdCoinMintTest.checkResult();

    }
 }

