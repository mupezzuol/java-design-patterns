package bridgesAndAdapters.bridge;

import java.io.InputStream;
import java.net.URL;

public class GoogleMap implements IMap {

	@Override
	public String returnMap(String street) {
		try {
			String googleMaps = "https://www.google.com/maps/place/Reading/";
			URL url = new URL(googleMaps);
			InputStream openStrem = url.openStream();
			// ....
			return "map..";
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
