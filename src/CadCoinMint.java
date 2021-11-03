public class CadCoinMint extends CoinMint {
	private volatile static CadCoinMint uniqueInstance;
	
	public static CadCoinMint getInstance() {
		if (uniqueInstance == null) {
			synchronized (CadCoinMint.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new CadCoinMint();
				}
			}
		}
	}
}
