public class UsdCoinMint extends CoinMint {
	private volatile static UsdCoinMint uniqueInstance;
	
	public UsdCoinMint() {}
	
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
	
	public class CadCoinMint extends CoinMint {
		private String countryCode = "CAD";
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
			manufacture();
			inspect();
			smoothe();
			buff();
			
			if (denom == 1) {
				return new LoonieCoin();
			}
			else {
				return new NullCoin();
			}
		}
	}

}
