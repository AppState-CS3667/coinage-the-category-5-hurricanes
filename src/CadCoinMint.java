
public class CadCoinMint extends CoinMint {
	private volatile static CadCoinMint uniqueInstance;
	
	public CadCoinMint() {};
	
	public static CadCoinMint getInstance() {
		if (uniqueInstance == null) {
			synchronized (CadCoinMint.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new CadCoinMint();
				}
			}
		}
		return uniqueInstance;
	}
	
	public Coin makeCoin(double denom) {
		fail = false;
		smelt();
		imprint();
		inspect();
		smoothe();
		buff();
		
		if (denom == 2) {
			return new Toonie(fail);
		}
		
		else if (denom == 1) {
			return new Loonie(fail);
		}
		
		else if (denom == 0.50) {
			return new FiftyCent(fail);
		}
		
		else if (denom == 0.25) {
			return new CadQuarter(fail);
		}
		
		else if (denom == 0.10) {
			return new CadDime(fail);
		}
		
		else if (denom == 0.05) {
			return new CadNickel(fail);
		}
		
		else {
			return NullCoin.getInstance();
		}
	}
}
