/**
 * @author coinage-the-category-5-hurricanes
 * @version 1.0
 * The usd coin factory.
 */
public class UsdCoinMint extends CoinMint {

    private volatile static UsdCoinMint uniqueInstance;
/**
 * The constructor for UsdCoinMint.
 */	
    public UsdCoinMint() { }
/**
 * @return UsdCoinMint for singleton purposes.
 */
    public static UsdCoinMint getInstance() {
	if (uniqueInstance == null) {
	    synchronized (UsdCoinMint.class) {
		if (uniqueInstance == null) {
		    uniqueInstance = new UsdCoinMint();
	        }
	    }
        }
        return uniqueInstance;
    }
/**
 * @param denom for the denomonation of coin.
 * @return Coin for the coin that is made.
 * Method that  is the whole purpose of usd coin factory.
 */	
    public Coin makeCoin(double denom) {
	smelt(denom);
	imprint();
	inspect();
	smoothe();
	buff();
	
	if (denom == 1) {
	    return new Dollar(fail);
	}
	
	else if (denom == 0.50) {
	    return new HalfDollar(fail);
	}
	
	else if (denom == 0.25) {
	    return new Quarter(fail);
	}
	
	else if (denom == 0.10) {		
	    return new Dime(fail);
	}
	
	else if (denom == 0.05) {
	    return new Nickel(fail);
	}
	
	else if (denom == 0.01) {
	    return new Penny(fail);
	}
	
	else {
	    return NullCoin.getInstance();
	}
    }
/**
 * @param denom for the denomination.
 * The smelting process for the usd coin made.
 */	
    public void smelt(double denom) {
	if (denom == 1) {
	    System.out.println("Smelting coin with:"
		+ "\n\t88.5% Cu"
		+ "\n\t6% Zi"
		+ "\n\t3.5% Mn"
		+ "\n\t2% Ni");
	}
		
	else if (denom == 0.50 || denom == 0.25 || denom == 0.10) {
	    System.out.println("Smelting coin with:"
		+ "\n\t91.67% Cu"
		+ "\n\t8.33% Ni");
	}
	
	else if (denom == 0.05) {
	    System.out.println("Smelting coin with:"
		+ "\n\t75% Cu"
		+ "\n\t25% Ni");
	}
	
	else if (denom == 0.01) {
	    System.out.println("Smelting coin with:"
		+ "\n\t2.5% Cu"
		+ "\n\t97.5% Zi");
	}
	
	else {
	    System.out.println("Smelting some amount of metal...");
	}
    }
}
