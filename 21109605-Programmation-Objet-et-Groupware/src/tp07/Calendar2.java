package tp07;

import java.util.Calendar;

public class Calendar2 extends Calendar {
	/**
	 * @author biard
	 */
	private static final long serialVersionUID = -4678782214854505434L;
	
	//attributs ajout�s
	protected boolean cours = false;
	Calendar calendar = super.getInstance();
	protected int month = (calendar.get(Calendar.MONTH)) + 1;
	
	//m�thodes ajout�es
	public void creation() {
		if (calendar.get(Calendar.DAY_OF_WEEK)==Calendar.THURSDAY) {
			if (calendar.get(Calendar.HOUR_OF_DAY)>=9) {
				if (calendar.get(Calendar.HOUR_OF_DAY)<=12) {
					cours = true;
				}
			}
		}
		System.out.println("Date de cr�ation de l'objet : ");
		System.out.println("Heure de cr�ation de l'objet : ");
	}
	public void afficher() {
		System.out.println("Date du jour : " + calendar.get(Calendar.DAY_OF_MONTH) + "/" + month + "/" + calendar.get(Calendar.YEAR));
		System.out.println("Heure actuelle : " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
	}
	public void duree() {
		
	}
	
	//m�thodes de Calendar
	@Override
	protected void computeTime() {
		
	}
	@Override
	protected void computeFields() {
		
	}
	@Override
	public void add(int field, int amount) {
		
	}
	@Override
	public void roll(int field, boolean up) {
		
	}
	@Override
	public int getMinimum(int field) {
		return 0;
	}
	@Override
	public int getMaximum(int field) {
		return 0;
	}
	@Override
	public int getGreatestMinimum(int field) {
		return 0;
	}
	@Override
	public int getLeastMaximum(int field) {
		return 0;
	}
	
	
}
