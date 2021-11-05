import java.util.Random;

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

        Thread[] tpool = new Thread[100];
        for(int i = 0; i < 100; i ++){
            tpool[i] = new Thread(new InstanceJob());
        }

        for (Thread t : tpool){
            t.start();
        }


    }

    public static void checkResult(){
        assertTrue(oneMint == anotherMint);
    }

}

class InstanceJob implements Runnable{

    public void run(){

        UsdCoinMintTest.globalCounter++;

        Random rand = new Random();
        int coin = rand.nextInt(2);
        if(coin == 0)
            oneMint = UsdCoinMint.getInstance();
        if(coin == 1)
            anotherMint = UsdCoinMint.getInstance();
        if(UsdCoinMintTest.globalCounter % 3 == 0)
            UsdCoinMintTest.checkResult();

    }
}
