package es.unileon.prg1.square;

class Point {
	int x;
	int y;
	
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}

}
