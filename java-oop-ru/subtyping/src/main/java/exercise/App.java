package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
	public static void swapKeyValue(KeyValueStorage db) {
		var map = db.toMap();
		for (var entry : map.entrySet()) {
			db.unset(entry.getKey());
			db.set(entry.getValue(), entry.getKey());
		}
	}
}
// END
