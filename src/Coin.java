
public abstract class Coin {
	private String countryCode;
	private int denomination;
	private String commonName;
	private CoinMint mint;
	private String smelt;
	public Coin(String cc, int dnom, String cName, CoinMint _mint, String _smelt) {
		countryCode = cc;
		denomination = dnom;
		commonName = cName;
		mint = _mint;
		smelt = _smelt;
	}
	public String getSmelt() { return smelt; }
	public CoinMint getmint() { return mint; }
	public String getcommonName() { return commonName; }
	public int getDenom() { return denomination; }
	public String getCountryCode() { return countryCode; }
}
