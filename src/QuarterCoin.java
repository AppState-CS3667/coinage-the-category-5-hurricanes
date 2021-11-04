package src;

public QuarterCoin extends coin {
	public QuarterCoin(bool _fail) {
		bool fail = _fail;
		double deno = .25;
		String commonName = "Quarter"
		String cc = "CAD";
		String smelt = "Unknown";
		super(cc, deno, commonName, smelt, fail);
	}
}
