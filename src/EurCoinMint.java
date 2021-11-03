public class EurCoinMint extends CoinMint {
	private volatile static UsdCoinMint uniqueInstance;
	
	public static EurCoinMint getInstance() {
		if (uniqueInstance == null) {
			synchronized (EurCoinMint.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new EurCoinMint();
				}
			}
		}
	}
}
