
public abstract class Taxi {
	protected String ak;
	protected String name;
	
	public Taxi(String ak, String name) {
		super();
		this.ak = ak;
		this.name = name;
	}
	
	
	
	public String getAk() {
		return ak;
	}



	public void setAk(String ak) {
		this.ak = ak;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public abstract double autonomia ();
}
