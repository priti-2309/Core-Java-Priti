package Lab;

class HillStation{
	public void location() {
		System.out.println("This Hill Station is located in");
	}
	
	public void famousFor() {
		System.out.println("This place is famous for");
	}
}

class Manali extends HillStation{	
	public void location() {
		System.out.println("Manali is located in Himachal Pradesh");
	}
	
	public void famousFor() {
		System.out.println("This place is famous for its snowy mountains");
	}
}

class Mussoorie extends HillStation{
	public void location() {
		System.out.println("Mussoorie is located in Dehradun");
	}
	
	public void famousFor() {
		System.out.println("This place is famous for its scenic beauty");
	}
}

class Gulmarg extends HillStation{
	public void location() {
		System.out.println("Gulmarg is located in Kashmir");
	}
	
	public void famousFor() {
		System.out.println("This place is famous for its scenic beauty");
	}
}

public class HillStationsInfo {

	public static void main(String[] args) {
		Manali m=new Manali();
		m.location();
		m.famousFor();
		Mussoorie m1=new Mussoorie();
		m1.location();
		m1.famousFor();
		Gulmarg g=new Gulmarg();
		g.location();
		g.famousFor();
	}

}
