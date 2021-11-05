public class FormatCoin extends Coin {
	public FormatCoin(String cc, double dnom, String cName, String _smelt, boolean _fail) {
		super(cc, dnom, cName, _smelt, _fail);
	}

	public String toString() {
		String s = "Country Code: " + countryCode + "\nValue = " + denomination + "0\nName: " 
				+ commonName + "\nSmelting Specs: " + smelt
				+ "\nDid coin fail inspection: " + fail;
		return s;
	}
}
