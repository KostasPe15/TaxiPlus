
public class GasolineTaxi extends Taxi {
	
	private int rezervouar;
	private double katanalwsh;

	public GasolineTaxi(String ak, String name, int rezervouar, double katanalwsh) {
		super(ak, name);
		this.rezervouar = rezervouar;
		this.katanalwsh = katanalwsh;
	}

	@Override
	public double autonomia() {
		return 90*(this.rezervouar/this.katanalwsh);
	}

}
