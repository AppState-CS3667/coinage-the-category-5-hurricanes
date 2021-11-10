/**
 * @author coinage-the-category-5-hurricanes
 * @version 1.0
 * the abstract coin that every coin object is built from.
 */
public abstract class Coin {
    protected String countryCode;
    protected double denomination;
    protected String commonName;
    protected String smelt;
    protected boolean fail;
    /**
     *  The Constructor.
     *  @param cc for the conditon code.
     *  @param dnom for the denomination.
     *  @param cName for the commonName.
     *  @param nSmelt for the smelting infromation.
     *  @param nFail for if the coin was a failure.
     */
    public Coin(String cc, double dnom, String cName, 
	String nSmelt, boolean nFail) {
	countryCode = cc;
	denomination = dnom;
	commonName = cName;
	smelt = nSmelt;
	fail = nFail;
    }
    /**
     * @return String for returning smelt.
     */
    public String getSmelt() { return smelt; }
    /**
     * @return String for the commonName.
     */ 
    public String getCommonName() { return commonName; }
    /**
     * @return double for the denomination.
     */
    public double getDenom() { return denomination; }
    /**
     * @return String for returning the countryCode.
     */
    public String getCountryCode() { return countryCode; }
    /**
     * @return boolean for the fail param.
     */
    public boolean getFail() { return fail; }
    /**
     * @return String for the toString method.
     */
    public String toString() {
	String s = "Country Code: " + countryCode + "\nValue = " 
	    + denomination + "\nName: " 
	    + commonName + "\nSmelting Specs: " + smelt
	    + "\nDid coin fail inspection: " + fail;
	return s;
    }
}
