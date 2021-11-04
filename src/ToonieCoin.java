
public ToonieCoin extends coin {
	public ToonieCoin(bool _fail) {
		bool fail = _fail;
		double deno = 2.0;
		String commonName = "Toonie"
		String cc = "CAD";
		String smelt = "Unknown";
		super(cc, deno, commonName, smelt, fail);
	}
}
