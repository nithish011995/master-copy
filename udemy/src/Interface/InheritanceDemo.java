package Interface;

public class InheritanceDemo implements Shape {

	@Override
	public void circle() {
		System.out.println("cicle");
		
	}
	
	public static void main(String[] args) {
		
		InheritanceDemo a=new InheritanceDemo();
		a.circle();
		a.square();
		Shape.rectangle();
	}

}
