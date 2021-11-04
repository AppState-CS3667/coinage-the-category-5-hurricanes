
public NickelCoin extends coin {
	public NickelCoin(bool _fail) {
		bool fail = _fail;
		double deno = .05;
		String commonName = "Nickel"
		String cc = "CAD";
		String smelt = "Unknown";
		super(cc, deno, commonName, smelt, fail);
	}
}
