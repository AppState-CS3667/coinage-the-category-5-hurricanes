public abstract class coinMint {
	private volatile static coinMint uniqueInstance;
	
	public static coinMint getInstance() {
		if (uniqueInstance == null) {
			synchronized (coinMint.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new coinMint();
				}
			}
		}
	}
}
