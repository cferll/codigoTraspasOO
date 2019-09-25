package es.unileon.prg1.square;

public class MainSquare {
	public static void main(String[] args) {
		// Declaration
		Square mySquare;
		// Creation
		mySquare = new Square(3, new Point(1,1));
		// Use
 		System.out.println(mySquare); 
		
		int whichSize;
		whichSize = mySquare.getSize();
		whichSize = 5;
 		System.out.println(mySquare); 
		
		Point whichOrigin;
		whichOrigin = mySquare.getOrigin();
		whichOrigin.moveTo(0, 0);
 		System.out.println(mySquare); 
	}

}
