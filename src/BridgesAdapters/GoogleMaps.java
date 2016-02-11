package BridgesAdapters;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GoogleMaps implements Mapa{

	@Override
	public String devolveMapa(String rua) throws Exception {
		try {
			
			String googleMaps = "https://maps.google.com.br/maps?q=endereco+aqui";
			URL url = new URL(googleMaps);
			InputStream inputStream = url.openStream();
			
			//TODO
			
			return "mapa";
			
		} catch (Exception e) {
				throw new RuntimeException(e);
		}
		
	}

}
