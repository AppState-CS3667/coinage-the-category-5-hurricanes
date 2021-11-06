
public class NullCoin extends Coin {
	private static NullCoin n = new NullCoin();
	private NullCoin() {
		super("", 0, "", "", false);
	}
	public static NullCoin getInstance() {
		return n;
	}
	public String getSmelt() { return ""; }
	public String getCommonName() { return ""; }
	public double getDenom() { return 0; }
	public String getCountryCode() { return ""; }
	public boolean getFail() {return false; }
	public String toString() { return ""; }
}
