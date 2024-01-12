package Interface;

public interface Shape {
	
	void circle();
	
	default void square() {
		System.out.println("square");
	}
	
	 static void rectangle() {
		System.out.println("rectangle");
	}

}
