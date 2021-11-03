
public abstract class Coin {
	private String countryCode;
	private double denomination;
	private String commonName;
	private String smelt;
	public Coin(String cc, double dnom, String cName, String _smelt) {
		countryCode = cc;
		denomination = dnom;
		commonName = cName;
		smelt = _smelt;
	}
	public String getSmelt() { return smelt; }
	public String getcommonName() { return commonName; }
	public double getDenom() { return denomination; }
	public String getCountryCode() { return countryCode; }
}
