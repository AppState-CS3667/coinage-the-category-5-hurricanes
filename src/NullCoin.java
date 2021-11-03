
public NullCoin extends Coin {
	private static NullCoin n = new NullCoin();
	private NullCoin() {
	}
	public NullCoin getInstance() {
		return n;
	}
	public String getSmelt() { return ""; }
	public String getmint() { return ""; }
	public String getcommonName() { return ""; }
	public int getDenom() { return 0; }
	public String getCountryCode() { return ""; }
}
