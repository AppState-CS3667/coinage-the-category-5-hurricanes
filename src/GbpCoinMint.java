public class GbpCoinMint extends CoinMint {
	private volatile static GbpCoinMint uniqueInstance;
	
	public static GbpCoinMint getInstance() {
		if (uniqueInstance == null) {
			synchronized (GbpCoinMint.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new GbpCoinMint();
				}
			}
		}
    
		return uniqueInstance;
	}
}
