package tp06;

public class Reptile extends Animal {
	//ajout d'attributs propres à la sous-classe
		protected int nb_pattes = 4;
		protected boolean serpent = false;

		/**le constructeur de reptiles fait appel au constructeur de la sur-classe Animal*/
		public Reptile(String poils_plumes_écailles) { // les reptiles ont des écailles
			super(poils_plumes_écailles, "écailles");
		}

		/**présentation des caractéristiques du reptile*/
		public void présente() {

	//appel de la méthode de la sur-classe
			super.présente();
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
		
	//ajout d'une méthode propre à la sous-classe
		/**déplacement du reptile*/
		public void rampe() {
			System.out.println("Je rampe donc je suis un reptile");
		}
}
