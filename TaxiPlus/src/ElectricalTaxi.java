
public class ElectricalTaxi extends Taxi {
	
	private int batteries;

	public ElectricalTaxi(String ak, String name, int batteries) {
		super(ak, name);
		this.batteries = batteries;
	}

	@Override
	public double autonomia() {
		return 70*this.batteries;
	}

}
