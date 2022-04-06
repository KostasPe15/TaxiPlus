import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Fleet> fleetList = new ArrayList<Fleet>();
		
		Fleet Heraklion = new Fleet("Heraklion");
		Fleet Rethymno = new Fleet("Rethymno");
		
		ElectricalTaxi et1 = new ElectricalTaxi("KIZ2343","Haris Papadopoulos",10);
		ElectricalTaxi et2 = new ElectricalTaxi("KIZ9685","Jack Kyriakoy",13);
		
		GasolineTaxi gt1 = new GasolineTaxi("KIZ5236","George Pappas",100,9);
		GasolineTaxi gt2 = new GasolineTaxi("KIZ4789","Ivan Petrov",120,10);
		
		Heraklion.storeTaxi(et1);
		Heraklion.storeTaxi(gt1);
		
		Rethymno.storeTaxi(et2);
		Rethymno.storeTaxi(gt2);
		
		fleetList.add(Heraklion);
		fleetList.add(Rethymno);
		
		new Gui(fleetList);
		
	}

}
