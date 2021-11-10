/**
 * @author coinage-the-category-5-hurricanes
 * @version 1.0
 * the null coin singleton for pattern null.
 */
public class NullCoin extends Coin {
    private static NullCoin n = new NullCoin();
/**
 * the constructor for the null coin no params.
 */
    private NullCoin() {
	super("", 0, "", "", false);
    }
/**
 * @return NullCoin
 * the get instance method to make singltion.
 */
    public static NullCoin getInstance() {
 	return n;
    }
/**
 * @return String returns the smelt field.
 */
    public String getSmelt() { return ""; }
/**
 * @return String for returning null of commonname.
 */
    public String getCommonName() { return ""; }
/**
 * @return String returns the denomonation field.
 */
    public double getDenom() { return 0; }
/**
 * @return String retuns the empty string for contry code.
 */
    public String getCountryCode() { return ""; }
/**
 * @return boolean for the false fail.
 */
    public boolean getFail() { return false; }
/**
 * @return String empty string for tostring.
 */
    public String toString() { return ""; }
}
