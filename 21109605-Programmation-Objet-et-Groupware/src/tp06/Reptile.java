package tp06;

public class Reptile extends Animal {
	//ajout d'attributs propres � la sous-classe
		protected int nb_pattes = 4;
		protected boolean serpent = false;

		/**le constructeur de reptiles fait appel au constructeur de la sur-classe Animal*/
		public Reptile(String poils_plumes_�cailles) { // les reptiles ont des �cailles
			super(poils_plumes_�cailles, "�cailles");
		}

		/**pr�sentation des caract�ristiques du reptile*/
		public void pr�sente() {

	//appel de la m�thode de la sur-classe
			super.pr�sente();
			int pattes = nb_pattes;
			if (serpent == true) {
				nb_pattes = 0;
			}
			System.out.println("J'ai " + pattes + " pattes");
		}

		/**cri du reptile*/
		public void crie() {
			System.out.println("Je crie donc je suis");
		}
		
	//ajout d'une m�thode propre � la sous-classe
		/**d�placement du reptile*/
		public void rampe() {
			System.out.println("Je rampe donc je suis un reptile");
		}
}
