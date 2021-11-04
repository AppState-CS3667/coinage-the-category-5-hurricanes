
public class ToonieCoin extends coin {
	public ToonieCoin(boolean _fail) {
		boolean fail = _fail;
		double deno = 2.0;
		String commonName = "Toonie"
		String cc = "CAD";
		String smelt = "Unknown";
		super(cc, deno, commonName, smelt, fail);
	}
}
