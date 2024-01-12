package Interface;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic {

	@Override
	public void green() {
		System.out.println("green");
		
	}

	@Override
	public void redstop() {
		System.out.println("red");
		
	}

	@Override
	public void flashyellow() {
		System.out.println("yellow");
		
	}
	
	public void walkonsymbol() {
		System.out.println("walk");
	}

	@Override
	public void Trainsymbol() {
		System.out.println("train");
		
	}
	
	public static void main(String[] args) {
		
		AustralianTraffic a= new AustralianTraffic();
		a.redstop();
		a.green();
		a.flashyellow();
		a.Trainsymbol();
		a.walkonsymbol();
	}
	
	

}
