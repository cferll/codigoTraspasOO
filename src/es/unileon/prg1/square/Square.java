package es.unileon.prg1.square;

class Square {
	
	int size;
	Point origin;

	Square (int size, Point origin) {
		this.size = size;
		this.origin = origin;
	}

	int getSize() {
		return this.size;
	}

	Point getOrigin() {
		return this.origin;
	}

}
