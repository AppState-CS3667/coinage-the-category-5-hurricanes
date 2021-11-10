/**
 * @author coinage-the-category-5-hurricanes
 * @version 1.0
 * cadickel class for the canadian nickel.
 */
public class CadNickel extends Coin {
/**
 * the constuctor for CadNickel.
 * @param fail for if the coin failed in making.
 */
    public CadNickel(boolean fail) {
	super("CAD", 0.05, "Nickel", "Unknown", fail);
    }
}
