package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
import java.util.Comparator;

public class App {
	public static List<String> buildApartmentsList(List<Home> apartments, int count) {
		return apartments.stream()
			.sorted(Comparator.comparingDouble(Home::getArea))
			.limit(count)
			.map(Home::toString)
			.toList();
	}
}
// END
