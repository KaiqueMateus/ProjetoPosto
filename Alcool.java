package calculos;

public class Alcool extends calculo {
		
		private float somalitalc;
		
		public Alcool(float somalitalc) {
			this.somalitalc = somalitalc;
		}
		@Override
		public float calc_comb() {
				return (float) (somalitalc * 5.69);
		}
}
