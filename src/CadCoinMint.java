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
		manufacture();
		inspect();
		smoothe();
		buff();
		
		if (denom == 2 ) {
			return new ToonieCoin(fail);
		}
		
		else if (denom == 1) {
			return new LoonieCoin(fail);
		}
		
		else if (denom == 0.50) {
			return new FiftyCent(fail);
		}
		
		else if (denom == 0.25) {
			return new CADQuarter(fail);
		}
		
		else if (denom == 0.10) {
			return new CADDime(fail);
		}
		
		else if (denom == 0.05) {
			return new CADDNickel(fail);
		}
		
		else {
			return NullCoin.getInstance();
		}
	}
}
