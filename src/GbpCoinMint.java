public class GbpCointMint extends CoinMint {
	private volatile static GbpCoinMint uniqueInstance;
	
	public static GbpCoinMint getInstance() {
		if (uniqueInstance == null) {
			synchronized (UsdGbpMint.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new GbpCoinMint();
				}
			}
		}
	}
}
