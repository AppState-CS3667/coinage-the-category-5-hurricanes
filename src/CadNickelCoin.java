package src;

public CadNickelCoin extends coin {
	public CadNickelCoin(boolean _fail) {
		boolean fail = _fail;
		double deno = .05;
		String commonName = "Nickel"
		String cc = "CAD";
		String smelt = "Unknown";
		super(cc, deno, commonName, smelt, fail);
	}
}
