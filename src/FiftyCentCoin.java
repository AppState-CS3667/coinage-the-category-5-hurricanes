
public FiftyCentCoin extends coin {
	public FiftyCentCoin(bool _fail) {
		bool fail = _fail;
		double deno = .5;
		String commonName = "FiftyCent"
		String cc = "CAD";
		String smelt = "Unknown";
		super(cc, deno, commonName, smelt, fail);
	}
}
