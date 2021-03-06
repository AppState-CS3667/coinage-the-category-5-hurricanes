/**
 * @author coinage-the-category-5-hurricanes
 * @version 1.0
 * demo class
 */

public class Demo {
/**
 * the main statment. 
 * @param args for the arguments.
 */
    public static void main(String[] args) {
	CadCoinMint cadmint = CadCoinMint.getInstance();
	UsdCoinMint usdmint = UsdCoinMint.getInstance();
	
	Coin coin = null;
	
	System.out.println("Making a Dollar coin.\n======="
	    + "=================================");
	coin = usdmint.makeCoin(1);
	System.out.println(coin);
	
	System.out.println("\nMaking a Half Dollar coin.\n===="
	    + "====================================");
	coin = usdmint.makeCoin(0.5);
	System.out.println(coin);
	
	System.out.println("\nMaking a Quarter.\n===="
	    + "====================================");
	coin = usdmint.makeCoin(0.25);
	System.out.println(coin);
		
	System.out.println("\nMaking a Dime.\n====="
	    + "===================================");
	coin = usdmint.makeCoin(0.10);
	System.out.println(coin);
	
	System.out.println("\nMaking a Nickel.\n===="
	    + "====================================");
	coin = usdmint.makeCoin(0.05);
	System.out.println(coin);
	
	System.out.println("\nMaking a Penny.\n====="
	    + "===================================");
	coin = usdmint.makeCoin(0.01);
	System.out.println(coin);
	
	System.out.println("\nMaking a Toonie.\n======="
	    + "=================================");
	coin = cadmint.makeCoin(2);
	System.out.println(coin);
	
	System.out.println("\nMaking a Loonie.\n===="
	    + "====================================");
	coin = cadmint.makeCoin(1);
	System.out.println(coin);
	
	System.out.println("\nMaking a Fifty Cent.\n===="
	    + "====================================");
	coin = cadmint.makeCoin(0.50);
	System.out.println(coin);
	
	System.out.println("\nMaking a Canadian Quarter.\n==="
	    + "=====================================");
	coin = cadmint.makeCoin(0.25);
	System.out.println(coin);
	
	System.out.println("\nMaking a Canadian Dime.\n==="
	    + "=====================================");
	coin = cadmint.makeCoin(0.10);
	System.out.println(coin);
	
	System.out.println("\nMaking a Canadian Nickel.\n===="
	    + "====================================");
	coin = cadmint.makeCoin(0.05);
	System.out.println(coin);
		
	System.out.println("\n\nMaking and printing "
	    + "quarters until one fails...\n");
	
	Coin failCoin = usdmint.makeCoin(0.25);
	System.out.println("\n" + failCoin);
	
	while (!failCoin.getFail()) {
	    failCoin = usdmint.makeCoin(0.25);
	    System.out.println("\n" + failCoin + "\n");
	}
    }
}
