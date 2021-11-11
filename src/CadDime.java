/**
 * @author coinage-the-category-5-hurricanes
 * @version 1.0
 * canadian dime object.
 */
public class CadDime extends FormatCoin {
/**
 * @param fail for if the creation of this coin was sucessfull.
 * the constructor of the cadDime which mostly just calls the coin super.
 */
    public CadDime(boolean fail) {
	super("CAD", 0.10, "Dime", "Unknown", fail);
    }
}
