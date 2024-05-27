package exercise;

// BEGIN
public interface Home {
	double getArea();
	default int compareTo(Home another) {
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
}
// END
