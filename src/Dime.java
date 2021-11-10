/**
 * @author coinage-the-category-5-hurricanes
 * @version 1.0
 * dime class for usd coins.
 */
public class Dime extends FormatCoin {
/**
 * @param fail for if the coin failed to make.
 * the constcutor for the dime class.
 */
    public Dime(boolean fail) {
	super("USD", 0.10, "Dime", "91.67% Cu 8.33% Ni", fail);
    }
}
