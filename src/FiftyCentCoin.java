package src;

public FiftyCentCoin extends coin {
	public FiftyCentCoin(boolean _fail) {
		boolean fail = _fail;
		double deno = .5;
		String commonName = "FiftyCent"
		String cc = "CAD";
		String smelt = "Unknown";
		super(cc, deno, commonName, smelt, fail);
	}
}