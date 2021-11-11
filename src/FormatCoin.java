/**
 * @author coinage-the-category-5-hurricanes
 * @version 1.0
 * formating for coin.
 */

public class FormatCoin extends Coin {
/**
 * @param cc for condtion codes.
 * @param dnom for denomination.
 * @param cName for the common name.
 * @param smelt for the smetling info.
 * @param fail for if the coin failed.
 * the constructor for the formatCoin class.
 */
    public FormatCoin(String cc, double dnom, String cName, 
	String smelt, boolean fail) {
	super(cc, dnom, cName, smelt, fail);
    }
/**
 * @return String for the string that discribes formatCoin.
 */
    public String toString() {
	String s = "Country Code: " + countryCode + "\nValue = " 
	    + denomination + "0\nName: "  
	    + commonName + "\nSmelting Specs: " + smelt
	    + "\nDid coin fail inspection: " + fail;
	return s;
    }
}
