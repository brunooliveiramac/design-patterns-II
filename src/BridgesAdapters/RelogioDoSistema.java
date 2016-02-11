package BridgesAdapters;

import java.util.Calendar;

public class RelogioDoSistema implements RelogioGenerico {
	
	public Calendar hoje(){
		return  Calendar.getInstance();
	}

}
