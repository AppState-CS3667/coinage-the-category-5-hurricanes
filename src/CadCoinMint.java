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
		
		if (denom == 1) {
			return new LoonieCoin(fail);
		}
		else {
			return new NullCoin();
		}
	}
}
