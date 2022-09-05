package objectarray;

public class Operation {

	String[] stops1 = { "Virar", "Borivali", "Andheri" };
	LocalTrain lt1 = new LocalTrain(1, "Virar", "Churchgate", "Western", stops1);

	String[] stops2 = { "Virar", "Bhayandar", "Borivali" };
	LocalTrain lt2 = new LocalTrain(2, "Virar", "Borivali", "Western", stops2);

	String[] stops3 = { "Kalyan", "Thane", "Kurla", "Dadar" };
	LocalTrain lt3 = new LocalTrain(4, "Kalyan", "Dadar", "Central", stops3);

	String[] stops4 = { "Thane", "Rabale", "Ghansoli", "Vashi" };
	LocalTrain lt4 = new LocalTrain(3, "Thane", "Vashi", "Harbour", stops4);

	String[] stops5 = { "Virar", "Bhayandar", "Borivali", "Dadar", "Mumbai Central", "Churchgate" };
	LocalTrain lt5 = new LocalTrain(5, "Virar", "Dadar", "Western", stops5);
	
	String[] stops6 = { "Virar","Vasai", "Bhayandar", "Borivali","Andheri" , "Bandra", "Dadar", "Mumbai Central", "Churchgate" };
	LocalTrain lt6 = new LocalTrain(6, "Virar", "Churchgate", "Western", stops6);
	
	String[] stops7 = { "CSMT","Byculla", "Dadar", "Kurla","Ghatkopar" , "Bhandup", "Mulund", "Thane" };
	LocalTrain lt7 = new LocalTrain(6, "CSMT", "Thane", "Central", stops7);
	
	String[] stops8 = { "Thane","Mulund", "Bhandup", "Kurla","Dadar" , "Byculla", "CSMT" };
	LocalTrain lt8 = new LocalTrain(7, "Thane", "CSMT", "Central", stops8);

	LocalTrain ltArray[] = { lt1, lt2, lt3, lt4, lt5, lt6, lt7, lt8 };

	public void searchById(int id) {
		LocalTrain train = null;
		for (LocalTrain local : ltArray) {
			if (local.getId() == id) {
				System.out.println(local);
			}
		}
		
	}

	public void searchBySource(String src) {

		for (LocalTrain local : ltArray) {

			if (local.getSource().equals(src)) {
				System.out.println(local);

			}
		}

	}

	public void searchByDestination(String destn) {
		for (LocalTrain local : ltArray) {

			if (local.getDestination().equals(destn)) {
				System.out.println(local);

			}
		}
	}

	public void searchBySourceAndDestination(String src, String destn) {
		for (LocalTrain local : ltArray) {

			
			if (local.getSource().equals(src)) {
				
				
				if(local.getDestination().equals(destn)) {
					System.out.println(local);
				}

			}
		}
	}

	public void searchByLine(String trainType) {
		for (LocalTrain local : ltArray) {

			if (local.getType().equals(trainType)) {
				System.out.println(local);

			}
		}
	}

	public void searchByStation(String station) {
		for (LocalTrain local : ltArray) {

			for(String l:local.getStops()) {
				if(l.equals(station)) {
					System.out.println(local);
				}
			}
		}
	}
	
	public void displayTrains() {
		for(LocalTrain local: ltArray) {
			System.out.println(local);
		}
	}
}
