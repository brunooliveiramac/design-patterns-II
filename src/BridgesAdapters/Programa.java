package BridgesAdapters;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;

public class Programa {

	
		public static void main(String[] args) throws Exception {
			
			//regras de negocio
			Mapa mapa = new GoogleMaps();
			mapa.devolveMapa("Rua Episcopal");
			
			//....
			 
			RelogioDoSistema relogio = new RelogioDoSistema(); //Esconde
			Calendar hoje = relogio.hoje();
			
		}
}
