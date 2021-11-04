package src;

public class LoonieCoin extends Coin {
	public LoonieCoin(boolean _fail) {
		boolean fail = _fail;
		double deno = 1.0;
		String commonName = "Loonie"
		String cc = "CAD";
		String smelt = "Unknown";
		super(cc, deno, commonName, smelt, fail);
	}
}
