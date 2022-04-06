import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Fleet {
	private String name;
	private ArrayList<Taxi> taxiList;

	public Fleet(String name) {
		super();
		this.name = name;
		this.taxiList = new ArrayList<Taxi> ();
	}
	
	public double sumAuton() {
		double sum=0;
		for(Taxi t : taxiList) {
			sum=sum+t.autonomia();
		}
		return sum;
	}
	
	public int plythos () {
		return this.taxiList.size();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void storeTaxi(Taxi aTaxi) {
		this.taxiList.add(aTaxi);	
	}  
	
	public void save () {
		try
		{
			File f = new File("iis20123.txt");
			FileWriter writer = new FileWriter(f);
			
			writer.write(this.name);
			writer.write(System.lineSeparator());
			for(Taxi t : this.taxiList) {
				writer.write(t.getName());
				writer.write(System.lineSeparator());
				writer.write(t.getAk());
				writer.write(System.lineSeparator());
				writer.write((int) t.autonomia());
				writer.write(System.lineSeparator());
			}
			writer.write((int) this.sumAuton());
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
