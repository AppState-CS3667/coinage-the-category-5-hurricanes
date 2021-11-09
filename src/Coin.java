
public abstract class Coin {
	protected String countryCode;
	protected double denomination;
	protected String commonName;
	protected String smelt;
	protected boolean fail;
	
	public Coin(String cc, double dnom, String cName, String _smelt, boolean _fail) {
		countryCode = cc;
		denomination = dnom;
		commonName = cName;
		smelt = _smelt;
		fail = _fail;
	}
	public String getSmelt() { return smelt; }
	public String getCommonName() { return commonName; }
	public double getDenom() { return denomination; }
	public String getCountryCode() { return countryCode; }
	public boolean getFail() { return fail; }
	public String toString() {
		String s = "Country Code: " + countryCode + "\nValue = " + denomination + "\nName: " 
				+ commonName + "\nSmelting Specs: " + smelt
				+ "\nDid coin fail inspection: " + fail;
		return s;
	}
}
