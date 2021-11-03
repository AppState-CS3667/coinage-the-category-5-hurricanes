public class UsdCointMint extends CoinMint {
	private volatile static UsdCoinMint uniqueInstance;
	
	public static UsdCoinMint getInstance() {
		if (uniqueInstance == null) {
			synchronized (UsdCoinMint.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new UsdCoinMint();
				}
			}
		}
	}
}
