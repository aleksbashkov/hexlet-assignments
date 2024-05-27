package exercise;

// BEGIN
public class Cottage implements Home {
	private double area;
	private int floorCount;

	public Cottage(double area, int floorCount) {
		this.area = area;
		this.floorCount = floorCount;
	}


	@Override
	public String toString() {
		return floorCount + " этажный коттедж площадью " + area + " метров" ;
	}
/*
	@Override
	public int compareTo(Home another) {
		var area1 = getArea();
		var area2 = another.getArea();
		if (area1 == area2) {
			return 0;
		} else if (area1 > area2) {
			return 1;
		} else {
			return -1;
		}
	}
*/
	@Override
	public double getArea() {
		return area;
	}
}
// END
