
public abstract Coin {
	public String countryCode;
	private int denomination;
	private String commonName;
	private CoinMint mint;
	private String smelt;
	public Coin(String cc, int dnom, String cName, CoinMint _mint) {
		countryCode = cc;
		denomination = dnom;
		commonName = cName;
		mint = _mint;
	}
	public getSmelt() {
		return smelt;
	}
}
